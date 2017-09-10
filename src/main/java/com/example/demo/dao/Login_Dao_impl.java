package com.example.demo.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.Entities.User;

@Transactional
@Component
public class Login_Dao_impl implements Login_Dao {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public User get(String email, String pass) {
		Session session = sessionFactory.openSession();

		session.beginTransaction();
		Query q = session.createQuery("From User where email=:email and password =:pass");
		q.setParameter("email", email);
		q.setParameter("pass", pass);
		User resultList = (User) q.uniqueResult();

		session.getTransaction().commit();

		session.close();

		return resultList;
	}

}
