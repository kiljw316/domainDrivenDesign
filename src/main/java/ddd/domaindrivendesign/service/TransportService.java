package ddd.domaindrivendesign.service;

import ddd.domaindrivendesign.vo.Baggage;
import ddd.domaindrivendesign.vo.PhysicalDistributionBase;

public class TransportService {

    public void transport(PhysicalDistributionBase from, PhysicalDistributionBase to, Baggage baggage) {
        Baggage shippedBaggage = from.ship(baggage);
        to.receive(shippedBaggage);

    }
}
