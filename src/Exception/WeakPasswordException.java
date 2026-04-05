package Exception;

public class WeakPasswordException extends Exception {
//    Напиши класс `WeakPasswordException` (checked exception) и метод `validatePassword(String password)`,
//    который выбрасывает это исключение, если пароль короче 8 символов или не содержит цифр.
//    Продемонстрируй вызов метода с обработкой исключения.

    public WeakPasswordException(String message) {
        super(message);
    }

}

