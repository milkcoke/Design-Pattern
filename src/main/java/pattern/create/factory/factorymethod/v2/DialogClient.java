package pattern.create.factory.factorymethod.v2;

import lombok.RequiredArgsConstructor;
import pattern.create.factory.factorymethod.v2.factory.MacDialog;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DialogClient {
  public static void main(String[] args) {
    String osName = System.getProperty("os.name");
    //FIXME: 무엇을 생성할지, 무슨 클래스를 만들지
    //  이런식으로 클라이언트에게 위임하면 Factory 를 쓰는 의미가 없다.
   OsType osType =  OsType.from(osName);
    if (osType == OsType.MAC) {
      new MacDialog().render();
    }
  }

  @RequiredArgsConstructor
  enum OsType {
    WINDOWS("windows"),
    MAC("Mac OS X"),
    LINUX("linux"),
    WEB("web");
    private final String osTypeStr;
    private final static Map<String, OsType> map = Arrays.stream(values())
      .collect(Collectors.toMap(o -> o.osTypeStr, Function.identity()));
    public static OsType from(String osTypeStr) {
      OsType osType = map.get(osTypeStr);
      if(osType == null) throw new IllegalArgumentException("Unsupported OS type: " + osTypeStr);
      return osType;
    }

  }
}
