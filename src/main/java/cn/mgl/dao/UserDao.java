package cn.mgl.dao;

import cn.mgl.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author MongieLee
 * @version 1.0
 * @date 2022/10/26 13:43
 */
public interface UserDao {
    int insertUser(User user);

    int deleteUser(Long id);

    int updateUser(User suer);

    User selectById(Long id);

    List<User> selectAll();

    List<User> selectAllOfSort(String sort);

    User giveTwoParameter(@Param("username") String username,@Param("age") Integer age);
}
