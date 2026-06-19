package ObserverDesignPattern;

import ObserverDesignPattern.ConcreteSubscribers.EmailSubscriber;
import ObserverDesignPattern.ConcreteSubscribers.PushNotificationSubscriber;
import ObserverDesignPattern.ConcreteSubscribers.YoutubeSubscriber;
import ObserverDesignPattern.Interfaces.Subscriber;

public class Main {
    public static void main(String[] args) {
        Subscriber youtubeSubscriber = new YoutubeSubscriber("Pranjal");
        Subscriber emailSubscriber = new EmailSubscriber("pranjal.123@gmail.com");
        Subscriber pushNotificationSubscriber = new PushNotificationSubscriber("mobile");
        YoutubeChannelImpl youtubeChannel= new YoutubeChannelImpl();
        youtubeChannel.addSubscriber(youtubeSubscriber);
        youtubeChannel.addSubscriber(emailSubscriber);
        youtubeChannel.addSubscriber(pushNotificationSubscriber);
        youtubeChannel.uploadVideo("LLD");

    }
}

