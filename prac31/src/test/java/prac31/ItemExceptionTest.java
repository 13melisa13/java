package prac31;

import org.junit.Test;
import prac31.items.Dish;


public class ItemExceptionTest {
        @Test(expected = Exception.class)
        public void test() throws  Exception {
            new Dish("", "",-1);//неправильная инициализация
        }
}
