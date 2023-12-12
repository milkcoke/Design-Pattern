package m.falcon.designpattern.structure.adapter.security;

import java.util.Arrays;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class AdapterInJava {
    public static void main(String[] args) {
        // 배열을 List 로 변환함.

        // 인자: 가변인자 varargs (내부적으로는 배열)
        // 반환: List
        String[] champNames = new String[]{"카르마", "럼블", "바이"};

        // 서로 상이한 Interface
        // List<String> 은 Target
        // Arrays.asList() 는 Adapter
        // champNames 는 Adaptee
        List<String> champNameList = Arrays.asList(champNames);

        // 반환된 Enumeration<String> 은 Target
        // Collections.enumeration() 는 Adapter,
        // ChampNameList 는 Adaptee ,
        Enumeration<String> enumeration = Collections.enumeration(champNameList);
    }
}
