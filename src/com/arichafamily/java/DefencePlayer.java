package com.arichafamily.java;

/**
 * Created by Ron on 14/02/2017.
 */
public class DefencePlayer extends Player {
    private int nunOfFouls = 0;

    public DefencePlayer(){
        super();
    }

    public DefencePlayer(String playerName, int fieldShootPercent) {
        super(playerName, fieldShootPercent);
    }

    public void doFoul(){
        nunOfFouls++;
        System.out.println("Tackled");
    }

    @Override
    public String toString() {
        return "DefencePlayer{" +
                "nunOfFouls=" + nunOfFouls +
                '}';
    }
}
