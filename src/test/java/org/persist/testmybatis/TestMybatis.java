package org.persist.testmybatis;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.persist.model.User;
import com.persist.service.IUserService;
import com.sun.istack.internal.logging.Logger;

@RunWith(SpringJUnit4ClassRunner.class)//表示继承了SpringJUnit4ClassRunner类
//引入配置文件
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestMybatis {
	
	//定义一个logger
	private Logger logger = Logger.getLogger(TestMybatis.class);
	//定义一个Service资源
	@Resource
	private IUserService userService;
	
	/* @Test  
    public void test1() {  
        User user = userService.getUserById(1);  
        // System.out.println(user.getUserName());  
        // logger.info("值："+user.getUserName());  
        logger.info(JSON.toJSONString(user));  
    }  */
	@Test
	public void test1(){
		User user = userService.getUserById(1);
		logger.info("############"+JSON.toJSONString(user));		
	}

}
