package Exception;

public class Person {
    public void setAge(int age) throws InvalidAgeException{
        if (age<0){
            throw new InvalidAgeException("возраст меньше 0");
        }
        if (age > 150){
            throw new InvalidAgeException("Ты слишком старый, ложись в гроб");
        }
    }
}
