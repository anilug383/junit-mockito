package com.example.demo;

import java.util.ArrayList;
import java.util.List;
//System under test (SUT)
public class ToDoBusinessImpl {
	//dependency
	private ToDoService todoService;
	
	public ToDoBusinessImpl(ToDoService toDoService) {
		this.todoService = toDoService;
	}

	public List<String> retrieveTodosRelatedToSpring(String str) {
		List<String> todos = new ArrayList<>();
		List<String> allToDos = todoService.retrieveTodos(str);
		for(String todo : allToDos) {
			if(todo.contains("Spring")) {
				todos.add(todo);
			}
		}
		return todos;
	}

}
