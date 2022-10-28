package cn.mgl.dao;

import cn.mgl.pojo.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author MongieLee
 * @version 1.0
 * @date 2022/10/26 16:54
 */
public interface UserAnnoDao {
    @Insert("insert into t_user (username, password, age, gender) values (#{username}, #{password}, #{age}, #{gender})")
    int insertUser(User user);

    @Delete("delete from t_user where id = #{id}}")
    int deleteUser(Long id);

    @Update("update t_user set username = #{username} where id = #{id}")
    int updateUser(User suer);

    @Select("select * from t_user where id #{id}}")
    User selectById(Long id);
}
