package es.begeek.controller;

import junit.framework.Assert;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.servlet.ModelAndView;

import es.begeek.BeGeekBaseTest;

public class RenderControllerTest extends BeGeekBaseTest{
	
	@Autowired
	private RenderController renderController;
	
	@Test
	public void testShow() {
		ModelAndView result = renderController.show();
		Assert.assertEquals("hello", result.getViewName());
	}

}
