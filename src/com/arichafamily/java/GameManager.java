package com.arichafamily.java;

/**
 * Created by Bosnia on 15/02/2017.
 */
public class GameManager {
    BasketballTeam team = new BasketballTeam();

    public void start() {
        int userChoice = -1;
        while (userChoice != 4) {
           String message = "1) Add player to team\n" +
                            "2) Show team players\n" +
                            "3) Delete player from team\n" +
                            "4) Quit\n";

            userChoice = IO.getInt(message);

            if (userChoice == 1){
                team.addPlayer();
            }
            else if(userChoice == 2) {
                team.printAllPlayers();
            }
            else if (userChoice == 3) {
                //library.showBooksByTitle(IO.getString("Enter Title to Search"));
            }
            else if(userChoice == 4) {
                //library.showBooksByAuthor(IO.getString("Enter Author:"));
            }
        }

    }
}
