package m.falcon.designpattern.structurepattern.adapterpattern.security;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Account {
    private String name;
    private String password;
    private String email;
}
