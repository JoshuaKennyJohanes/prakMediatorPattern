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
        newChatRoom.registerUser(budi); //berarti budi admin
        newChatRoom.registerUser(andi);
        newChatRoom.registerUser(ujang);
        newChatRoom.registerUser(hana);

        //bikin badwords yang akan disensor nanti di chatroom
        newChatRoom.addBadwords("goblok");
        newChatRoom.addBadwords("anjing");
        newChatRoom.addBadwords("ngentod");


        //coba private message
        newChatRoom.sendBroadcast(budi, "Halo Semuanya!");
        newChatRoom.sendPrivateMessage(budi, "hana", "Rahasisa ya ini!");


        //coba badwords message
        newChatRoom.sendBroadcast(andi, "ngentod lu semua!");


        //coba muted member
        newChatRoom.muteUser(hana);

        //coba hana kirip
        newChatRoom.sendBroadcast(hana, "Halo aku dimute!");


    }
}
