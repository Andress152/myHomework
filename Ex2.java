import java.util.Scanner;

// Счёт
public class Ex2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        int nam1 = sc.nextInt();


        if (nam1 < 100) {
            nam1 = nam1 + (nam1 * 5 / 100);
            System.out.println(nam1);
        } else if (nam1 > 100 && nam1 < 200) {
            nam1 = nam1 + (nam1 * 7 / 100);
            System.out.println(nam1);
        } else if (nam1 > 200) {
            nam1 = nam1 + (nam1 * 10 / 100);
            System.out.println(nam1);
        }
    }
}
