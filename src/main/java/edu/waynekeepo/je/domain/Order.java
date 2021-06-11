package edu.waynekeepo.je.domain;


import edu.waynekeepo.je.domain.base.DomainID;
import edu.waynekeepo.je.domain.client.Partner;
import edu.waynekeepo.je.domain.product.Food;
import lombok.Getter;
import lombok.Setter;

import java.math.BigInteger;
import java.util.List;

@Getter
@Setter
public class Order extends DomainID {
    private Partner partner;
    private Partner cook;
//    private Delivery delivery;
    private BigInteger fullPrice; // prices sum from food and delivery
    private List<Food> foods;

}
