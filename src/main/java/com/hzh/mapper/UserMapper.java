package com.hzh.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.hzh.entity.User;

@Mapper
public interface UserMapper {
	User getUserById(Long id);
}
