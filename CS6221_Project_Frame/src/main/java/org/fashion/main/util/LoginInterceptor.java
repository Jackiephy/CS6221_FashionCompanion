package org.fashion.main.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.fashion.main.domain.User;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInterceptor extends HandlerInterceptorAdapter {
	
	//private Logger logger = Logger.getLogger(LoginInterceptor.class);
    
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		/** Intercepted the user's request */
		String requestUrl = request.getRequestURL().toString();
        /** */
		System.out.println("requestUrl:"+requestUrl);
		/** Determine whether there is a user in the session. 
		 *  If there is a description that the user has logged in, it should be released. */
		User user = (User) request.getSession().getAttribute(UserContants.USER_SESSION);
		if(user!=null){
			System.out.println("requestUrl:"+requestUrl+"->Is logged in！");
			/** Current request: 
			 *  Whether each request is a thread   */
			UserHolder.addCurrentUser(user);
			return true;
		}else{
			// Redirect 
			response.sendRedirect(request.getContextPath()+"/main/login");
			System.out.println("requestUrl:"+requestUrl+"->Intercepted！");
			return false;
		}
	}
	
	

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		UserHolder.removeCurrentUser();
	}
	
}
