package com.emily.crm.settings.service;

import com.emily.crm.exception.LoginException;
import com.emily.crm.settings.domain.User;

public interface UserService {
    User login(String loginAct, String loginPwd, String ip) throws LoginException;
}
