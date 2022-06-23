import enums.UserLevel;

import java.util.ArrayList;
import java.util.List;

public class UserRepo {
    private List<User> repo = new ArrayList<>();

    UserRepo() {
        repo.add(new User("001", "aaa"));
        repo.add(new User("012", "aba"));
        repo.add(new User("023", "aac"));
    }

    public List<User> getList() {
        return this.repo;
    }

    public User single(String pin) {
        User result = null;
        for (User user : repo) {
            if (user.getPin().equals(pin)) {
                result = user;
                break;
            }
        }
        return result;
    }

    public User create(String pin, UserLevel level) {
        char lastId = this.repo.get(this.repo.size() - 1).getId().charAt(2);
        User newUser = new User(generateId(lastId, level), pin);
        this.repo.add(newUser);
        return newUser;
    }

    // K.I.S.S
    private String generateId(char lastId, UserLevel level) {
        int lastIdAsNum = Integer.parseInt(String.valueOf(lastId));
        String levelAsNum = level == UserLevel.DEV ? "00" : level == UserLevel.ADMIN ? "01" : "02";
        return new StringBuilder(levelAsNum).append(lastIdAsNum++).toString();
    }
}
