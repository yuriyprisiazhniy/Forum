package com.yupr.forum.model;

/**
 * Created by Yura on 19.03.2017.
 */
public class Post {
    private Integer id;
    private Post parent;
    private Theme theme;
    private User user;
    private String header;
    private String text;

    public Post(){}

    public Post(Post parent, Theme theme, User user, String header, String text) {
        this.parent = parent;
        this.theme = theme;
        this.user = user;
        this.header = header;
        this.text = text;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Post getParent() {
        return parent;
    }

    public void setParent(Post parent) {
        this.parent = parent;
    }

    public Theme getTheme() {
        return theme;
    }

    public void setTheme(Theme theme) {
        this.theme = theme;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
