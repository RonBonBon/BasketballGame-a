package com.arichafamily.java;

import java.util.Random;

/**
 * Created by Ron on 14/02/2017.
 */
public class Player {
    //properties:
    private String playerName;
    private int fieldShootPercent;
    protected int gamePoint = 0;

    //Constructors:
    public Player(String playerName, int fieldShootPercent) {
        this.playerName = playerName;
        this.fieldShootPercent = fieldShootPercent;
    }

    public Player() {
        this.playerName = IO.getString("Enter player name: ");
        this.fieldShootPercent = IO.getInt("Enter field shooting percent: ", 0, 100);
    }

    //Methods:
    public boolean shootForTwo(){
        int shoot = RandomUtils.getInt(0, 100);
        if (shoot < fieldShootPercent){
            gamePoint += 2;
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerName='" + playerName + '\'' +
                ", fieldShootPercent=" + fieldShootPercent +
                ", gamePoint=" + gamePoint +
                '}';
    }

    //getters and setters:
    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getFieldShootPercent() {
        return fieldShootPercent;
    }

    public void setFieldShootPercent(int fieldShootPercent) {
        this.fieldShootPercent = fieldShootPercent;
    }

    public int getGamePoint() {
        return gamePoint;
    }

    public void setGamePoint(int gamePoint) {
        this.gamePoint = gamePoint;
    }
}


