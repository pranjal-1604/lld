package ObserverDesignPattern.ConcreteSubscribers;

import ObserverDesignPattern.Interfaces.Subscriber;

public class PushNotificationSubscriber implements Subscriber {
    private final String device;
    public PushNotificationSubscriber(String device){
        this.device = device;
    }

    @Override
    public void update(String video) {
        System.out.println("Sending push notification to: " + device + " new video uploaded : " + video);
    }
}
