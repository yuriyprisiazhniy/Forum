package com.yupr.forum.dao;

import com.yupr.forum.model.Post;
import com.yupr.forum.model.Theme;
import com.yupr.forum.model.User;

import java.util.List;
import java.util.Optional;

public interface PostDataRepository {
    Post createPost(Theme theme, Post postData);
    List<Post> getAllPostUnderTheme(Theme theme);
    Optional<Post> getPostById(Integer id);
    Optional<Post> updatePost(Integer id, Post postData);
    List<Post> getAllUsersPosts(User user);
}
