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
public class SignUp_Dao_impl implements SignUp_Dao {
	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public void save_User(User user_Entities) {

		Session session = sessionFactory.openSession();

		session.beginTransaction();

		session.save(user_Entities);
		session.getTransaction().commit();
		session.close();

	}

	@Override
	public User check_Mail(String email) {
		Session session = sessionFactory.openSession();

		session.beginTransaction();

		Query query = session.createQuery("from User where email=:email");
		query.setParameter("email", email);
		User user_Entities = (User) query.uniqueResult();
		session.getTransaction().commit();
		session.close();
		User userRestult = new User();

		if (user_Entities == null) {
			userRestult.setStatus(1);
		} else {

			userRestult.setStatus(0);
		}
		return userRestult;
	}

}
