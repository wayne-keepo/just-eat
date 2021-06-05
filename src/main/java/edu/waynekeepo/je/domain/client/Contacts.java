package edu.waynekeepo.je.domain.client;


import edu.waynekeepo.je.domain.DomainID;
import edu.waynekeepo.je.domain.communication.PhoneNumber;
import edu.waynekeepo.je.domain.location.PartnerAddress;

public class Contacts extends DomainID {
    private PartnerAddress address;
    private PhoneNumber phoneNumber;
}
