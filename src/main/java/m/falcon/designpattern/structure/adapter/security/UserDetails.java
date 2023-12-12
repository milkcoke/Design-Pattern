package m.falcon.designpattern.structure.adapter.security;

// Spring Security 내에 사용
public interface UserDetails {
    String getUserName();

    String getPassword();
}
