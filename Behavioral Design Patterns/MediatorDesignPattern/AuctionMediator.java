package MediatorDesignPattern;

import MediatorDesignPattern.CoreClasses.Bidder;

public interface AuctionMediator {
    void addBidder(Bidder bidder);
    void placeBid(Bidder bidder,int amount);
}
