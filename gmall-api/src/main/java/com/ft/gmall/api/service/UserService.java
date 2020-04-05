package com.ft.gmall.api.service;

import com.ft.gmall.api.bean.UmsMember;

import java.util.List;

public interface UserService {
    List<UmsMember> getAllUsers();

    UmsMember getUserById(Integer userid);

    int addUser(UmsMember umsMember);

    int updateUser(UmsMember umsMember);

    int delectUserById(Integer userId);
}
