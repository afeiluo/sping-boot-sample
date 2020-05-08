package com.afeiluo.service;

import com.afeiluo.model.User;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class SwaggerService {
    private static Map<Integer, User> userMap;

    static {
        userMap = new ConcurrentHashMap<>();
        User user = new User();
        user.setId(1);
        user.setName("admin");
        user.setAge(20);
        userMap.put(user.getId(), user);
    }

    public List<User> getUsers() {
        return new ArrayList<>((userMap.values()));
    }

    public Boolean addOrUpdateUser(User user) {
        userMap.put(user.getId(), user);
        return true;
    }

    public Boolean add(String name, Integer age) {
        User user = new User();
        user.setId(getNextId());
        user.setName(name);
        user.setAge(age);
        userMap.put(user.getId(), user);
        return true;
    }

    private Integer getNextId() {
        Integer maxId = Collections.max(userMap.keySet());
        return maxId + 1;
    }
}
