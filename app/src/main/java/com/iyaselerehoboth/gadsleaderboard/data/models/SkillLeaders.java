package com.iyaselerehoboth.gadsleaderboard.data.models;

public class SkillLeaders {

    private String name;
    private String score;
    private String country;
    private String badgeUrl;

    public SkillLeaders(String name, String score, String country, String badgeUrl) {
        this.name = name;
        this.score = score;
        this.country = country;
        this.badgeUrl = badgeUrl;
    }

    public String getName() {
        return name;
    }

    public String getScore() {
        return score;
    }

    public String getCountry() {
        return country;
    }

    public String getBadgeUrl() {
        return badgeUrl;
    }
}
