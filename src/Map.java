/*CLASS RESPONSIBILITY: Map is the class that initializes the rooms and connects them.
It builds the map for the game */

public class Map {
    private Room room1;
    private Room room2;
    private Room room3;
    private Room room4;
    private Room room5;
    private Room room6;
    private Room room7;
    private Room room8;
    private Room room9;
    private Room startingRoom;

    //Constructor, that by standard links all the rooms together in the desired way with the buildWorld-method.
    public Map() {
        buildWorld();
    }

    //buildWorld-method that initializes all the rooms and links them together as neighbors.
    public void buildWorld() {
        room1 = new Room("the Starting Point", "");
        room2 = new Room("Room2", "You are in room 2.");
        room3 = new Room("Room3", "You are in room 3.");
        room4 = new Room("Room4", "You are in room 4.");
        room5 = new Room("Room5", "You are in room 5.");
        room6 = new Room("Room6", "You are in room 6.");
        room7 = new Room("Room7", "You are in room 7.");
        room8 = new Room("Room8", "You are in room 8.");
        room9 = new Room("Room9", "You are in room 9.");
        room1.setNeighbor(null, room4, room2, null);
        room2.setNeighbor(null, null, room3, room1);
        room3.setNeighbor(null, room6, null, room2);
        room4.setNeighbor(room1, room7, null, null);
        room5.setNeighbor(null, room8, null, null);
        room6.setNeighbor(room3, room9, null, null);
        room7.setNeighbor(room4, null, room8, null);
        room8.setNeighbor(room5, null, room9, room7);
        room9.setNeighbor(room6, null, null, room8);
        startingRoom = room1;
    }

    // GETMETHODS ------------------------------------------------------------------------------------------------------

    public Room getStartingRoom() {
        return startingRoom;
    }

}
