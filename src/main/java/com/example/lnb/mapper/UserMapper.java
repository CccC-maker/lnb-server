package com.example.lnb.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.lnb.entity.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper  //加入到springboot容器中
@Repository
//继承BaseMapper 自动写增删改查方法
public interface UserMapper {

    @Select("select * from user")
    List<User> findAll();

    /**
     *查看用户名是否已经存在
     * @param username
     * @return
     */
    @Select("select u.username,u.password from user u where u.username=#{username}")
    User findUserByName(@Param("username") String username);


    @Select("SELECT * FROM user WHERE id=#{id}")
    User findUserById(@Param("id") int id);


    /**
     * 注册
     * @param user
     */
    @Insert("insert into user values(#{id},#{username},#{password},#{address},#{phone})")
    @Options(useGeneratedKeys = true,keyProperty = "id",keyColumn = "id")
    void register(User user);


    /**
     * 登录
     * @param user
     * @return
     */
    @Select("select u.id from user u where u.username=#{username} and password=#{password}")
    int login(User user);

}
