package com.uaf.pay.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;
@Component
public class SpringContextTool implements ApplicationContextAware{

	private static ApplicationContext context;
	@Override
	public void setApplicationContext(ApplicationContext acx)
			throws BeansException {
		context=acx;
	}

	public static ApplicationContext getApplicationContext(){
		return context;
	}
}
