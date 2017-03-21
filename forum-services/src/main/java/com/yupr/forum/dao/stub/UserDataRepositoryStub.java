package com.yupr.forum.dao.stub;

import com.yupr.forum.dao.UserDataRepository;
import com.yupr.forum.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/**
 * Created by Yura on 19.03.2017.
 */

@Repository
public class UserDataRepositoryStub implements UserDataRepository {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserDataRepositoryStub.class);
    private static List<User> userList = new ArrayList<>();
    private static AtomicInteger id = new AtomicInteger();

    static {
        userList.add(new User("Admin", "admin@admin.com"));
        userList.add(new User("Guest1", "guest@guest.com"));
        userList.add(new User("Guest2", "guest2@guest.com"));
        userList.add(new User("Guest3", "guest3@guest.com"));
        userList.forEach(user -> user.setId(id.incrementAndGet()));
    }

    @Override
    public Optional<User> getUser(Integer id) {
        return userList.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst();
    }

    @Override
    public User createUser(User user) {
        user.setId(id.incrementAndGet());
        userList.add(user);
        return user;
    }

    @Override
    public List<User> getAllUsers() {
        return userList;
    }

    @Override
    public Optional<User> updateUser(Integer id, User newUser) {
        return getUser(id).map(u -> {
            u.setName(newUser.getName());
            u.setEmail(newUser.getEmail());
            return u;
        });
    }
}
