package edu.waynekeepo.je.dao.abs;

import edu.waynekeepo.je.domain.product.Food;

import java.util.UUID;

public interface ProductDAO extends JEDAO<Food, UUID> {
}
