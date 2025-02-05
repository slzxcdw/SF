package com.run.service;

import org.springframework.web.multipart.MultipartFile;

import com.run.entity.User;
import net.sf.json.JSONObject;

public interface UserService {
	JSONObject logincheck(User user);
	JSONObject register(User user);
	JSONObject useractive(int uid);
	
	JSONObject updateuser(User user);
	JSONObject askcollector(int uid);
	JSONObject askhistory(int uid);
	
	JSONObject mdfypassword(int uid, String oldp, String newp);
	
	JSONObject askcomment(int uid);
	JSONObject askworks(int uid);
	JSONObject askselfworks(int uid);
	JSONObject askuser(int uid);
	JSONObject setImg(int uid, MultipartFile file);
	
	int tplogin(JSONObject info);
	
}
