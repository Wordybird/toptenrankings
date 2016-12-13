package com.example.user.topten;

public class Ranking {

    private PlayerRankings[] ranking;

    public Ranking () {
        this.ranking = new PlayerRankings[9];
    }

    public int rankingCount() {
        int count = 0;
        for (PlayerRankings rankings : ranking) {
            if (ranking != null) {
                count++;
            }
        }
        return count;
    }

    public String getAllRankings() {
        for (int i = 0; i < 9; i++) {
            return this.ranking.toString();
        }
    }

    }

}
