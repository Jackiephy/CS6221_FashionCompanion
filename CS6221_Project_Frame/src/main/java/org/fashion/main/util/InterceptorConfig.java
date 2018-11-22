package org.fashion.main.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {
	
	// 登录拦截器的创建
	// 本注解用于创建Spring MVC的拦截器对象
	@Bean
	public LoginInterceptor getLoginInteceptor(){
		return new LoginInterceptor();
	}
		
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
	
		// 对系统进行拦截器的创建
		InterceptorRegistration login = registry.addInterceptor(getLoginInteceptor());
		// 加入对应的匹配路径 同时将不拦截的路径进行放行 
		login.addPathPatterns(new String[]{"/*/*" , "/*/*/*"});
		// 配置排除的路径 
		login.excludePathPatterns("/main/login" ,"/css/**", "/fonts/**", "/img/**","/js/**","/scss/**");
		
	}
	
}



