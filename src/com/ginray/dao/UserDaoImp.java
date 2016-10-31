package com.ginray.dao;

import org.hibernate.Query;
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
		//user.setId(1);  //TO BE FIX 
		try{
			Query q = getSession().createQuery("update User user set password ="+user.getPassword()+",age="+user.getAge()+" where user.name="+user.getName());
	        //getSession().update(user);
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
