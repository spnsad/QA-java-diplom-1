import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import praktikum.Burger;
import praktikum.Ingredient;

@RunWith(MockitoJUnitRunner.class)
public class AddIngredientTest {
    @Mock
    Ingredient ingredient;

    @Test
    public void canAddIngredientTest() {
        //Создали бургер
        Burger burger = new Burger();

        //Считаем сколько ингредиентов
        int sizeBeforeAdd = burger.ingredients.size();

        //Добавляем ингредиент
        burger.addIngredient(ingredient);

        //Проверили количество ингредиентов после добавления
        int sizeAfterAdd = burger.ingredients.size();

        //Проверяем, что список ингредиентов сократился на 1
        Assert.assertEquals(1,sizeAfterAdd-sizeBeforeAdd);
    }
}
