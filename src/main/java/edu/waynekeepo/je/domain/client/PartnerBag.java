package edu.waynekeepo.je.domain.client;

import edu.waynekeepo.je.domain.base.DomainID;
import edu.waynekeepo.je.domain.product.Food;
import edu.waynekeepo.je.domain.product.RawProduct;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class PartnerBag extends DomainID {
    private List<Food> foods; // food that partner can cook
    private List<RawProduct> stock; // TODO: think about it, products that partner have
}
