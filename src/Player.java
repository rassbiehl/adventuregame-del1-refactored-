/* CLASS RESPONSIBILITY: Playerklassen er selve spilleren. Den kender sin egen position klassen Map,
og den sporer sit nuværende rum, og kontrollerer sine bevægelser i forhold til Map */

public class Player {
    private String userName;
    private Room currentRoom;

    /*Constructor. You can't decide the player's current room from start,
    since the player-class is not directly linked to the mapclass. That's why i set startingRoom as a parameter for later use.*/
    public Player(Room startingRoom) {
        this.currentRoom = startingRoom;
    }


    // GETMETHODS--------------------------------------------------------------------------------------------------------
    /* Gets the currentRoom for player. the player's currentRoom is initialized in adventureClass, and in order to
    use it, i have to create a get method for it in this class.
     */
    public Room getCurrentRoom() {
        return currentRoom;
    }

    //get method for the currentrooms name.
    public String getCurrentRoomName() {
        return currentRoom.getRoomName();
    }

    //gets username for a player.
    public String getUserName() {
        return userName;
    }


    // SETMETHODS--------------------------------------------------------------------------------------------------------

    public void setPlayerName(String newName) {
        userName = newName;
    }

    /* Keeps track of the player's currentRoom based on userChoice (scanner-string). It makes most sense to do it in
    this class, as it holds all the information needed in relation to the player's currentRoom;*/
    public boolean changeCurrentRoom(String input) {
        Room newRoom = null;

        switch (input.toLowerCase()) {
            case "go north":
            case "north":
            case "n":
                newRoom = currentRoom.getNorth();
                break;
            case "go south":
            case "south":
            case "s":
                newRoom = currentRoom.getSouth();
                break;
            case "go east":
            case "east":
            case "e":
                newRoom = currentRoom.getEast();
                break;
            case "go west":
            case "west":
            case "w":
                newRoom = currentRoom.getWest();
                break;
            default:
                return false;
        }

        if (newRoom != null) {
            currentRoom = newRoom;
            return true;
        } else {
            return false;
        }

    }


}
