package com.healthmanagement.sportmanage.dao;

import com.healthmanagement.sportmanage.bean.MainMenu;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MenuDao {
    public List<MainMenu> getMainMenus();
}
