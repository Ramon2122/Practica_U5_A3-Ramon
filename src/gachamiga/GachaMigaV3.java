package gachamiga;

public class GachaMigaV3 {
    public static String convert(int number) {
        if (number % 15 == 0) {
            return "Gachamiga";
        } else if (number % 3 == 0) {
            return "Gacha";
        } else if (number % 5 == 0) {
            return "Miga";
        }
        return String.valueOf(number);
    }

    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            System.out.println(convert(i));
        }
    }
}