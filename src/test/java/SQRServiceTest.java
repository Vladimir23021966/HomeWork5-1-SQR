import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {

    @Test
    public void servCalculateSquareRangeBorder() {
        SQRService calc = new SQRService();
        int a = 10;
        int b = 10000;
        int expected = 90;
        int actual = calc.inSqrt(a, b);
        int result = calc.inSqrt(a, b);
        System.out.println("Колличество чисел в квадрате попавших в заданный диапазон -  " + result );

        Assertions.assertEquals(expected, actual);
    }

}      
