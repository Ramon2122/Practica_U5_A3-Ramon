package gachamiga;
/*Escribe un programa que imprima los números del 1 al 100. Pero para múltiplos de 3 imprime "gacha"
 en lugar del número y para los múltiplos de cinco imprime "miga" y para los que son múltiplos de tres y cinco
 imprime "gachamiga".
 */

public class GachaMigaV1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 15; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Gachamiga");
            } else if (i % 3 == 0) {
                System.out.println("Gacha");
            } else if (i % 5 == 0) {
                System.out.println("Miga");
            } else {
                System.out.println(i);
            }
        }
        System.out.println("30: Gachamiga");
    }
}

