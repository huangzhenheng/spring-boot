package com.tianque.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.tianque.entity.User;

@Mapper
public interface UserMapper {
	User getUserById(Long id);
}
