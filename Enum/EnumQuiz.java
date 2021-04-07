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
//        while (days_int > 7) {
//            days_int -= 7;
//        }
        if (days_int > 7)
            days_int = days_int % 7;
        Days days = null;
        for (int i = 1; i <= Days.values().length; i++) {
            if (days_int == i) {
                days = Days.values()[i-1];
            }
        }
        return days;
    }

}

public class EnumQuiz {
    public static void main(String[] args) {
        Days days = Days.금요일;
        System.out.println(days.value_int());
        System.out.println(days.value_eng() + "\n");

        String str = "월요일";
        Days daysValueOf = Days.valueOf(str);
        System.out.println(daysValueOf.ordinal());
        System.out.println(daysValueOf.value_int());
        System.out.println(daysValueOf.value_eng() + "\n");

        int intdays = 9;
        System.out.println(daysValueOf.valueOf(intdays));

    }
}