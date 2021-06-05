package edu.waynekeepo.je.domain.product;


import edu.waynekeepo.je.domain.base.DomainID;

import java.util.List;

public class Recipe extends DomainID {
    private String title;
    private String description;
    private List<RawProduct> ingredients; // TODO: think about it
    private String cookTime;
    private String calorie;
    private CookInstruction cookInstruction; // TODO: think about it
    private FoodImage foodImage;
}
