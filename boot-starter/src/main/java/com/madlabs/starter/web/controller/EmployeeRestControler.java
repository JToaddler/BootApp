package com.madlabs.starter.web.controller;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.ui.Model;
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.madlabs.starter.dao.EmployeeDAO;
import com.madlabs.starter.modal.Employee;

@RestController
@ConfigurationProperties(prefix = "employeeRest")
public class EmployeeRestControler {

	private static final Logger LOGGER = Logger.getLogger(EmployeeRestControler.class.getName());

	@Autowired
	EmployeeDAO dao;

	private String restKey;

	@RequestMapping(value = "/getAllEmployee", method = RequestMethod.POST)
	public List<Employee> getAllEmployee() {

		LOGGER.debug("profile DEBUG");
		LOGGER.info("profile INFO");
		LOGGER.warn("profile warn");
		System.out.println("getEmployee " + restKey);
		return dao.getEmployees();

	}

	public void setRestKey(String restKey) {
		this.restKey = restKey;
	}

	@RequestMapping(value = "/checkError", method = RequestMethod.GET)
	public String throwError(ModelAndView model) {
		try {
			Assert.isTrue(false, "throwing Error!!");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			model.setViewName("error");
		}
		return "";
	}

}
