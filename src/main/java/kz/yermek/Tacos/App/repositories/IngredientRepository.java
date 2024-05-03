package kz.yermek.Tacos.App.repositories;


import kz.yermek.Tacos.App.models.Ingredient;
import org.springframework.data.repository.CrudRepository;

public interface IngredientRepository extends CrudRepository<Ingredient, String> {

}
