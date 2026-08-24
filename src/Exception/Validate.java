package Exception;

public class Validate {
    public static void validatePassword(String password) throws WeakPasswordException {
        if(password.length() < 8){
            throw new WeakPasswordException("Пароль короче 8и символов.");
        }
        if (password.chars().anyMatch(Character :: isDigit)){
            throw new WeakPasswordException("В пароле нет чисел");
        }

    }
}
