package com.wlgl.demo.service.user;

import com.wlgl.demo.mapper.user.UserMapper;
import com.wlgl.demo.model.user.TbUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserService implements UserMapper {

    @Autowired
    private UserMapper userMapper;

    /**
     * 根据id查用户
     * @param id
     * @return
     */
    @Override
    public TbUser getUserById(int id){
        return userMapper.getUserById(id);
    }

    /**
     * 查询所有用户
     * @return
     */
    @Override
    public List<TbUser> getAllUser() {
        return userMapper.getAllUser();
    }

    /**
     * 更新用户
     * @param tbuser
     * @return
     */
    @Override
    public int update(TbUser tbuser) {
        System.out.println(tbuser.toString());
        return userMapper.update(tbuser);
    }

    /**
     * 添加账号
     * @param tbUser
     * @return
     */
    @Override
    public int addUser(TbUser tbUser) {
        return userMapper.addUser(tbUser);
    }

    /**
     * 删除用户
     * @param id
     * @return
     */
    @Override
    public int deleteUser(Integer id) {
        return userMapper.deleteUser(id);
    }

}
