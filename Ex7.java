
//Даны радиус круга и сторона квадрата.
//У какой фигуры площадь больще?

import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введете площадь круга");
        int p = sc.nextInt();

        System.out.println("Введите, чему равна сторона квадрата");
        int s = sc.nextInt();

        double R = p / (2 * 3.14);
        double P = s ^ 2;

        if (R > P){
            System.out.println("Площадь круга больше, чем площадь квадрата");
        }
        else{
            System.out.println("Площадь квадрата больше, чем площадь круга");
        }

    }
}
