package edu.waynekeepo.je.domain.product;


import edu.waynekeepo.je.domain.DomainID;
import edu.waynekeepo.je.domain.client.Partner;
import edu.waynekeepo.je.domain.logistics.Delivery;

import java.math.BigInteger;
import java.util.List;

public class Order extends DomainID {
    private Partner partner;
    private Partner cook;
    private Delivery delivery;
    private BigInteger fullPrice; // prices sum from food and delivery
    private List<Food> foods;


    private void calculateFullPrice() {
        this.foods
                .stream()
                .map(Food::getPriceByCount)
                .reduce(BigInteger::add)
                .ifPresentOrElse(
                        sum -> this.fullPrice = sum,
                        null // TODO: should throw exception, add it in future
                );
    }

}
