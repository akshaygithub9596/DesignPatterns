package com.exps.test;

import com.exps.dao.DAO;
import com.exps.factory.DBDaoFactory;
import com.exps.factory.ExcelDaoFactory;

public class AbstractFactoryProblemTest {
	public static void main(String[] args) {
		DAO dao1 = null, dao2 = null;
		dao1 = DBDaoFactory.createDAO("student");
		dao1.insert();
		System.out.println("================");
		dao2 = ExcelDaoFactory.createDAO("course");
		dao2.insert();
	}
}
 