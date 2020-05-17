package com.exps.factory;

import com.exps.dao.DAO;
import com.exps.dao.ExcelCourseDAOImpl;
import com.exps.dao.ExcelStudentDAOImpl;

public class ExcelDaoFactory implements DAOFactory{
	public DAO createDAO(String type) {
		DAO dao = null;
		if (type.equalsIgnoreCase("student")) {
			dao = new ExcelStudentDAOImpl();
		} else if (type.equalsIgnoreCase("course")) {
			dao = new ExcelCourseDAOImpl();
		} else
			throw new IllegalArgumentException("Invalid Dao input");
		return dao;
	}
}