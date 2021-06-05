package edu.waynekeepo.je.domain.client;


import edu.waynekeepo.je.domain.DomainID;
import edu.waynekeepo.je.domain.product.RawProduct;
import edu.waynekeepo.je.domain.product.Recipe;

import java.util.List;

public class Partner extends DomainID {
    private FullName fullName;
    private PartnerType partnerTypes;
    private Contacts contacts;
    private List<Recipe> recipes; // TODO: think about it
    private List<RawProduct> productsStock; // TODO: think about it

}