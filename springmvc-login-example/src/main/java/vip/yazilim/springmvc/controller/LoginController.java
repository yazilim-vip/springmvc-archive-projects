package vip.yazilim.springmvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
public class LoginController {

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String showLogin() {
		return "login";
	}

	@RequestMapping(value = "/doLogin", method = RequestMethod.POST)
	public String doLogin(@RequestParam String username
			,@RequestParam String password
			,HttpSession session) {

		if (username.equalsIgnoreCase("yazilim") && password.equals("vip")) {
			session.setAttribute("name",username);
			return "home";
		}
		else {
			session.setAttribute("errorMessage","Invalid Username or Password (session)!");
			return "redirect:/login";
		}
	}

	@RequestMapping(value = "/doLoginWithModel", method = RequestMethod.POST)
	public String doLoginWithModel(@RequestParam String username,
			@RequestParam String password, ModelMap model) {
		if (username.equalsIgnoreCase("yazilim") && password.equals("vip")) {
			model.put("name", username);
			return "home";
		}
		else {
			model.put("errorMessage", "Invalid Username or Password !");
			return "login";
		}
	}
}
