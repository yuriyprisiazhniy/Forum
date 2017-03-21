package com.yupr.forum.dao;

import com.yupr.forum.model.Category;
import com.yupr.forum.model.Theme;

import java.util.List;
import java.util.Optional;

public interface ThemeDataRepository {
    Theme createTheme(Category category, Theme themeData);
    List<Theme> getAllThemesUnderCategory(Category category);
    Optional<Theme> getThemeById(Integer id);
    Optional<Theme> updateTheme(Integer id, Theme themeData);
}
