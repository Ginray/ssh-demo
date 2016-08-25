package com.ginray.interceptor;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class CheckLogin implements Interceptor {

	@Override
	public void destroy() {
		System.out.println("--checklogin.destory---");
	}

	@Override
	public void init() {
		System.out.println("---checklogin.init--");
	}

	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		System.out.println("--checklogin.intercept--");
		Map session =ActionContext.getContext().getSession();
		if(session.get("user.name")!=null){
			System.out.println("0.0  login succes");
			return arg0.invoke();
		}
		System.out.println("0.0  login fail");
		return "checkLoginFail";
	}

	

}
