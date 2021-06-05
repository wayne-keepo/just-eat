package edu.waynekeepo.je.domain.logistics;


import edu.waynekeepo.je.domain.base.DomainID;
import edu.waynekeepo.je.domain.client.Partner;
import edu.waynekeepo.je.domain.Order;

//TODO: probably integrate with external delivery services
public class Delivery extends DomainID {
    private Partner courier;
    private Partner from;
    private Partner to;
    private Order order;
}
