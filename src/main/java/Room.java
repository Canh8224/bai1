public class Room {
    private String ID;
    private String Name;
    private int number;

    public Room(String ID,  String Name, int number) {
        this.ID = ID;
        this.Name = Name;
        this.number = number;
    }
    public String getID() {
        return ID;
    }
    public String getName() {
        return Name;
    }
    public int getNumber() {
        return number;
    }
}
