import java.util.ArrayList;
import java.util.List;

public class ChatRoom {
    String roomName;
    List<User> members = new ArrayList<>();
    List<String> badWords = new ArrayList<>();
    List<User> mutedMember = new ArrayList<>();

    public ChatRoom(String roomName){
        this.roomName = roomName;
    }

    public void registerUser(User user){
        this.members.add(user);
    }

    public void sendBroadcast(User sender, String message){
        System.out.println("["+sender.getName()+"]: Memproses pengiriman pesan grup");
        System.out.print("[ChatRoom - General]");
        sender.send(filterMessage(message));

        for(int i = 0;  i < members.size() ; i++){
            if(!members.get(i).getName().equalsIgnoreCase(sender.getName())){
            
                if(!checkMemberStatus(sender)){
                    members.get(i).receiveMessage(sender, filterMessage(message));
                }
            }
        }
    }

    //tambah method untuk memerika aapakah user ini di muted atau tidak

    public boolean checkMemberStatus(User user){
        for ( int i = 0 ; i < mutedMember.size() ; i++){
            if(user.equals(mutedMember.get(i))){
                return true;
            }
        }
        return false;
    }

    public void sendPrivateMessage(User sender, String recipientName, String message){
        System.out.println("["+sender.getName()+"]: Mengirim Pesan private ke: "+recipientName+" .....");
        System.out.print("[Chatroom - General] (Private "+sender.getName()+"-> ");
        sender.sendPrivate(recipientName, filterMessage(message));
        System.out.println("");
    
        
        for(int i = 0 ; i < members.size() ; i++){
            if(members.get(i).getName().equalsIgnoreCase(recipientName)){
                User recipient = new User(members.get(i).getName());
                System.out.println("["+recipient.getName()+"] Menerima pesan privat dari "+sender.getName()+": "+filterMessage(message));
            }
        }
    }

    public void addBadwords(String word){
        badWords.add(word);
    }

    public String filterMessage(String message){
        ///ubah message menjadi array tersendiri
        String [] words = message.split(" ");

        for( int i = 0 ; i < badWords.size() ; i++){
            for(int j = 0 ; j < words.length ; j++){
                if(badWords.get(i).equalsIgnoreCase(words[j])){
                    return "********";
                }
            }
        }
        return message;
    }

    public void removeUser(User user){
        if(!user.equals(members.get(0))){
            members.remove(user);
        } else {
            members.remove(user);
            System.out.println("Anda Keluar Dari Grup !");
        }
    }
    
    public void muteUser(User user){
        if(!user.equals(members.get(0))){
            mutedMember.add(user);
        } else {
            System.out.println("Tidak bisa ngemute diri sendiri!");
        }
    }

}
