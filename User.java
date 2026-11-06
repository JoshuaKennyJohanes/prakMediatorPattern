import java.util.List;

public class User {
    String name;
    List<User> contacts;


    public User(String name){
        this.name = name;
    }

    public void sendMessage(User receiver, String message){
        System.out.println("["+name+"-> "+receiver.getName()+"] : "+message);
    }

    public void receiveMessage(User sender, String message){
        System.out.println("["+getName()+"] Menerima Pesan dari "+sender.getName()+": "+message);
    }

    public void addContact(User user){
        contacts.add(user);
    }

    public void sendGroupMessage(String message){
        for(int i = 0 ; contacts.size() ; i++){
            
        }
    }

    public String getName(){
        return this.name;
    }
}