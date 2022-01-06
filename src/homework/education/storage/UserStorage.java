package homework.education.storage;


import homework.education.model.User;
import homework.education.util.FileUtil;

import java.util.HashMap;
import java.util.Map;

public class UserStorage {
    //    private User[] users = new User[10];
    private Map<String, User> userMap = new HashMap<>();
//    private int size = 0;


    public void add(String email, User user) {
        userMap.put(email, user);
    }

//    private void extend() {
//        User[] result = new User[users.length + 10];
//        System.arraycopy(users, 0, result, 0, size);
//        users = result;
//    }

    public void print() {
        for (String s : userMap.keySet()) {
            System.out.println(s);
        }
    }

    public User getByEmail(String email) {
        return userMap.get(email);
//        for (User value : userHashMap.values()) {
//            if (value.getEmail().equals(email)) {
//                return value;
//    }  throw new
//
//    UserNotFoundException("User with this "+email +" was exists");
    }

    public void initData() {
        Map<String, User> userMapFromFile = FileUtil.deserializeUserMap();
        if (userMapFromFile != null) {
            userMap = userMapFromFile;
        }

    }
}
