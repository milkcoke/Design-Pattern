package m.falcon.designpattern.structurepattern.adapterpattern.security;

public interface UserDetailsService {
    UserDetails loadUserByName(String username);
}
