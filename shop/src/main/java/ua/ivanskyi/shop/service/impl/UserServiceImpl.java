package ua.ivanskyi.shop.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import ua.ivanskyi.shop.dao.UserOperation;

import ua.ivanskyi.shop.entity.User;
import ua.ivanskyi.shop.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserOperation userOperation;

	@Transactional
	public void saveNewUser(String userName, String userPassword) {
		userOperation.save(new User(userName, userPassword));
	}

	@Transactional
	public List<User> getListOfAllUsers() {
		return userOperation.findAll();
	}

}
