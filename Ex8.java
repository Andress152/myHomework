
//Дано двузначное число, определить:
//а. остаток деления десятков на единицы;
//в. остаток деляения единиц на десятки.

import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите двузначное число" );
        int num = sc.nextInt();

        int des = num / 10;
        int edy = num % 10;


        int res1 = des % edy;
        int res2 = edy % des;

        System.out.println(res1);
        System.out.println(res2);
    }
}
