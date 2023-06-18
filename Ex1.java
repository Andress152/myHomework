import java.util.Scanner;

//Задача про кофемашину
public class Ex1 {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Пожалуйства, внесите деньги");
            int money = sc.nextInt();

            int watter = 20;
            int coffee = 70;
            int milk = 90;

            if (money >= watter){
                System.out.println("Вы можете приобрести воду за " + watter + "руб.");
            }

            if (money >= coffee){
                System.out.println("Вы можете приобрести кофе за " + coffee + "руб.");
            }

            if (money >= milk){
                System.out.println("Вы можете приобрести молоко за " + milk + "руб.");
            }

            if (money < watter){
                System.out.println("Недостаточно средств. Пожалуйста пополните баланс)");
            }

        }
    }
