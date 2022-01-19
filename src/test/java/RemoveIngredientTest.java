import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import praktikum.Burger;
import praktikum.Ingredient;

@RunWith(MockitoJUnitRunner.class)
public class RemoveIngredientTest {

    @Mock
    Ingredient ingredient;

    @Test
    public void canRemoveIngredient(){
        //Создали бургер и добавили ингредиент
        Burger burger = new Burger();
        burger.addIngredient(ingredient);

        //Проверили количество ингредиентов до удаления
        int sizeBeforeRemove = burger.ingredients.size();

        //Удаляем ингредиент
        burger.removeIngredient(sizeBeforeRemove-1);

        //Проверили количество ингредиентов после удаления
        int sizeAfterRemove = burger.ingredients.size();

        //Проверяем, что список ингредиентов сократился на 1
        Assert.assertEquals(1,sizeBeforeRemove-sizeAfterRemove);
    }
}
