package com.example.demo;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;


public class ToDoBusinessImplStubTest {

	@Test
	public void test() {
		ToDoBusinessImpl toDoBusinessImpl = new ToDoBusinessImpl(new ToDoServiceStub());
		List<String> todos = toDoBusinessImpl.retrieveTodosRelatedToSpring("user");
		assertEquals(2, todos.size());
	}

}
