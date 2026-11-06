
public class User {
    String name;
    
    public User(String name){
        this.name = name;
    }

    public void sendMessage(User receiver, String message){
        System.out.println("["+name+"-> "+receiver.getName()+"] : "+message);
    }

    public void receiveMessage(User sender, String message){
        System.out.println("["+getName()+"] Menerima Pesan dari "+sender.getName()+": "+message);
    }

    public void setChatRoom(ChatRoom chatRoom){
        chatRoom.registerUser(this);
    }

    public void send(String message){
        System.out.print("(Broad Cast Dari "+getName()+"): "+message);
        System.out.println("");
    }

    public void sendPrivate(String recipientName, String message){
        System.out.print("Cici ): "+message);
    }

    public String getName(){
        return this.name;
    }
}