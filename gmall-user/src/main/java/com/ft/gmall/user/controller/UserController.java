package com.ft.gmall.user.controller;

import com.ft.gmall.user.bean.UmsMember;
import com.ft.gmall.user.service.api.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping(value = "/users",method = RequestMethod.GET)
    @ResponseBody
    List<UmsMember> getAllUsers(){
        List<UmsMember> umsMembers = userService.getAllUsers();
        return umsMembers;
    }

    @RequestMapping("/users/{userId}")
    @ResponseBody
    UmsMember getUsersById(@PathVariable("userId") Integer userid){
        UmsMember umsMember = userService.getUserById(userid);
        return umsMember;
    }

    @RequestMapping(value = "/users",method = RequestMethod.POST)
    @ResponseBody
    int addUser( UmsMember umsMember){
        System.out.println(umsMember);
        int result = userService.addUser(umsMember);
        return result;
    }

    @RequestMapping(value = "/users",method = RequestMethod.PUT)
    @ResponseBody
    int updateUser(UmsMember umsMember){
        System.out.println(umsMember);
        int result = userService.updateUser(umsMember);
        return result;
    }

    @RequestMapping(value = "/users/{userId}",method = RequestMethod.DELETE)
    @ResponseBody
    int removeUser(@PathVariable("userId") Integer userId){
        int result = userService.delectUserById(userId);
        return result;
    }

}
