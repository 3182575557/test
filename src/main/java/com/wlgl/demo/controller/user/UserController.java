package com.wlgl.demo.controller.user;

import com.wlgl.demo.model.user.TbUser;
import com.wlgl.demo.service.user.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 账号模块
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    /**
     * 根据id查询
     * @param id
     * @return
     */
    @RequestMapping("getUserById")
    public TbUser getUserById(int id){
        return userService.getUserById(id);
    }

    /**
     * 查询所有
     * @return
     */
    @RequestMapping("getUserAll")
    public List<TbUser> getUserAll(){
        return userService.getAllUser();
    }

    /**
     * 修改
     * @param tbuser
     * @return
     */
    @RequestMapping("changeUser")
    public TbUser changeUser(TbUser tbuser){
    userService.update(tbuser);
    return  userService.getUserById(tbuser.getId());
    }

    /**
     * 添加
     * @param tbUser
     * @return
     */
    @RequestMapping("addUser")
    public int addUser(TbUser tbUser){
        return userService.addUser(tbUser);
    }

    /**
     * 删除
     * @param id
     * @return
     */
    @RequestMapping("deleteUser")
    public int deleteUser(Integer id){
        return userService.deleteUser(id);
    }

}
