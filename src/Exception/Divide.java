package Exception;

public class Divide {
    static void safeDivide(double a, double b) throws ArithmeticException{
        try {
            double test = a/b;
        } catch (ArithmeticException e){
            throw new ArithmeticException("нельзя делить на ноль");
        }

    }
}
