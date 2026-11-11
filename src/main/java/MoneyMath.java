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
        System.out.println("Float: " + moneyDouble);
        System.out.println("Double: " + moneyFloat);
        System.out.println("BigDecimal: " + bigDecimal);
    }

//      """  Questions to answer:
//                - How many cents is the float off after 1000 iterations?Float: 19990.000000000135
    //
//                - Why does the BigDecimal print 1.00 and not 1? because It returns a value with a decimals not integer
//                - What happens if you call .add(); without assigning the result back to your variable?
//                because bigDecimal is immutable like it can ont change the value of the variable it only returns a vlaue
//                so we store that in a  variable to avoid losing the return value"""
}
