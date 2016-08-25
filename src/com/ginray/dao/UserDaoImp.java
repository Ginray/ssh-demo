package com.ginray.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ginray.entity.User;

public class UserDaoImp implements IUserDao{

	private SessionFactory sessionFactory;
	
	public void setSessionFactory(SessionFactory sessionFactory){
		this.sessionFactory=sessionFactory;
	}
	
	public Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public void AddUser(User user) {
		System.out.println("--- UserDaoImp.AddUser ---");
		getSession().save(user);
	}

	@Override
	public void modifyUser(User user) {
		System.out.println("-------UserDaoImp.modifyUser-----------"
				+ user.getName());
		System.out.println("id  "+user.getId());
		//User fuser=new User();
		//System.out.println("fuser   "+fuser.getId());
		//user.setId(1);  //TO BE FIX 
		try{
		getSession().update(user);
		}catch(Exception e){
			e.printStackTrace();	
		}
	}

	@Override
	public void deleteUser(User user) {
		System.out.println("-------UserDaoImp.deleteUser-----------"
				+ user.getName());
		getSession().delete(user);
	}
	
}
