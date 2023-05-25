package gachamiga;

public class GachaMigaV2  {
    public static String convert(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "Gachamiga";
        } else if (number % 3 == 0) {
            return "Gacha";
        } else if (number % 5 == 0) {
            return "Miga";
        } else {
            return Integer.toString(number);
        }
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(convert(i));
        }
    }
}


