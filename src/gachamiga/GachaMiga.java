package gachamiga;

public class GachaMiga {
    public static String convert(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "Gachamiga";
        } else if (number % 3 == 0) {
            return "Gacha";
        } else if (number % 5 == 0) {
            return "Miga";
        } else {
            return String.valueOf(number);
        }
    }
}

