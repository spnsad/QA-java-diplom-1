import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import praktikum.Burger;
import praktikum.Ingredient;
import praktikum.IngredientType;

@RunWith(MockitoJUnitRunner.class)
public class MoveIngredientTest {
    @Mock
    Ingredient ingredient;

    @Test
    public void canMoveIngredientTest() {
        //Создали бургер
        Burger burger = new Burger();

        //Считаем сколько ингредиентов
        int sizeBeforeAdd = burger.ingredients.size();

        //Добавляем замоканый ингредиент
        burger.addIngredient(ingredient);

        //Создаем новый ингредиент
        Ingredient sausage = new Ingredient(IngredientType.FILLING,"сосиска",1);
        //И добавляем его тоже
        burger.addIngredient(sausage);

        //Проверяем позицию сосиски
        int beforeSausageIndex = burger.ingredients.indexOf(sausage);

        //Перемещаем сосиску
        burger.moveIngredient(beforeSausageIndex,0);

        int afterSausageIndex = burger.ingredients.indexOf(sausage);

        //Проверяем, что позиция сосиски изменилась
        Assert.assertEquals(1,beforeSausageIndex);
        Assert.assertEquals(0,afterSausageIndex);
    }
}
