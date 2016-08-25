package com.ginray.action;

import javax.annotation.Resource;

import com.ginray.entity.User;
import com.ginray.service.IUserManage;
import com.opensymphony.xwork2.ActionSupport;

public class UserAction extends ActionSupport {
	
	private User user;

	@Resource  
	private IUserManage userManage;
	

	public void setUserManage(IUserManage userManage) {
		this.userManage = userManage;
	}
	
	public IUserManage getUserManage() {
		return userManage;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public String addUser()
	{
		System.out.println("-------userAction.addUser--------"+user.getName());
		try{
			userManage.addUser(user);
			return "success";
		}catch (Exception e ){
			return "fail";
		}
	}
	
	public String modifyUser()
	{
		System.out.println("-------userAction.modifyUser--------"+user.getName());
		try{
			userManage.modifyUser(user);
			return "success";
		}catch(Exception e){
			return "fail";
		}
		
	}
	
	public String deleteUser()
	{
		System.out.println("-------userAction.deleteUser--------"+user.getName());
		try{
			userManage.deleteUser(user);
			return "success";
		}
		catch(Exception e){
			return "success";
		}
	}
	
	
}
