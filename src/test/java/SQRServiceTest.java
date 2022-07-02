import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
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
    @ParameterizedTest
    @CsvSource({

            "200,300,3",
            "500,700,4"
    })

    public void servCalculateSquareRangeBorder(int minRange, int maxRange, int expected) {
        SQRService calc = new SQRService();
        // int minRange = 100;
        // int maxRange = 9801;
        // int expected = 90;
        int actual = calc.inSqrt(minRange, maxRange);
        System.out.println("Колличество чисел в квадрате попавших в заданный диапазон -  " + actual);
        Assertions.assertEquals(expected, actual);
    }

}      
