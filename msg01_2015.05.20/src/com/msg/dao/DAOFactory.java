package com.msg.dao;

public class DAOFactory {
    	public static IUserDao getUserDao(){
    		return new UserDao();
    	}
}
