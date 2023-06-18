
//Даны три вещественных числа a, b, c, определить:
// а. выполняется ли неравенство b > a > c;
// b. выполняется ли неравенство a < b < c.

import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число a");
        int a = sc.nextInt();

        System.out.println("Введите число b");
        int b = sc.nextInt();

        System.out.println("Введите число c");
        int c = sc.nextInt();

        if (b > a && a > c){
            System.out.println("выполняется неравенство: " + b + " > " + a + " > " + c);
        }
        else if (a < b && b < c) {
            System.out.println("выполняется неравенство: " + a + " < " + b + " < " + c);
        }
        else {
            System.out.println("Неравенство не выполняется");
        }
    }
}
