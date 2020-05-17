package com.exps.factory;

import com.exps.dao.DAO;
import com.exps.dao.DBCourseDAOImpl;
import com.exps.dao.DBStudentDAOImpl;

public class DBDaoFactory implements DAOFactory{
	public DAO createDAO(String daoType) {
		DAO dao = null;
		if (daoType.equalsIgnoreCase("student")) {
			dao = new DBStudentDAOImpl();
		} else if (daoType.equalsIgnoreCase("course")) {
			dao = new DBCourseDAOImpl();
		} else
			throw new IllegalArgumentException("Invalid Dao input");
		return dao;
	}
}
