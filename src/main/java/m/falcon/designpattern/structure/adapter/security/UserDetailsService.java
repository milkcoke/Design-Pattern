package m.falcon.designpattern.structure.adapter.security;

public interface UserDetailsService {
    UserDetails loadUserByName(String username);
}
