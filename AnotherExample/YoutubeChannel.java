package AnotherExample;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel {
    private List<Subscriber> subscribers = new ArrayList<>();
    public String channelName;
    
    public YoutubeChannel(String channelName){
        this.channelName = channelName;
    }

    public void subscribe(Subscriber subscriber){
        subscribers.add(subscriber);
    }

    public void unsubscribe(Subscriber subscriber){
        subscribers.remove(subscriber);
    }

    public void uploadNewVideo(String videoTitle){
        System.out.println("\n" + channelName + " uploaded a new video : " + videoTitle);
        for(Subscriber subscriber: subscribers){
            subscriber.update(videoTitle);
        }
    }


}
