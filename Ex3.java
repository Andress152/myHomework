
//С некоторого момента прошло 234 дня.
// Сколько полных недель прошло за этот период?
// А месяцев?
// Выведите полученные значения в консоль

public class Ex3 {
    public static void main(String[] args) {

        int day = 234;
        int week = day / 7;
        int month = day / 31;

        System.out.println("Прошло " + day + " дня");
        System.out.println("в неделях это: " + week);
        System.out.println("В месяцах это: " + month);

    }

}
