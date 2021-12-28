package com.syntax.ReviewClass.review10;

class FacebookAccount {
    private String userName;
    private String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {

        if(userName.length()>8){
            System.out.println("UserName can't be more than 8 characters");
        }else {
            this.userName = userName;
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
