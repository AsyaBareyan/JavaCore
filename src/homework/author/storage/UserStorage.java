package homework.author.storage;

import homework.education.model.User;

public class UserStorage {
    private User[] users = new User[10];
    private int size = 0;

    public void add(User user) {
        if (size == users.length) {
            extend();
        }
        users[size++] = user;
    }

    private void extend() {
        User[] result = new User[users.length + 10];
        System.arraycopy(users, 0, result, 0, size);
        users = result;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(users[i] + " ");

        }

    }
    public User getByEmail(String email) {
        for (int i = 0; i < size; i++) {
            if (users[i].getEmail().equals(email)) {
                return users[i];
            }
        }
        return null;
    }
}
