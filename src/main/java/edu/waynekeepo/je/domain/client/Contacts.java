package edu.waynekeepo.je.domain.client;


import edu.waynekeepo.je.domain.DomainID;
import edu.waynekeepo.je.domain.communication.PhoneNumber;
import edu.waynekeepo.je.domain.location.ClientAddress;

public class Contacts extends DomainID {
    private ClientAddress address; // TODO: проработать
    private PhoneNumber phoneNumber;
}
