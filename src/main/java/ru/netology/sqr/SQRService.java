package ru.netology.sqr;

public class SQRService {

    int c = 10, d, i;

    public int inSqrt(int a, int b) {
        System.out.println("Заданный диапазон -  [" + a + "-" + b + "]");

        c = 10;
        d = c * c;
        while (d < a) {
            c++;
            d = c * c;
        }
        for (i = 0; d <= b; i++) {
            d = c * c;
            if (d > b) {
                break;
            }
            if (c > 99) {
                break;
            }


            System.out.println("Число, квадрат которого попадает в диапазон -" + c + "\n при условии что с = [10-99]");
            c++;
        }
        return i;
    }
}
