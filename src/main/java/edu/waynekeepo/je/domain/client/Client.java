package edu.waynekeepo.je.domain.client;


import edu.waynekeepo.je.domain.DomainID;
import edu.waynekeepo.je.domain.product.RawProduct;
import edu.waynekeepo.je.domain.product.Recipe;

import java.util.List;

public class Client extends DomainID {
    private FullName fullName;
    private PartnerType clientTypes;
    private Contacts contacts;
    private List<Recipe> recipes; // TODO: проработать
    private List<RawProduct> productsStock; // TODO: проработать

}
