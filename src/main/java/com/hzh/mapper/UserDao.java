package com.hzh.mapper;

import java.util.ArrayList;
import java.util.List;

import com.hzh.entity.User;

public class UserDao {
	public List<User> queryUserList() {
        List<User> result = new ArrayList<User>();
        // 模拟数据库的查询
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setName("username_" + i);
            result.add(user);
        }
        return result;
    }
}
