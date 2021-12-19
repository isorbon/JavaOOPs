package com.syntax.TeamProject02.Task05;

     /* Create Registration Class in which you would have variables as email, userName
        and password that have an access scope only within its own class. After creating an
        object of the class user should be able to call methods and in each method
        separately pass values to set users email, username and password.
        Requirements:
        A. Valid email consider to be only yahoo
        B. Valid userName and password cannot be empty and should be of length larger than
        6 characters. Also, valid password cannot contain userName.*/

public class Registration {
    private String email, userName, password;

  public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.toLowerCase().contains("@yahoo.com")) {
            System.out.println("Your email: " + (this.email = email));
        } else {
            System.out.println("Valid email address only counts on Yahoo!");
        }
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        if (userName.length() > 6) {
            System.out.println("Your username: " + (this.userName = userName));
        } else {
            System.out.println("The Username should be larger than 6 characters");
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if (password.length() > 6) {
            if (password.contains(userName)) {
                System.out.println("The Password cannot contain Username");
            } else {
                this.password = password;
            }
        } else {
            System.out.println("The Password should be larger than 6 characters");
        }
    }

    void hiddenPassword(){
        System.out.println("Your password is hidden: " + getPassword().replaceAll("[^ ]", "*"));
    }
}
