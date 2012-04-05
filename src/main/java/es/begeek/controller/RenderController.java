package es.begeek.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import es.begeek.dao.AttachmentDao;
import es.begeek.entity.Attachment;

@Controller
public class RenderController {
	private final Logger log = Logger.getLogger(this.getClass());
	@Autowired
	private AttachmentDao attachmentDao;
	
	@RequestMapping("hello.htm")
	public ModelAndView show() {
		if (log.isDebugEnabled()) {
			log.debug("->action method:show()");
		}
		
		Attachment att = attachmentDao.getAttachment(4L);

		if (log.isDebugEnabled()) {
			log.debug("<-action method:show()");
		}
		return new ModelAndView("hello");
	}

}