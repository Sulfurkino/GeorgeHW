package Exception;

public class Divide {
//    Напиши метод `safeDivide(double a, double b)`,
//    который делит два числа и выбрасывает `ArithmeticException` с понятным сообщением при делении на ноль.
//    Оберни вызов в try-catch.
    static void safeDivide(double a, double b) throws ArithmeticException{
        if(b ==0){
            throw new ArithmeticException("нельзя делить на ноль");
        }
    }
}
