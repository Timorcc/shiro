package com.zns.shiro.dao;

import com.zns.shiro.domain.User;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Repository
public interface UserMapper {
    @Select("select * from user where name = #{name}")
    public User findByName(String name);

    @Select("select * from user where id = #{id}")
    public User findById(Integer id);
}
