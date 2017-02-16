package com.arichafamily.java;

import jdk.nashorn.internal.ir.annotations.Ignore;

import java.util.ArrayList;

/**
 * Created by Bosnia on 15/02/2017.
 */
public class BasketballTeam {
    private ArrayList<Player> basketballTeam = new ArrayList<>();

    public void addPlayer(Player p){
        basketballTeam.add(p);
    }

    public void addPlayer(){
        int choice = IO.getInt("Which player to add?\n" +
                                "1) Offence Player\n" +
                                "2) Defence Player", 1, 2);
        if (choice == 1){
            basketballTeam.add(new OffencePlayer());
        }
        else if (choice == 2){
            basketballTeam.add(new DefencePlayer());
        }
    }

    public void removePlayer(Player p){
        basketballTeam.remove(p);
    }

    public void removePlayer(String name){
        for (Player p : basketballTeam){
            if (p.getPlayerName().equalsIgnoreCase(name)){
                basketballTeam.remove(p);
            }
        }
    }

    public void printAllPlayers(){
        System.out.println(basketballTeam);
    }
}
