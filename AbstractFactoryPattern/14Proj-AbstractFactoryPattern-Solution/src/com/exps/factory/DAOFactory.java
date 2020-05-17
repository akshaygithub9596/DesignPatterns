package com.exps.factory;

import com.exps.dao.DAO;

public interface DAOFactory {
public DAO createDAO(String type);
}
 