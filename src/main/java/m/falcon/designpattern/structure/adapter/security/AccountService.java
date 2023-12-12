package m.falcon.designpattern.structure.adapter.security;

import java.util.HashMap;

// Account - AccountService 는 여기서만 씀
public class AccountService {
    private HashMap<String, Account> accountHashMap = new HashMap();
    public Account createByUserName(String userName) {
        Account account = new Account(userName, userName, userName);
        this.accountHashMap.put(userName, account);
        return account;
    }

    public Account findAccountByUserName(String userName) {
        return this.accountHashMap.get(userName);
    }

    public void updateAccount(Account account) {

    }
}
