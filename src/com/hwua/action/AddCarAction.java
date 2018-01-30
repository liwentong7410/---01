package com.hwua.action;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.hwua.bean.Car;
import com.opensymphony.xwork2.ModelDriven;

public class AddCarAction implements ModelDriven<Car>{

	private Car car=new Car();
	private String error;
	
	
	public String getError() {
		return error;
	}


	/**
	 * 添加汽车
	 */
	public String addCar(){
		//1.解析Hibernate配置文件
		Configuration cfg = new Configuration().configure();
		//2.创建SessionFactory
//				SessionFactory ssf = cfg.buildSessionFactory();//hibernate3.X版本使用
		ServiceRegistry serviceRegistry = 
				new StandardServiceRegistryBuilder()
				.applySettings(cfg.getProperties())
				.build();
		SessionFactory ssf = cfg.buildSessionFactory(serviceRegistry);
		//3.创建session对象
		Session session = ssf.openSession();
		
		session.save(car);
		
		session.beginTransaction().commit();//提交事务
		
		session.close();
		error="添加成功！";
		return "addCar";
	}
	
	
	@Override
	public Car getModel() {
		return car;
	}

}
