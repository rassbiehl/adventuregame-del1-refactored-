/* CLASS RESPONSIBILITY: this class handles the user's input and will inform the user about the game (output)*/

import java.util.Scanner;


public class UI {
    private Adventure adventure;
    private Scanner scanner;


    public UI() {
        adventure = new Adventure();
        scanner = new Scanner(System.in);
    }


    public void startGame() {
        gameIntro();
        boolean gameOver = false;
        while (!gameOver) {
            System.out.println("Now what will you do?");
            String newChoice = scanner.nextLine();
            switch (newChoice.toLowerCase()) {
                case "help":
                    userGuide();
                    break;
                case "look":
                    lookAround();
                    break;
                case "move":
                    move();
                    break;
                case "exit":
                    System.out.println("You have now quit the game.");
                    gameOver = true;
                    break;
                default:
                    System.out.println("Unvalid input. Try again.");
            }
        }
    }


    //prints the userguide.
    public void userGuide() {
        System.out.println("\"help\" - get instructions and an overview of possible commands.");
        System.out.println("\"look\" - get a description of the room you are currently in.");
        System.out.println("\"move\" - move to a new room in a path of your choice.");
        System.out.println("\"exit\" - quit the game.");
    }

    public void lookAround() {
        System.out.println("*Looks around* " + adventure.getPlayerCurrentRoom()); //Room objektet har en toString metode.
    }

    public void move() {
        System.out.println("Where do you want to go? \"go\" + <Destination: (N) North, (S) South, (E) East or (W) West or (C) Cancel");
        String input = scanner.nextLine();
        boolean roomChange = adventure.changePlayerRoom(input);
        if (!roomChange) {
            System.out.println("You can't go that way! You must choose another path");
        } else {
            System.out.println(adventure.getPlayerCurrentRoom());
        }
    }

    //gives the player an introduction. is used at the start of the game.
    public void gameIntro() {
        System.out.println("Choose your username:");
        String newUserName = scanner.nextLine();
        adventure.setPlayerName(newUserName);
        System.out.println("Welcome " + adventure.getPlayerName() + ".");
        System.out.println("You are currently at: " + adventure.getPlayerCurrentRoomName() + "." + "\n");
        System.out.println("Here is a quick guide, to help you carry through this game:");
        userGuide();
        System.out.println("\n Good luck on your journey.");
    }


}


