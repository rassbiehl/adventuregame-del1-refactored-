/* CLASS RESPONSIBILITY: this class will run the game itself. it manages the player and the world map.
whenever interface has read the user's input, it is the Adventure-class that will handle this information.
It works as the controller.
 */


public class Adventure {
    private Map map;
    private Player player1;

    //Constructor that by-standard sets the player's current Room in the start to the StartingRoom. It also creates a new map.
    public Adventure() {
        map = new Map();
        player1 = new Player(map.getStartingRoom());
    }

    // GETMETHODS--------------------------------------------------------------------------------------------------------
    //gets the current room for player1.
    public Room getPlayerCurrentRoom() {
        return player1.getCurrentRoom();
    }

    // gets the name for player1.
    public String getPlayerName() {
        return player1.getUserName();
    }

    // gets the name of player1's current room
    public String getPlayerCurrentRoomName() {
        return player1.getCurrentRoomName();
    }

    // SETMETHODS--------------------------------------------------------------------------------------------------------
    public boolean changePlayerRoom(String input) {
        boolean roomChange = player1.changeCurrentRoom(input);
        return roomChange;
    }

    public void setPlayerName(String newName) {
        player1.setPlayerName(newName);
    }

}
