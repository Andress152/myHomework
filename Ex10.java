
// Даны два чмсла. Если квадратный корень из второго меньше первого числа,
// то увеличить второе число в 5 раз.

import java.util.Scanner;
public class Ex10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = sc.nextInt();
        a = (int) Math.sqrt(a);

        System.out.println("Введите второе число");
        int b = sc.nextInt();

        if (a < b){
            b *= 5;
            System.out.println(b);
        }
        else {
            System.out.println(a + " > " + b);
        }
    }
}
