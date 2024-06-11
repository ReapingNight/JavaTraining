package Lesson1;

public class main {
    // Hier hoef je nog niet naar te kijken. Dit is code om jouw opdrachten te testen,
    // maar voel je vrij als je wilt kijken wat er hier gebeurd :).
    public static void main(String[] args) {
        var test = new Lesson1();

        System.out.printf("Volgens jouw programma is %d plus %d gelijk aan %d\n", 5, 6, test.add(5,6));
        System.out.printf("en %d keer %d is gelijk aan %d\n", 8, 2, test.multiply(8,3));
        System.out.printf("is %d gedeeld door %d gelijk aan %d?\n", 7, 2, test.divide(7,2));
        if (test.divide(7,2) == 3) {
            System.out.println("\tJa, hele getallen door elkaar delen rondt altijd naar beneden af.");
        } else {
            System.out.println("\tHelaas niet :(. Kijk of je alle getallen op de juiste plek hebt gezet.");
        }
        System.out.printf("en als laatste: (%d plus 5) vermenigvuldigt met %d is %d\n", 4, 9, test.add5times(4,9));
    }
}
