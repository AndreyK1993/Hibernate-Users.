package app.utils;

import app.entity.User;

import java.util.Map;

public class UserMapper {

    public User mapContactData(Map<String, String> data) {
        User user = new User();
        if (data.containsKey("id"))
            user.setId(Long.parseLong(data.get("id")));
        if (data.containsKey("first_name"))
            user.setName(data.get("first_name"));
        if (data.containsKey("email"))
            user.setEmail(data.get("email"));
        return user;
    }
}
