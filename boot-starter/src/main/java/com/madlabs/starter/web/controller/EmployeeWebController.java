package com.madlabs.starter.web.controller;

import org.apache.log4j.Logger;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@ConfigurationProperties(prefix = "employeeWeb")
public class EmployeeWebController {

	private static final Logger LOGGER = Logger.getLogger(EmployeeWebController.class.getName());

	private String webKey;

	/**
	 * get all employees detail
	 */
	@RequestMapping(value = "/home", method = RequestMethod.GET, produces = "text/html")
	public String displayGetEmployeeDetail(Model model) {
		LOGGER.debug("profile DEBUG");
		LOGGER.info("profile INFO");
		LOGGER.warn("profile warn");
		model.addAttribute("testValue", "Test Value");
		System.out.println("/home " + webKey);
		return "listEmployees";
	}

	public void setWebKey(String webKey) {
		this.webKey = webKey;
	}

}
