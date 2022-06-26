import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {
    /*  minRange     - минимальная граница выбираемого диапазона  ;
        maxRange     - максимальная граница выбираемого диапазона ;
        expected     - ожидаемый результат ( предполагает
                      количество чисел из заданного диапазона [10-99],
                      квадрат, которых попадает в выбираемый диапазон).
         actual      - фактический результат ( показывает
                      количество чисел из заданного диапазона [10-99],
                      квадрат, которых попадает в выбираемый диапазон).
     */
    @Test
    public void servCalculateSquareRangeBorder() {
        SQRService calc = new SQRService();
        int minRange = 100;
        int maxRange = 9801;
        int expected = 90;
        int actual = calc.inSqrt(minRange, maxRange);
        System.out.println("Колличество чисел в квадрате попавших в заданный диапазон -  " + actual);
        Assertions.assertEquals(expected, actual);
    }

}      
