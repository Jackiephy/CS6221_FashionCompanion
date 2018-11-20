package org.fashion.main.util;

import org.fashion.main.domain.User;

public class UserHolder {
	/** Define a ThreadLocal to store the login user corresponding to a current request thread */
	private static ThreadLocal<User> users = new ThreadLocal<>();
	
	public static void addCurrentUser(User user){
		if(users.get()== null){
			users.set(user);
		}
	}
	
	public static User getCurrentUser(){
		return users.get();
	}

	public static void removeCurrentUser() {
		users.remove();
	}
}
