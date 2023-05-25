package gachamiga;

public class GachaMigaV4 {
    public class Gachamiguero {
        public static String catar(int ingrediente){
            if (ingrediente % 3 == 0 && ingrediente % 5 == 0) {
                return "Gachamiga";
            } else if (ingrediente % 3 == 0) {
                return "Gacha";
            } else if (ingrediente % 5 == 0) {
                return "Miga";
            } else {
                return Integer.toString(ingrediente);
            }
        }

        public static void main(String[] args) {
            for (int i = 1; i <= 100; i++) {
                System.out.println(catar(i));
            }
        }
    }

}