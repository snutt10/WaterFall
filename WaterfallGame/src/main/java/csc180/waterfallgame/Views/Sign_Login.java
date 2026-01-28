package csc180.waterfallgame.Views;

import java.io.BufferedReader;
import java.io.IOException;

public class Sign_Login {
    private String userName, password;
    private int buttons;
BufferedReader bread;


    //region getters and setters


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    //endregion
    public void login(String name, String password) {
        //TODO: implement logic
//still using password?
        System.out.println("Please enter your username: ");

       try {
           userName = bread.readLine();
       } catch (IOException e) {
           throw new RuntimeException(e);
       }

    }

    public void signIn(String name, String password) {
        //TODO: implement logic
    }

    public void loginOrSignIn() {
//using only login?

    }
}
