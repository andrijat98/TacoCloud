package io.github.andrijat98.tacocloud.repos;

import io.github.andrijat98.tacocloud.domains.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {

}
