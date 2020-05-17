package com.exps.factory;

//Abstract Factory or Super Factory
public class DAOFactoryCreator {
	public static DAOFactory buidDAOFactory(String factoryType) {
		DAOFactory factory = null;
		if (factoryType.equalsIgnoreCase("excel"))
			factory = new ExcelDaoFactory();
		else if (factoryType.equalsIgnoreCase("db"))
			factory = new DBDaoFactory();
		else
			throw new IllegalArgumentException("Invalid Factory type");
		return factory;
	}
}
