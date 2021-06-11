package edu.waynekeepo.je.domain.product;

import edu.waynekeepo.je.domain.base.DomainID;
import lombok.Getter;
import lombok.Setter;

// TODO: think about how best to model this class
@Getter
@Setter
public class RawProduct extends DomainID {
    private String title;
    private long grams; // avg value
    private long calories; // avg value
    // TODO FUTURE: may be add type; tags

}
