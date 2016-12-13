package com.example.user.topten;

public class Player {

    private String name;
    private String nickname;
    private int ranking;

    public Player(String name, String nickname, int ranking) {
        this.name = name;
        this.nickname = nickname;
        this.ranking = ranking;
    }

    public String getName() {
        return this.name;
    }

    public String getNickName() {
        return this.nickname;
    }

    public int getRanking() {
        return this.ranking;
    }

    public String getFullDetails() {
        return "Name: "+ this.name + ", Nickname: " + this.nickname + ", Ranking: " + this.ranking;
    }

}
