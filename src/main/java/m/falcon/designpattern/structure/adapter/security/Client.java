package m.falcon.designpattern.structure.adapter.security;

public class Client {
    public static void main(String[] args) {
        AccountService accountService = new AccountService();
        accountService.createByUserName("khazix");
        accountService.createByUserName("vladimir");

        UserDetailsService userDetailsService = new AccountUserDetailsServiceAdapter(accountService);

        LoginHandler loginHandler = new LoginHandler(userDetailsService);

        String loginUserName = loginHandler.login("khazix", "khazix");
        System.out.println("userName : " + loginUserName);

    }
}
