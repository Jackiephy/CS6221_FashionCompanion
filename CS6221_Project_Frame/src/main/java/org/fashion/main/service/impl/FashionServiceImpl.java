package org.fashion.main.service.impl;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.fashion.common.util.CommonContants;
import org.fashion.main.domain.Clothes;
import org.fashion.main.domain.User;
import org.fashion.main.repository.BillRepository;
import org.fashion.main.repository.ClothesRepository;
import org.fashion.main.repository.UserRepository;
import org.fashion.main.service.FashionService;
import org.fashion.main.util.UserContants;
import org.fashion.main.util.UserException;
import org.fashion.main.util.UserHolder;
import org.springframework.transaction.annotation.*;
import org.springframework.util.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


@Service("service")
@Transactional(readOnly=true)
public class FashionServiceImpl implements FashionService{
	/** 定义Repository对象 */
	@Autowired  // bytype
	@Qualifier("userRepository") // byName
	private UserRepository userRepository;
	
	@Autowired  // bytype
	@Qualifier("billRepository") // byName
	private BillRepository billRepository;
	
	@Autowired  // bytype
	@Qualifier("clothesRepository") // byName
	private ClothesRepository clothesRepository;
	
	
	@Override
	public Map<String , Object> login(Map<String, Object> params) {
		Map<String , Object> result = new HashMap<>();
		try {
			/** 处理登录的业务逻辑   */
			/** 1.参数非空校验  */
			String uname = (String) params.get("uname");
			String password = (String) params.get("password");
			String vcode = (String) params.get("vcode");
			HttpSession session = (HttpSession) params.get("session");
			// userId!=null&&!userId.equals("")
			if(StringUtils.isEmpty(uname) || StringUtils.isEmpty(password)
					|| StringUtils.isEmpty(vcode) ){
				/** 参数有为空的 */
				result.put("status", 0);
				result.put("tip", "参数有为空的");
			}else{
				/** 参数不为空  */
				/** 校验验证码是否正确 
				 *  获取session中当前用户对应的验证码 
				 * */
				String sysCode = (String) session.getAttribute(CommonContants.VERIFY_SESSION);
				if(vcode.equalsIgnoreCase(sysCode)){
					/** 验证码正确了  */
					/** 根据登录的用户名去查询用户: 判断登录名是否存在  */
					User user = getUserById(uname);
					if(user!=null){
						/** 登录名存在  */
						/** 判断密码 */
						if(user.getPassword().equals(password)){
								/** 登录成功  */
								/** 1.把登录成功的用户放入当前用户的session会话中  */
								session.setAttribute(UserContants.USER_SESSION, user);
								System.out.println("设置用户 ---------------->：" + user);
								result.put("status",1);
								result.put("tip", "登录成功");
								/** 把登录成功的用户存入到UserHolder*/
								UserHolder.addCurrentUser(user);
								
						}else{
							/** 密码错误     */
							result.put("status", 2);
							result.put("tip", "密码错误了");
						}
					}else{
						/** 登录名不存在  */
						result.put("status", 3);
						result.put("tip", "没有该账户");
					}
				}else{
					/** 验证码不正确 */
					result.put("status", 4);
					result.put("tip", "验证码不正确");
				}
			}
			return result;
		} catch (Exception e) {
			throw new UserException("异步登录业务层抛出异常了", e);
		}
		
	}


	public User getUserById(String uname) {
		try {
			User user = userRepository.findById(uname).get();
			if(user!=null) {
				return user ;
			}
			return null;
		} catch (Exception e) {
			throw new UserException("查询用户失败了", e);
		}
	}
	
	@Override
	public Map<String , Object> register(Map<String, Object> params) {
		Map<String , Object> result = new HashMap<>();
		try {
			/** 处理注册的业务逻辑   */
			/** 1.参数非空校验  */
			String uname = (String) params.get("uname");
			String password = (String) params.get("password");
			Clothes preference= (Clothes) params.get("preference");
			String address=(String) params.get("address");
			String phone=(String) params.get("phone");

			// userId!=null&&!userId.equals("")
			if(StringUtils.isEmpty(uname) || StringUtils.isEmpty(password)
					|| StringUtils.isEmpty(address)|| StringUtils.isEmpty(phone)||preference==null ){
				/** 参数有为空的 */
				result.put("tip", "参数有为空的");
			}else {
				if(uname.matches("\\w+@\\w+\\.\\w+\\.?\\w*")) {
					User user = getUserById(uname);
					if(user==null) {
						if(password.length()>=6) {
							if(phone.length()==11&&(phone.matches("\\d+"))){
								result.put("tip", "注册成功！");	
							}else {
								result.put("tip", "请使用正确的手机号");
							}
						}else {
							result.put("tip", "密码少于6位");
						}
						
					
				}else {
					result.put("tip", "该邮箱已注册，请使用其他邮箱");
				}
				
			}else {
				result.put("tip", "请使用邮箱注册");
			}
			}	
			return result;
		} catch (Exception e) {
			throw new UserException("异步登录业务层抛出异常了", e);
		}
		
	}
	

}
