import enums.UserLevel;

public final class User {
    private String id;
    private String pin;
    private UserLevel level;

    public User(String id, String pin) {
        this.id = id;
        this.pin = pin;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public String getPin() {
        return pin;
    }

    public UserLevel getLevel() {
        switch (id.charAt(1)) {
            case '0':
                return UserLevel.DEV;
            case '1':
                return UserLevel.ADMIN;
            default: return UserLevel.USER;
        }
    }
}
