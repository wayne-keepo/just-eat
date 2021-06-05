package edu.waynekeepo.je.domain.product;

import edu.waynekeepo.je.domain.base.DomainID;

import java.math.BigInteger;

public class Food extends DomainID {
    private String title;
    private BigInteger price; // should calc based on recipe
    private Recipe recipe;

}
