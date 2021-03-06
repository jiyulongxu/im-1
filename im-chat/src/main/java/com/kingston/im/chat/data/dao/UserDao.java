package com.kingston.im.chat.data.dao;

import org.springframework.stereotype.Repository;

import com.kingston.im.chat.data.model.User;

@Repository
public interface UserDao {
	
	public int getMaxId();

	public User findById(Long id);
	
	public User findByName(String nickName);
	
	public void addUser(User user);
	
	public void delUser(Integer id);
	
	public void updateUser(User user);
}
