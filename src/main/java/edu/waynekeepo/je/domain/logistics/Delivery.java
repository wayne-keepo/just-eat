package edu.waynekeepo.je.domain.logistics;


import edu.waynekeepo.je.domain.base.DomainID;
import edu.waynekeepo.je.domain.client.Partner;
import edu.waynekeepo.je.domain.Order;
import lombok.Getter;
import lombok.Setter;

//TODO: probably integrate with external delivery services
@Getter
@Setter
public class Delivery extends DomainID {
    private Partner courier;
    private Partner from;
    private Partner to;
    private Order order;
}
