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
	 * �������
	 */
	public String addCar(){
		//1.����Hibernate�����ļ�
		Configuration cfg = new Configuration().configure();
		//2.����SessionFactory
//				SessionFactory ssf = cfg.buildSessionFactory();//hibernate3.X�汾ʹ��
		ServiceRegistry serviceRegistry = 
				new StandardServiceRegistryBuilder()
				.applySettings(cfg.getProperties())
				.build();
		SessionFactory ssf = cfg.buildSessionFactory(serviceRegistry);
		//3.����session����
		Session session = ssf.openSession();
		
		session.save(car);
		
		session.beginTransaction().commit();//�ύ����
		
		session.close();
		error="��ӳɹ���";
		return "addCar";
	}
	
	
	@Override
	public Car getModel() {
		return car;
	}

}
