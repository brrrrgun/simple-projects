public class Main {
    public static void main(String[] args) {
        UserRepo repo = new UserRepo();
        String pin = MessageManager.getUserPin();
        User user = repo.single(pin);

        if(user != null){
            MessageManager.showWelcome(user.getId().charAt(2));
        }

    }

}
