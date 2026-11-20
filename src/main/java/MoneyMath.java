import java.math.BigDecimal;

public class MoneyMath {
    public static void main(String[] args) {
        double moneyDouble = 0;
        float moneyFloat = 0;
        BigDecimal bigDecimal = BigDecimal.ZERO;

        for (int i = 0; i < 10; i++){
            moneyDouble += .10;
            moneyFloat += .10;
            bigDecimal = bigDecimal.add(new BigDecimal(".10"));

            //Show the result of each iterater
            System.out.println("Iterate : " + (1 + i));
            System.out.println("Float: " + moneyDouble);
            System.out.println("Double: " + moneyFloat);
            System.out.println("BigDecimal: " + bigDecimal);
        }

        //converting
        BigDecimal floatValue = new BigDecimal(Float.toString(moneyFloat));
        BigDecimal doubleValue = new BigDecimal(Double.toString(moneyDouble));
        //comparing
        System.out.println("\n Comparison: ");
        System.out.println("First Loop Comparison:");
        System.out.println("Double vs Float " + (moneyDouble == moneyFloat));
        System.out.println("Double vs BigDecimal " + (bigDecimal.compareTo(doubleValue)));
        System.out.println("Float vs BigDecimal " + (bigDecimal.compareTo(floatValue)));



        //Reasggining 0 to all the variables
        moneyDouble = 0;
        moneyFloat = 0;
        bigDecimal = BigDecimal.ZERO;


        for (int i = 0; i < 1000; i++){
            moneyDouble += 19.99;
            moneyFloat += 19.99;
            bigDecimal = bigDecimal.add(new BigDecimal("19.99"));

        }

        System.out.println("\n Comparison: ");

        //converting
        floatValue = new BigDecimal(Float.toString(moneyFloat));
        doubleValue = new BigDecimal(Double.toString(moneyDouble));
        //comparing
        System.out.println("Second Loop Comparison: ");
        System.out.println("Double vs Float " + (moneyDouble == moneyFloat));
        System.out.println("Double vs BigDecimal " + (bigDecimal.compareTo(doubleValue)));
        System.out.println("Float vs BigDecimal " + (bigDecimal.compareTo(floatValue)));

        //print the values
        System.out.println("Float: " + moneyFloat);
        System.out.println("Double: " + moneyDouble);
        System.out.println("BigDecimal: " + bigDecimal);
    }

    // The float is about 18 cents higher than the exact total after 1,000 additions.
    // BigDecimal prints 1.00 because adding "0.10" preserves two decimal places.
    // BigDecimal is immutable. If I call add() without saving the returned value,
    // the original variable still holds the old amount.
}
