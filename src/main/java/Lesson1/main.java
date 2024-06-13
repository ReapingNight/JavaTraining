package Lesson1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class main {
    // Hier hoef je nog niet naar te kijken. Dit is code om jouw opdrachten te testen,
    // maar voel je vrij als je wilt kijken wat er hier gebeurd :).
    public static void main(String[] args) {
        var test = new Lesson1();

        System.out.println("Laten we gaan testen of alles klopt...");

        if (test.add(8, 3) == 8 + 3) {
            System.out.println("De \"add\" doet het!");
        } else {
            System.out.printf("%d + %d is %d, jouw antwoord was %d\n", 8, 3, 8 + 3, test.add(8, 3));
        }

        try {
            int a = 5, b = 6;

            Method mult = test.getClass().getMethod("multiply", int.class, int.class);
            int res = (int) mult.invoke(test, a, b);
            if (res == a * b) {
                System.out.println("Je \"multiply\" doet het!");
            } else {
                System.out.printf("%d * %d is %d, jouw antwoord was %d\n", a, b, a * b, res);
            }
        } catch (NoSuchMethodException e) {
            System.out.println("\"multiply\" is nog niet geimplementeerd.");
        } catch (Exception e) {
            System.out.println("De signature van \"multiply\" is niet goed. Zorg ervoor dat het de juiste type en aantal variabelen gebruikt en terug geeft.");
        }

        try {
            int a = 7, b = 2;

            Method div = test.getClass().getMethod("divide", int.class, int.class);
            int res = (int) div.invoke(test, a, b);
            if (res == a / b) {
                System.out.println("Je \"divide\" doet het!");
            } else {
                System.out.printf("%d / %d is %d, jouw antwoord was %d\n", a, b, a / b, res);
            }
        } catch (NoSuchMethodException e) {
            System.out.println("\"divide\" is nog niet geimplementeerd.");
        } catch (Exception e) {
            System.out.println("De signature van \"divide\" is niet goed. Zorg ervoor dat het de juiste type en aantal variabelen gebruikt en terug geeft.");
        }

        try {
            int a = 7, b = 2;

            Method sum = test.getClass().getMethod("add5times", int.class, int.class);
            int res = (int) sum.invoke(test, a, b);
            if (res == (a + 5) * b) {
                System.out.println("Je \"add5times\" doet het!");
            } else {
                System.out.printf("(%d + 5) * %d is %d, jouw antwoord was %d\n", a, b, (a + 5) * b, res);
            }
        } catch (NoSuchMethodException e) {
            System.out.println("\"add5times\" is nog niet geimplementeerd.");
        } catch (Exception e) {
            System.out.println("De signature van \"add5times\" is niet goed. Zorg ervoor dat het de juiste type en aantal variabelen gebruikt en terug geeft.");
        }
    }
}
