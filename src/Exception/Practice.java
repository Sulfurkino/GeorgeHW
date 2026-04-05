package Exception;

public class Practice {
    public void validate(String s) throws RuntimeException {  // throws — объявление
        if (s == null) {
            throw new RuntimeException("String is null");      // throw — действие
        }
    }
    void method(){
        validate("");
    }
}
