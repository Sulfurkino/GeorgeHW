package Exception.Retry;

public class Retry {
    boolean isError = true;

    public void retry(Runnable action, int attempts) throws RetryError{
        if (isError == true){
            for (int i = 0; i < attempts; i++) {
                action.run();
                if (isError == false){
                    break;
                }
            }
            throw new RetryError("*информация по последней ошибке*");
        }

    }
}
