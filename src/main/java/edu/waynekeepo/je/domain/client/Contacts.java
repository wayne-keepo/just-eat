package edu.waynekeepo.je.domain.client;


import edu.waynekeepo.je.domain.base.DomainID;
import edu.waynekeepo.je.domain.communication.PhoneNumber;
import edu.waynekeepo.je.domain.location.PartnerAddress;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Contacts extends DomainID {
    private PartnerAddress address;
    private PhoneNumber phoneNumber;
}
