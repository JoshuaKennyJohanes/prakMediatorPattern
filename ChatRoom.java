import java.util.ArrayList;
import java.util.List;

public class ChatRoom {
    String roomName;
    List<User> members = new ArrayList<>();
    
    public ChatRoom(String roomName){
        this.roomName = roomName;
    }

    public void registerUser(User user){
        this.members.add(user);
    }

    public void sendBroadcast(User sender, String message){
        System.out.println("["+sender.getName()+"]: Memproses pengiriman pesan grup");
        System.out.println("[ChatRoom - General] (Broadcast dari "+sender.getName()+"): "+message);

        for(int i = 0;  i < members.size() ; i++){
            members.get(i).receiveMessage(sender, message);
        }

    }

}
