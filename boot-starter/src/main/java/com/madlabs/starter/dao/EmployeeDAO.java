package com.madlabs.starter.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.madlabs.starter.modal.Employee;

@Component
public class EmployeeDAO {

/*	@Autowired
	@Qualifier("hrJdbcTemplate")
	JdbcTemplate hrJdbcTemplate;
*/
	@Autowired
	@Qualifier("adminJdbcTemplate")
	JdbcTemplate adminJdbcTemplate;

	public List<Employee> getEmployees() {

		List<Employee> empList = adminJdbcTemplate.query(
				"SELECT EMPLOYEE_ID, FIRST_NAME, LAST_NAME, EMAIL, PHONE_NUMBER, HIRE_DATE, JOB_ID, "
						+ "SALARY, COMMISSION_PCT, MANAGER_ID, DEPARTMENT_ID" + " FROM EMPLOYEES",
				new RowMapper<Employee>() {

					@Override
					public Employee mapRow(ResultSet result, int row) throws SQLException {

						Employee emp = new Employee();
						emp.setEmpID(result.getLong("EMPLOYEE_ID"));
						emp.setfName(result.getString("FIRST_NAME"));
						emp.setlName(result.getString("LAST_NAME"));
						emp.setEmail(result.getString("EMAIL"));
						emp.setPhoneNumber(result.getString("PHONE_NUMBER"));
						// emp.setHireDate(result.getDate("HIRE_DATE"));
						emp.setJobID(result.getString("JOB_ID"));
						emp.setSalary(result.getDouble("SALARY"));
						emp.setCommissionPCT(result.getDouble("COMMISSION_PCT"));
						emp.setManagerID(result.getLong("MANAGER_ID"));
						emp.setDepID(result.getLong("DEPARTMENT_ID"));
						return emp;
					}
				});
		return empList;
	}

}