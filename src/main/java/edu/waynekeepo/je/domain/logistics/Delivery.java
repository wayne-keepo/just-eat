package edu.waynekeepo.je.domain.logistics;


import edu.waynekeepo.je.domain.DomainID;
import edu.waynekeepo.je.domain.client.Client;
import edu.waynekeepo.je.domain.product.Order;

//TODO: probably integrate with external delivery services
public class Delivery extends DomainID {
    private Client courier;
    private Client from;
    private Client to;
    private Order order;
}
