package com.twschool.practice.domain;

public class UserInfo {
    private String userName;
    private int score = 0;

    public UserInfo(String userName) {
        this.userName = userName;
    }

    public String getUserName() {
        return userName;
    }

    public int getScore() {
        return score;
    }
}
