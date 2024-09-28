//Class RESPONSIBILITY: This class creates rooms and defines them.

public class Room {
    private Room north, south, east, west;
    private final String roomName;
    private String description;

    //Constructor
    public Room(String roomName, String description) {
        this.roomName = roomName;
        this.description = description;
    }

    //SETMETHODS-----------------------------------------------------------------------------------------------------------

    //Setmethod for choosing the neighbors
    public void setNeighbor(Room north, Room south, Room east, Room west) {
        this.north = north;
        this.south = south;
        this.east = east;
        this.west = west;
    }

    //GETMETHODS-------------------------------------------------------------------------------------------------------

    //getmethod for finding name of the room.
    public String getRoomName() {
        return roomName;
    }

    //getmethod for finding a rooms neighbor
    public Room getNorth() {
        return north;
    }

    public Room getSouth() {
        return south;
    }

    public Room getEast() {
        return east;
    }

    public Room getWest() {
        return west;
    }

    //toString method
    @Override
    public String toString() {
        return "You are now in " + roomName + ". Description: " + description;
    }
}

