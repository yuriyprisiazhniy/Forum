package com.yupr.forum.dao;

import com.yupr.forum.model.User;

import java.util.List;
import java.util.Optional;

/**
 * Created by Yura on 19.03.2017.
 */
public interface UserDataRepository {
    Optional<User> getUser(Integer id);
    User createUser(User user);
    List<User> getAllUsers();
    Optional<User> updateUser(Integer id, User user);
}
