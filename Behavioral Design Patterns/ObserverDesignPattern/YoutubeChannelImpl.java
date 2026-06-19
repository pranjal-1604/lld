package ObserverDesignPattern;

import ObserverDesignPattern.Interfaces.Subscriber;
import ObserverDesignPattern.Interfaces.YoutubeChannel;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannelImpl implements YoutubeChannel {
    private final List<Subscriber> subscribers = new ArrayList<>();
    String video;

    @Override
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void removeSubscriber(Subscriber subscriber) {
      subscribers.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
         for(Subscriber subscriber: subscribers){
             subscriber.update(video);
         }
    }
    public void uploadVideo(String video){
        this.video = video;
        notifySubscribers();
    }
}
