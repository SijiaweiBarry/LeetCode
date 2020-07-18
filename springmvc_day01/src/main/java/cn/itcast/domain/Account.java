package cn.itcast.domain;

/**
 * @Author SijiaweiBarry
 * @create 2020/2/8 11:45
 */
public class Account {
    private String username;
    private Double money;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Account{" +
                "username='" + username + '\'' +
                ", money=" + money +
                ", password='" + password + '\'' +
                '}';
    }
}
