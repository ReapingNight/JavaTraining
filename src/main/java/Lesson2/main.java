package Lesson2;

import java.lang.reflect.Method;

public class main {
    public static void main(String[] args) {
        var test = new Lesson2();

//        System.out.printf("%d tot de macht %d is %d\n", 2, 4, test.power(2,4));
//        System.out.printf("Verder is %d faculteit gelijk aan %d\n", 5, test.fact(5));

        // Dit is een stukje code om te kijken of de squareRoot bestaat of niet.
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
