package com.emily.crm.settings.dao;

import com.emily.crm.settings.domain.User;

import java.util.Map;

public interface UserDao {

    User login(Map<String, String> map);
}
