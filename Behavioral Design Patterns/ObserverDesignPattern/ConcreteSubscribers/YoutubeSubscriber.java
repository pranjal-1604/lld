package ObserverDesignPattern.ConcreteSubscribers;

import ObserverDesignPattern.Interfaces.Subscriber;

public class YoutubeSubscriber implements Subscriber {
    private final String name;
    public YoutubeSubscriber(String name){
        this.name = name;
    }

    @Override
    public void update(String video) {
        System.out.println(name + " is watching " + video);
    }
}
