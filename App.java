public class App {
    public static void main(String[] args) {
        //bikin dulu 2 user
        User budi = new User("Budi");
        User andi = new User("Andi");


        //Program kirim pesan dan terima pesan
        String message = "Halo Andi!";
        budi.sendMessage(andi, message);
        andi.receiveMessage(budi, message);
        
    }
}
