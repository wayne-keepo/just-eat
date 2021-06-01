package edu.waynekeepo.je.domain.product;


import edu.waynekeepo.je.domain.DomainID;

import java.util.List;
import java.util.Map;

public class Recipe extends DomainID {
    private String title;
    private String cookTime;
    private List<RawProduct> ingredients;
    private String equipment;
    private String calorie;
    private Map<Integer, String> cookInstruction; // TODO: проработать
    private List<FoodImage> foodImages;
}
