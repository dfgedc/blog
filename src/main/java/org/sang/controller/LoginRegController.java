package org.sang.controller;

import org.sang.bean.RespBean;
import org.sang.bean.User;
import org.sang.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginRegController {
    @Autowired
    UserService userService;
    @RequestMapping("/login_error")
    public RespBean loginError(){
        return new RespBean("error","login fail");
    }
    @RequestMapping("/login_success")
    public  RespBean loginSuccess(){
        return new RespBean("success","suceess congrulations!");
    }

    public  RespBean reg(User user){
        int result = userService.reg(user);
        if(result ==0){
            return new RespBean("success","success congrulations");
        }else if(result ==1){
            return  new RespBean("error","yong hu ming chong fu");
        }else{
            return new RespBean("error","fail register");
        }
    }
}
