package org.fashion.main.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.fashion.main.domain.User;

public interface FashionService {

	Map<String, Object> login(Map<String, Object> params);
	Map<String, Object> register(Map<String, Object> params);
}
