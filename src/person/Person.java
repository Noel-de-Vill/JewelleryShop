package person;

import product.Product;

public abstract class Person {
    String name;
    String login;
    String password;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String email) {
        this.name = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Person(String name, String login, String password) {
        this.name = name;
        this.login = login;
        this.password = password;
    }

}
