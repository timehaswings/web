package com.ignite.video.mapper;

import com.ignite.video.domain.User;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@Mapper
public interface UserMapper {

    /**
     * 查询一条用户记录
     * @param id
     * @return
     */
    @Select("SELECT * FROM ignite_user WHERE id = #{id}")
    User findById(@Param("id") Long id);

    /**
     * 查询一条用户记录
     * @param id
     * @return
     */
    @Select("SELECT * FROM ignite_user WHERE name = #{name} and password = #{password}")
    User findByNamePass(String name,String password);

    /**
     * 查询所有用户记录
     * @return
     */
    @Select("Select * from ignite_user")
    List<User> findAll();

    /**
     * 插入一条用户记录
     * @param user
     * @return
     */
    @Insert("INSERT INTO ignite_user(name,password,phone,email) VALUES(#{name},#{password},#{phone},#{email})")
    int insert(User user);

    /**
     * 更新一条用户记录
     * @param user
     */
    @Update("UPDATE ignite_user SET name=#{name},password=#{password},phone=#{phone},email=#{email} WHERE id=#{id}")
    void update(User user);

    /**
     * 删除一条用户记录
     * @param id
     */
    @Delete("DELETE FROM ignite_user WHERE id =#{id}")
    void delete(Long id);

    /**
     * 插入多条用户记录
     * @param map
     * @return
     */
    @Insert("INSERT INTO ignite_user((name,password,phone,email) VALUES(#{name,jdbcType=VARCHAR}, #{password,jdbcType=VARCHAR}, #{phone,jdbcType=VARCHAR}, #{email,jdbcType=VARCHAR})")
    int insertByMap(Map<String, Object> map);

}
