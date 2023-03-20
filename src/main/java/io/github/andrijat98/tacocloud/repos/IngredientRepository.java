package io.github.andrijat98.tacocloud.repos;

import io.github.andrijat98.tacocloud.domains.Ingredient;

import java.util.Optional;

public interface IngredientRepository {

    Iterable<Ingredient> findAll();
    Optional<Ingredient> findById(String id);
    Ingredient save(Ingredient ingredient);
}
