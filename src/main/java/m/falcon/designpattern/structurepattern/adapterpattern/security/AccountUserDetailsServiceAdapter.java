package m.falcon.designpattern.structurepattern.adapterpattern.security;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AccountUserDetailsServiceAdapter implements UserDetailsService {
    private final AccountService accountService;

    @Override
    public UserDetails loadUserByName(String username) {
        Account foundAccount = this.accountService.findAccountByUserName(username);
        return new AccountUserDetailsAdapter(foundAccount);
    }
}
