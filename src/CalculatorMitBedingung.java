public class CalculatorMitBedingung {

    public static void main(String[] args) {

        System.out.println(divide(2,10));
    }

    public static double divide(double dividend, double divisor) {
        if (divisor != 0){
        return dividend / divisor;
        }

        else {
            System.out.println("divide by zero will not work");
            return 0;
        }
    }
}
