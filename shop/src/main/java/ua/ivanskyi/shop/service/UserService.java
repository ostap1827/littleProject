package ua.ivanskyi.shop.service;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import ua.ivanskyi.shop.entity.User;


public interface UserService {

	void saveNewUser(String userName, String userPassword);

	List<User> getListOfAllUsers();

}
