package domain;

import java.io.Serializable;

/**
 * Created by Hao HOU on 2017/5/14.
 */
public class Login implements Serializable {
    private static final long serialVersionUID = 4082412128706019531L;

    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
