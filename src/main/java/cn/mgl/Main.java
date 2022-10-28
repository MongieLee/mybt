package cn.mgl;

import cn.mgl.dao.UserDao;
import cn.mgl.pojo.User;
import cn.mgl.utils.SqlSessionUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @author MongieLee
 * @version 1.0
 * @date ${DATE} ${TIME}
 */
public class Main {
    public static void main(String[] args) {
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        PageHelper.startPage(2, 10);
        List<User> users = mapper.selectAll();
        users.forEach(System.out::println);
        PageInfo<User> tPageInfo = new PageInfo<>(users);
        sqlSession.close();
    }

    static public void insert() {
        SqlSession sqlSession = SqlSessionUtil.openSqlSession();
        UserDao mapper = sqlSession.getMapper(UserDao.class);
        PageHelper.startPage(2, 10);
        List<User> users = mapper.selectAll();
        users.forEach(System.out::println);
        sqlSession.close();
    }
}
