package com.arichafamily.java;

import java.util.Random;

/**
 * Created by Ron on 14/02/2017.
 */
public class OffencePlayer extends Player {
    int lineShootPercent = 0;

    public OffencePlayer(){
        super();
        this.lineShootPercent = IO.getInt("Enter shoot percent from three: ");
    }

    public OffencePlayer(String playerName, int fieldShootPercent, int lineShootPercent) {
        super(playerName, fieldShootPercent);
        this.lineShootPercent = lineShootPercent;
    }

    public boolean shootForThree(){
        int shoot = RandomUtils.getInt(0, 100);
        if (shoot < lineShootPercent){
            gamePoint += 3; //Protected accessible with inheritance
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "OffencePlayer{" +
                "lineShootPercent=" + lineShootPercent +
                '}';
    }
}
