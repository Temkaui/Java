package com.codingdojo.login.validators;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

import org.springframework.stereotype.Component;


@Component
public class UserValidator {
	
	public static Pattern EMAIL_REGEX = Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]+");
	
	public UserValidator() {
		
	}
	
	public HashMap<String, Object> register ( Map<String, String> body){
		HashMap<String, Object> result = new HashMap<String, Object>();
		
		if(body.get("username").length()<3) {
			result.put("username", "Username must be at least 3 letters!!!");
		}
		if(body.get("email").length()<1) {
			result.put("email", "Email is required");
		}
		else if(!EMAIL_REGEX.matcher(body.get("email")).matches()) {
			result.put("email", "Email is already in use!!!");
		}
		if(body.get("password").length()<8) {
			result.put("password", "Password must be more than 8 character long!!!");
		}
		if(body.get("confirm").length()<1) {
			result.put("confirm", "Password needs to confirmed!!!");
		}
		if(!body.get("confirm").equals(body.get("password"))) {
			result.put("confirm", "Confirmation password must match with password!!!");
		}
		
//		if(result.size() == 0) {
//			result.put("valid", true);
//		}
//		else {
//			result.put("valid", false);
//		}
		
		result.put("valid", result.size() == 0);
		return result;
	}
}

