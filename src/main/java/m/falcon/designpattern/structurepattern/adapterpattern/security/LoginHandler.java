package m.falcon.designpattern.structurepattern.adapterpattern.security;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class LoginHandler {
    private final UserDetailsService userDetailsService;

    public String login(String username, String password) {
        // 입력한 이름과 비번이 맞으면 return
        UserDetails userDetails = userDetailsService.loadUserByName(username);

        if (userDetails.getPassword().equals(password)) {
            return userDetails.getUserName();
        } else {
            throw new IllegalArgumentException();
        }
    }

}
