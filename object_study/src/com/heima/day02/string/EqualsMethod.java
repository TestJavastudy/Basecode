package com.heima.day02.string;

public class EqualsMethod {
    private String userName;
    private String pwd;
    public EqualsMethod() {
    }

    public EqualsMethod(String userName, String pwd) {
        this.userName = userName;
        this.pwd = pwd;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
    public boolean compare(String userName,String pwd){
        if (this.userName.equals(userName) && this.pwd.equals(pwd)){
            return true;
        }else {
            return false;
        }
    }
}
