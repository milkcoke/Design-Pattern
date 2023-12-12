package m.falcon.designpattern.structure.adapter.security;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AccountUserDetailsAdapter implements UserDetails {
    private final Account account;

    @Override
    public String getUserName() {
        return this.account.getName();
    }

    @Override
    public String getPassword() {
        return this.account.getPassword();
    }
}
