package Exception.Calculatr;

public class CalculatorMethods {
    double result;

    public double add(double number){
        return result += number;
    }
    public double substract(double number){
        return result-= number;
    }
    public double divide(double number){
        return result /= number;
    }
    public double multiply(double number){
        return result *= number;
    }
    public double degree(double number){
        return Math.pow(result,number);
    }
    public double sqrt(){
        return Math.sqrt(result);
    }
}
