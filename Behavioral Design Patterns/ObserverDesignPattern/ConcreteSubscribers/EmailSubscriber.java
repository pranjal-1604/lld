package ObserverDesignPattern.ConcreteSubscribers;

import ObserverDesignPattern.Interfaces.Subscriber;

public class EmailSubscriber implements Subscriber {

    private final String email;
    public EmailSubscriber(String email){
        this.email = email;
    }
    @Override
    public void update(String video) {
        System.out.println("Sending email to " + email + " new video uploaded: " + video);
    }
}
