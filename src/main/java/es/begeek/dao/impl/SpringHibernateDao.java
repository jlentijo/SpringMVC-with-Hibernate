package es.begeek.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import es.begeek.dao.Dao;

@Repository
public class SpringHibernateDao implements Dao {
	private SessionFactory sessionFactory;
	
//	@Transactional
	@Override
    public void save(Object entity) {
		System.out.println("------ SAVE");
		sessionFactory.getCurrentSession().saveOrUpdate(entity);
	}
//	@Transactional
	@Override
    public void merge(Object entity) {
		System.out.println("------ MERGE");
		sessionFactory.getCurrentSession().merge(entity);
	}	
//	@Transactional
	@Override
    public void delete(Object entity){
		System.out.println("------ DELETE");
		sessionFactory.getCurrentSession().delete(entity);
	}
	@Override
    public void delete(String hql){
		System.out.println("----------------QUERY: "+hql);
		sessionFactory.getCurrentSession().createQuery(hql).executeUpdate();

	}
//	@Transactional(readOnly = true)
	@Override
    public <T> List<T> find(Class<T> entityClass) {
//		final List<T> entities = sessionFactory.getCurrentSession().loadAll(entityClass);
//		return entities;
		return null;
	}
//	@Transactional(readOnly = true)
	@Override
    public <T>T get(Class<T> entityClass, Serializable id){
		return (T) sessionFactory.getCurrentSession().get(entityClass, id);
	}
	@Override
    @SuppressWarnings("unchecked")
//	@Transactional(readOnly = true)
	public <T> List<T> find(String hql) {
		System.out.println("----------------: "+hql);
		final List<T> entities = sessionFactory.getCurrentSession().find(hql);
		return entities;
	}
//	@Transactional
	public void save(Object[] entities) {
		for(Object entity : entities) {
			save(entity);
		}
	}
//	@Transactional
	@Override
    public void update(String hql) {
		System.out.println("----------------QUERY: "+hql);
		sessionFactory.getCurrentSession().createQuery(hql).executeUpdate();		
	}
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
}
