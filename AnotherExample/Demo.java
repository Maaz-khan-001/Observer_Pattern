package AnotherExample;

public class Demo {
    public static void main(String[] args){
        YoutubeChannel channel = new YoutubeChannel("GreatLearning");

        User user1 = new User("Ahmad");
        User user2 = new User("Ali");
        User user3 = new User("Khan");

        channel.subscribe(user1);
        channel.subscribe(user2);
        channel.subscribe(user3);

        channel.uploadNewVideo("Lab Task toutorial");

        channel.unsubscribe(user1);

        channel.uploadNewVideo("Learn Observer Pattern");
    }
}
