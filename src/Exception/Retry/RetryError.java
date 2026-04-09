package Exception.Retry;

public class RetryError extends RuntimeException {
    public RetryError(String message) {
        super(message);
    }
}
