package ddd.domaindrivendesign.vo;

public class PhysicalDistributionBase {

    public Baggage ship(Baggage baggage) {
        return baggage;
    }

    public void receive(Baggage baggage) {
    }

    public void transport(PhysicalDistributionBase to, Baggage baggage) {
        Baggage shippedBaggage = ship(baggage);
        to.receive(shippedBaggage);
    }

}
