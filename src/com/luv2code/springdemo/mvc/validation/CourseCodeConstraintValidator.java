package com.luv2code.springdemo.mvc.validation;

import java.util.function.Supplier;
import java.util.stream.Stream;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

	private String[] coursePrefix;

	public void initialize(CourseCode theCourseCode) {
		System.out.println("inside initialize CourseCodeConstraintValidator");
		coursePrefix = theCourseCode.value();
	}

	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext constraintValidatorContext) {
		System.out.println("inside isValid CourseCodeConstraintValidator");
		boolean valid = false;
		if (theCode != null) {
			Supplier<Stream<String>> supplier = () -> Stream.of(coursePrefix);
			valid = supplier.get().anyMatch(prefix -> theCode.startsWith(prefix));
		} else {
			valid = true;
		}
		return valid;
	}

}