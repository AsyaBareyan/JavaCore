package homework.education.storage;

import homework.education.exception.UserNotFoundException;
import homework.education.model.User;

import java.util.HashMap;

public class UserStorage {
    //    private User[] users = new User[10];
    private HashMap<String, User> userHashMap = new HashMap<>();
//    private int size = 0;


    public void add(String email, User user) {
        userHashMap.put(email, user);
    }

//    private void extend() {
//        User[] result = new User[users.length + 10];
//        System.arraycopy(users, 0, result, 0, size);
//        users = result;
//    }

    public void print() {
        for (String s : userHashMap.keySet()) {
            System.out.println(s);
        }
    }

    public User getByEmail(String email) throws UserNotFoundException {
        for (User value : userHashMap.values()) {
            if (value.getEmail().equals(email)) {
                return value;
            }
        }
        throw new

                UserNotFoundException("User with this " + email + " was exists");
    }
}