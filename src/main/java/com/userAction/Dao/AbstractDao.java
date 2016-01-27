package com.userAction.Dao;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.userAction.Bo.util.CountryAndState;

public class AbstractDao {

	@Autowired
	private SessionFactory sessionFactory;

	public int saveObject(Object obj) throws HibernateException {
		Session session = this.sessionFactory.openSession();
		try {

			Transaction tx = session.beginTransaction();
			session.persist(obj);
			tx.commit();
			return 1;
		} catch (Exception ex) {
			throw new HibernateException(ex.getMessage());
		} finally {
			session.close();
		}
	}

	@Transactional
	public List<?> getResultsFromQuerrywithEquals(String queryString, Class className, Map<String, String> equalParams) {

		Session session = this.sessionFactory.openSession();
		try {
			Criteria crt = session.createCriteria(className);
			//crt.add(Restrictions.eq("countryName","United Stats"));
			if (equalParams != null && equalParams.size() > 0) {
				Set<String> keys = equalParams.keySet();
				for (String key : keys) {
					crt.add(Restrictions.eq(key, equalParams.get(key)));
				}
			}
			crt.list();
			return (List<?>) crt.list();
		} finally {
			session.close();
		}
	}

	public SessionFactory getsessionFactory() {
		return this.sessionFactory;
	}

}
