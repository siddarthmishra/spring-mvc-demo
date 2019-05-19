package com.luv2code.springdemo.mvc;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;

@ControllerAdvice
public class GlobalInitializer {

	public GlobalInitializer() {
		System.out.println("GlobalInitializer no-arg constructor");
	}

	@InitBinder
	public void initBinderMethod(WebDataBinder dataBinder) {
		System.out.println("Inside @InitBinder of GlobalInitializer");
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
}
