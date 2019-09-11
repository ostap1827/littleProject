package ua.ivanskyi.shop.controller;

import javax.inject.Inject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import ua.ivanskyi.shop.service.UserService;

@Controller
@RequestMapping(value = "/registration")
public class RegistrationController {

	@Autowired
	private UserService userService;

	@RequestMapping(method = RequestMethod.GET)
	public String registrationForm() {
		return "registration";
	}

	@RequestMapping(value = "/addNewUser", method = RequestMethod.POST)
	public String addNewUser(@RequestParam String userName, @RequestParam String userPassword) {

		userService.saveNewUser(userName, userPassword);

		return "redirect:/home";
	}
}
