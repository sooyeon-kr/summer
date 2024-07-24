package com.example.summer.user;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
    Map<Integer, User> userTable = new HashMap<Integer, User>();
    public static int idx = 0;
    public User save(User user) {
        userTable.put(idx++, user);
        return userTable.get(idx-1);
    }


    public User findById(String id, String pw) {
        Collection<User> users = userTable.values();
        for (User user : users) {
            if (user.getId().equals(id) && user.getPw().equals(pw)) {
                return user;
            }
        }
        return null;
    }
}
