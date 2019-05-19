package com.luv2code.springdemo.mvc;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Valid;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import javax.validation.constraints.Email;
import javax.validation.groups.Default;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	// add an initbinder to convert trim input string
	// remove leading and trailing whitespaces
	// resolve issue for our validation
	@InitBinder
	public void initBinderMethod(WebDataBinder dataBinder) {
		System.out.println("Inside @InitBinder");
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}

	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		theModel.addAttribute("customer", new Customer());
		return "customer-form";
	}

	@RequestMapping("/processForm")
	public String processForm(@Valid @ModelAttribute("customer") Customer theCustomer, BindingResult bindingResult) {
		System.out.println("Last name : |" + theCustomer.getLastName() + "|");
		System.out.println("Email : |" + theCustomer.getEmail() + "|");
		if (bindingResult.hasErrors())
			return "customer-form";

		/*
		 * Other way of validating. Remove @Valid, BindingResult bindingResult and above
		 * if block Below one does validations on specified group/fields (like
		 * Default.class, Email.class) defined in Customer class and not all fields
		 * where as @Valid does validation on entire @ModelAttribute object and stores
		 * the validation results in BindingResult bindingResult
		 */

		ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
		Validator validator = validatorFactory.getValidator();
		Set<ConstraintViolation<Customer>> failure = validator.validate(theCustomer, Default.class, Email.class);
		failure.stream().findFirst().ifPresent(cv -> theCustomer.setErrorMessage(cv.getMessageTemplate()));
		System.out.println("Error Message : |" + theCustomer.getErrorMessage() + "|");
		if (failure.size() > 0)
			return "customer-form";

		return "customer-confirmation";
	}

}
