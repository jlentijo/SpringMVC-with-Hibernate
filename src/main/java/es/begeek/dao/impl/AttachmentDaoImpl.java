package es.begeek.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import es.begeek.dao.AttachmentDao;
import es.begeek.dao.Dao;
import es.begeek.entity.Attachment;

@Repository
public class AttachmentDaoImpl implements AttachmentDao{
	@Autowired
	private Dao dao;
	
	@Transactional
	public Attachment getAttachment(Long idAttachment){
		return dao.get(Attachment.class, idAttachment);
	}
}