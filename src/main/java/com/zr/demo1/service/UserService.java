package com.zr.demo1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zr.demo1.model.User;
import com.zr.dubbo.service.DubboService;

@Service
public class UserService {
	@Reference(version = "1.0.0",check = false)    // @Reference在需要的服务上面生成调用方  SCan扫描的就是 @Reference所在的地方
    public DubboService dubboService;
	
	public List<User> findAllUsers(){
		return dubboService.A();
	};
}
