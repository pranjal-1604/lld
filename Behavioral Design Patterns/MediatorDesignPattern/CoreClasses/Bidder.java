package MediatorDesignPattern.CoreClasses;

import MediatorDesignPattern.AuctionMediator;

public class Bidder {
    private final String name;
    private final AuctionMediator auctionMediator;

    public Bidder(String name, AuctionMediator auctionMediator) {
        this.name = name;
        this.auctionMediator = auctionMediator;
    }

    public String getName() {
        return name;
    }

    public void placeBid(int amount){
        auctionMediator.placeBid(this,amount);
    }

    public void receiveBid(Bidder bidder,int amount){
        System.out.println(name + " is notified: " + bidder.getName() +
                " placed a bid of " + amount);
    }
}
