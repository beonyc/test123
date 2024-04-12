package org.example;

public enum Data {

    DATA("login", "password");

    private String login;
    private String password;

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    Data(String log, String pas) {
        this.login = log;
        this.password = pas;
    }
}
