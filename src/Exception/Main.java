package Exception;

import Exception.AgeTask.Person;

public class Main {
    public static void main(String[] args) {
        String pass1 = "pass1";

        try {
            Validate.validatePassword(pass1);
        } catch (WeakPasswordException weakPasswordException){
            System.out.println(weakPasswordException.getMessage());
        }

        //задание 2
        double a = 2;
        double b = 0;

        try {
            Divide.safeDivide(a,b);

        } catch (ArithmeticException arithmeticException){
            System.out.println(arithmeticException.getMessage());
        }

        //задание 4
        Person person = new Person();
        person.setAge(-1);
    }
}
