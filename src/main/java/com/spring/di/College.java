package com.spring.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class College {
@Value("${college.Name}")
	private String collegeName;
	@Autowired
	private Principal principal;
	
	@Autowired
	@Qualifier("mathTeacher")
    private Teacher teacher;

	
	public void test()
	{
		System.out.println("testing this class method");
		teacher.teach();
		System.out.println("my college name is : " + collegeName);
	}
}
