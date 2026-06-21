package MediatorDesignPattern;

import MediatorDesignPattern.CoreClasses.AuctionHouse;
import MediatorDesignPattern.CoreClasses.Bidder;

public class AuctionMediatorDemo {
    public static void main(String[] args) {
        AuctionMediator auctionMediator = new AuctionHouse();
        Bidder b1 = new Bidder("Alice",auctionMediator);
        Bidder b2 = new Bidder("Bob",auctionMediator);
        auctionMediator.addBidder(b1);
        auctionMediator.addBidder(b2);
        b1.placeBid(100);
        b2.placeBid(500);
    }
}
