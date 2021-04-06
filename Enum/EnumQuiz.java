import com.sun.istack.internal.Nullable;

enum Days{
    월요일(1, "monday"),
    화요일(2, "tuesday"),
    수요일(3, "wednesday"),
    목요일(4, "thursday"),
    금요일(5, "friday"),
    토요일(6, "saturday"),
    일요일(7, "sunday");

    final private int days_int;
    final private String days_eng;

    Days(int days_int, String days_eng) {
        this.days_int = days_int;
        this.days_eng = days_eng;
    }

    int value_int() {
        return days_int;
    }

    String value_eng() {
        return days_eng;
    }

    public Days valueOf(int days_int) {
        Days days = null;
        if (days_int == 1) {
            days = Days.월요일;
        }
        return days;
    }

}

public class EnumQuiz {
    public static void main(String[] args) {
        Days days = Days.금요일;
        System.out.println(days.value_int());
        System.out.println(days.value_eng());

        String str = "월요일";
        Days daysValueOf = Days.valueOf(str);
        System.out.println(daysValueOf.value_int());
        System.out.println(daysValueOf.value_eng());

        int integer = 1;
        days.valueOf(integer);
    }
}