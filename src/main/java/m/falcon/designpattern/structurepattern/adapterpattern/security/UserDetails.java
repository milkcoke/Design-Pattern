package m.falcon.designpattern.structurepattern.adapterpattern.security;

// Spring Security 내에 사용
public interface UserDetails {
    String getUserName();

    String getPassword();
}
