package Exception.Result;

import java.util.List;
import java.util.NoSuchElementException;

public class UserRepository {
    public Result <User> findById(Integer id){
        User user = loadFromDB();
        if (user == null){
            return Result.failure(new NoSuchElementException("пользователь не найден"));
        }
        return Result.success(user);
    }
    public User loadFromDB(){
        return null;
    }
}
