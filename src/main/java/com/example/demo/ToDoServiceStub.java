package com.example.demo;

import java.util.Arrays;
import java.util.List;

public class ToDoServiceStub implements ToDoService {

	@Override
	public List<String> retrieveTodos(String str) {
		// TODO Auto-generated method stub
		return Arrays.asList("Learn Spring","Learn Spring MVC","Learn to dance");
	}

}
