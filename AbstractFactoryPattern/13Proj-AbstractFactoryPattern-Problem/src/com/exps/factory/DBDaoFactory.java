package com.exps.factory;

import com.exps.dao.DAO;
import com.exps.dao.DBCourseDAOImpl;
import com.exps.dao.DBStudentDAOImpl;

public class DBDaoFactory {
	public static DAO createDAO(String type) {
		DAO dao = null;
		if (type.equalsIgnoreCase("student")) {
			dao = new DBStudentDAOImpl();
		} else if (type.equalsIgnoreCase("course")) {
			dao = new DBCourseDAOImpl();
		} else
			throw new IllegalArgumentException("Invalid Dao input");
		return dao;
	}
}
