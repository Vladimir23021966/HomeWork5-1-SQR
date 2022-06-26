package ru.netology.sqr;

public class SQRService {
    /*  minRange     - минимальная граница выбираемого диапазона  ;
        maxRange     - максимальная граница выбираемого диапазона ;
        changVar     - переменная в заданом диапазоне [10-99]     ;
        sqrChangVar  - квадрат переменной   changVar              ;
        index        - индекс (показывает количество чисел из
                       заданного диапазона [10-99], квадрат,
                       которых попадает в выбираемый диапазон.
     */
    int changVar = 10, sqrChangVar, index;

    public int inSqrt(int minRange, int maxRange) {
        System.out.println("Заданный диапазон -  [" + minRange + "-" + maxRange + "]");

        changVar = 10;
        sqrChangVar = changVar * changVar;
        while (sqrChangVar < minRange) {
            changVar++;
            sqrChangVar = changVar * changVar;
        }
        for (index = 0; sqrChangVar <= maxRange; index++) {
            sqrChangVar = changVar * changVar;
            if (sqrChangVar > maxRange) {
                break;
            }
            if (changVar > 99) {
                
                break;
            }
            System.out.println("Число, квадрат которого попадает в диапазон -"
                    + changVar + "\n при условии что changVar = [10-99]");
            changVar++;
        }
        return index;
    }
}
