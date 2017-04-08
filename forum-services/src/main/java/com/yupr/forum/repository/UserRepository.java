package com.yupr.forum.repository;

import com.yupr.forum.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by Yura on 08.04.2017.
 */

public interface UserRepository extends JpaRepository<User, Integer> {
}
