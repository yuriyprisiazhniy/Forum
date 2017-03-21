package com.yupr.forum.model;

/**
 * Created by Yura on 19.03.2017.
 */
public class Theme {
    private Integer id;
    private Category category;
    private User user;
    private String name;
    private String description;

    public Theme() {
    }

    public Theme(Category category, User user, String name, String description) {
        this.category = category;
        this.user = user;
        this.name = name;
        this.description = description;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
