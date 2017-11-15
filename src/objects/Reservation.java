package objects;

public class Reservation{
    private int messageID;
    private int senderID;
    private int receiverID;
    private int bikeID;

    private Customer sender;
    private Manager receiver;


    public String toString(){
        return User.getUserByID(senderID).getName() + " has reserved a bike";
    }

}