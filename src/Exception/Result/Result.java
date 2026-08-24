package Exception.Result;

public class Result<T> {
    private boolean success;
    private Exception error;
    private T value;

    private Result(boolean success, Exception error, T value) {
        this.success = success;
        this.error = error;
        this.value = value;
    }

    public static <T> Result<T> success(T value) {
        return new Result<>(true, null, value);
    }

    public static <T> Result<T> failure(Exception error) {
        return new Result<>(false, error, null);
    }

    public boolean isSuccess() {
        return success;
        
    }

    public T getValue(Result<T> result){
       if (!success){
           throw new IllegalArgumentException("value нет в неудачных результатах");
       }
       return value;
    }
    public Exception getError(Result<T> result){
        if (success){
            throw new IllegalArgumentException("error нет в удачных результатах");
        }
        return error;
    }
}
