package es.begeek.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "attachment")
public class Attachment implements Serializable {

	private static final long serialVersionUID = 1L;
	private Long idAttachment;

	@Id
	@GeneratedValue
	@Column(name = "idAttachment")
	public Long getIdAttachment() {
		return this.idAttachment;
	}

	public void setIdAttachment(Long idAttachment) {
		this.idAttachment = idAttachment;
	}

}
