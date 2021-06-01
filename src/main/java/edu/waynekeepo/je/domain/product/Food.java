package edu.waynekeepo.je.domain.product;

import edu.waynekeepo.je.domain.DomainID;
import lombok.Getter;

import java.math.BigInteger;

@Getter
public class Food extends DomainID {
    private String title;
    private Recipe foodRecipe;
    private BigInteger price;
    private Integer count;

    public BigInteger getPriceByCount() {
        return this.price.multiply(BigInteger.valueOf(count));
    }

}
