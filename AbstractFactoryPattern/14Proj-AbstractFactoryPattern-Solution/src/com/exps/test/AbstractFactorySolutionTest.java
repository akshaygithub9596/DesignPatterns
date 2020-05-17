package com.exps.test;

import com.exps.dao.DAO;
import com.exps.factory.DAOFactory;
import com.exps.factory.DAOFactoryCreator;

public class AbstractFactorySolutionTest {
	public static void main(String[] args) {
		DAO dao1 = null, dao2 = null;
		DAOFactory factory = null;
		factory = DAOFactoryCreator.buidDAOFactory("excel");
		dao1 = factory.createDAO("student");
		dao2 = factory.createDAO("course");
		dao1.insert();
		dao2.insert();
	}
}
