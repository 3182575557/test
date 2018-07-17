package com.wlgl.demo.mapper.user;

import com.wlgl.demo.model.user.TbUser;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * mapper文件
 * 注解写SQL语句
 */
@Repository
public interface UserMapper {
    @Select("select * from tb_user where id = #{id}")
    TbUser getUserById(int id);


    @Select("select * from tb_user")
    List<TbUser> getAllUser();

    /**
     * 该注解无法返回TBuser，需要该类型去controller切换或者换select注解
     * @param tbuser
     * @return
     */
    @Update("UPDATE tb_user SET username = #{username}, password = #{password} WHERE id = #{id}")
    int update(TbUser tbuser);

    @Insert("INSERT INTO tb_user(username, password, type) VALUES (#{username}, #{password}, #{type})")
    int addUser(TbUser tbUser);

    @Delete("delete from tb_user where id = #{id}")
        int deleteUser(Integer id);




}
