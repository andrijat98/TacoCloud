package io.github.andrijat98.tacocloud.utils;

import io.github.andrijat98.tacocloud.domains.Ingredient;
import io.github.andrijat98.tacocloud.domains.IngredientUDT;
import io.github.andrijat98.tacocloud.domains.Taco;
import io.github.andrijat98.tacocloud.domains.TacoUDT;

import java.util.List;
import java.util.stream.Collectors;

public class TacoUDRUtils {

    public static TacoUDT toTacoUDT(Taco taco) {
        return new TacoUDT(taco.getName(), taco.getIngredients());
    }

    public static List<IngredientUDT> toIngredientUDTs(List<Ingredient> ingredients) {
        return ingredients.stream().map(ingredient -> toIngredientUDT(ingredient))
                .collect(Collectors.toList());
    }

    public static IngredientUDT toIngredientUDT(Ingredient ingredient) {
        return new IngredientUDT(ingredient.getName(), ingredient.getType());
    }
}
