//Дано двузначное число 57. Найти:
// a.число десятков в нем;
// b.число единиц в нем;
// c.сумму его цифр;
// d.произведение его цифр

public class Ex4 {
    public static void main(String[] args) {

        int num = 57;

        int des = num / 10;
        int edy = num % 10;
        int sum = des + edy;
        int pr = des * edy;

        System.out.println(num);
        System.out.println(des);
        System.out.println(edy);
        System.out.println(sum);
        System.out.println(pr);


    }

}
