package edu.waynekeepo.je.domain.client;


import edu.waynekeepo.je.domain.base.DomainID;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Partner extends DomainID {
    private FullName fullName;
    private PartnerType partnerType;
    private Contacts contacts;
    private PartnerBag bag;

    public enum PartnerType {
        USER,
        COOK,
        COURIER
    }
}
