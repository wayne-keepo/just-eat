package edu.waynekeepo.je.domain.product;


import edu.waynekeepo.je.domain.base.DomainID;
import lombok.Getter;
import lombok.Setter;

import java.util.List;
@Getter
@Setter
public class Recipe extends DomainID {
    private String title;
    private String description;
    private List<RawProduct> ingredients; // TODO: think about it
    private String cookTime;
    private String calorie;
    private CookInstruction cookInstruction; // TODO: think about it
    private FoodImage foodImage;
}
