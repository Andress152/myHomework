
// Команде по футболу, за выигрыш даётся 3 очка, за проигрыш - 0, а за ничью - 1;
// Известно количество очков, похученных командой;
// Вывести словесный результат.

import java.util.Scanner;

public class Ex6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите, сколько у команды очков: ");
        int res = sc.nextInt();

        switch (res){
            case 3:
                System.out.println("Команда выйграла");
                break;
            case 1:
                System.out.println("Ничья");
                break;
            case 0:
                System.out.println("Команда проиграла");
                break;
            default:
                System.out.println("Результат неизвестен");
                break;
        }

    }
}
