package es.begeek.dao;

import java.io.Serializable;
import java.util.List;

public interface Dao {     
   public void save(Object entity);
   public void merge(Object entity);
   public void delete(Object entity);
   public void delete(String hql);
   public <T> List<T> find(Class<T> entityClass);
   public <T> T get(Class<T> entityClass, Serializable id);  
   public <T> List<T> find(String hql);
   public void update(String hql);
} 
