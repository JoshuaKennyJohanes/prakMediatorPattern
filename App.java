public class App {
    public static void main(String[] args) {
        //bikin dulu 5 user
        User budi = new User("Budi");
        User andi = new User("Andi");
        User ujang = new User("Ujang");
        User hana = new User("Hana");



        //Program kirim pesan dan terima pesan private chat biasa
        // String message = "Halo Andi!";
        // budi.sendMessage(andi, message);
        // andi.receiveMessage(budi, message);


        //bikin Group
        ChatRoom newChatRoom = new ChatRoom("Group IF");
        newChatRoom.registerUser(budi);
        newChatRoom.registerUser(andi);
        newChatRoom.registerUser(ujang);
        newChatRoom.registerUser(hana);

        newChatRoom.sendBroadcast(budi, "Halo Semuanya!");
    }
}
