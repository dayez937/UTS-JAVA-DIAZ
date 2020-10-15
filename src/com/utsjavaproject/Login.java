package com.utsjavaproject;

public class Login {
    private String Username;
    private String Password;
    private String inputUser;
    private String inputPass;

    Login (String Username, String Password, String inputUser, String inputPass){
        this.Username = Username;
        this.Password = Password;
        this.inputUser = inputUser;
        this.inputPass = inputPass;
    }

    public String getUsername() {
        return Username;
    }

    public String getPassword() {
        return Password;
    }

    public String getInputUser() {
        return inputUser;
    }

    public String getInputPass() {
        return inputPass;
    }
}
