package ru.job4j.ex;

public class UserStore {
    public static User findUser(User[] users, String login) throws UserNotFoundException {
        boolean chek = false;
        int number = 0;
        for (int i = 0; i < users.length; i++) {
            if (users[i].getUsername().equals(login)) {
                chek = true;
                number = i;
            }
        }
        if (!chek) {
            throw new UserNotFoundException("User not found");
        } else {
            return users[number];
        }
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (!user.isValid() || user.getUsername().length() < 3) {
            throw new UserInvalidException("User is not valid");
        }

        return true;
    }

    public static void main(String[] args) {
        User[] users = {
                new User("AA", true)
        };
        try {
            User user = findUser(users, "AA");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserInvalidException ei) {
            ei.printStackTrace();
        } catch (UserNotFoundException e) {
            e.printStackTrace();
        }
    }
}
