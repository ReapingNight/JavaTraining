package Lesson2;

import java.lang.reflect.Method;

public class main {
    public static void main(String[] args) {
        var test = new Lesson2();

        try {
            int a = 2, b = 6;

            Method pow = test.getClass().getMethod("power", int.class, int.class);
            int res = (int) pow.invoke(test, a, b);
            if (res == (int) Math.pow(2, 6)) {
                System.out.println("Je \"power\" doet het!");
            } else {
                System.out.printf("%d ^ %d is %d, jouw antwoord was %d\n", a, b, (int)Math.pow(2, 6), res);
            }
        } catch (NoSuchMethodException e) {
            System.out.println("\"power\" is nog niet geimplementeerd.");
        } catch (Exception e) {
            System.out.println("De signature van \"power\" is niet goed. Zorg ervoor dat het de juiste type en aantal variabelen gebruikt en terug geeft.");
        }

        try {
            int a = 5;

            Method fact = test.getClass().getMethod("fact", int.class);
            int res = (int) fact.invoke(test, a);
            if (res == 120) {
                System.out.println("Je \"fact\" doet het!");
            } else {
                System.out.printf("%d! is %d, jouw antwoord was %d\n", a, 120, res);
            }
        } catch (NoSuchMethodException e) {
            System.out.println("\"fact\" is nog niet geimplementeerd.");
        } catch (Exception e) {
            System.out.println("De signature van \"fact\" is niet goed. Zorg ervoor dat het de juiste type en aantal variabelen gebruikt en terug geeft.");
        }

        try {
            Method squareRoot = test.getClass().getMethod("squareRoot", int.class);
            System.out.println("Ooh, je hebt de vierkantswortel geïmplementeerd? Laten we kijken...");
            float res = (float) squareRoot.invoke(test, 17);
            System.out.printf("Is de wortel van %d gelijk aan %.6f?\n", 17, res);
            double e = Math.abs(res - Math.sqrt(17));
            if (e < 0.00001) {
                System.out.println("Heel netjes! Goed gedaan!");
            } else {
                System.out.printf("Goed geprobeerd, maar het is het nog net niet. Jij had als antwoord: %.6f. Het antwoord is: %.6f. Het verschil is %f\n", res, Math.sqrt(17), e);
            }
        } catch (Exception e) {

        }
    }
}
