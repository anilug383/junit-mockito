package com.example.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TodoBusinessImplMockTest {

	@Test
	public void test() {
		ToDoService mockService = mock(ToDoService.class);
		when(mockService.retrieveTodos("user")).thenReturn(Arrays.asList("learn Spring", "Learn Spring MVC"));
		ToDoBusinessImpl toDoBusinessImpl = new ToDoBusinessImpl(mockService);
		List<String> todos = toDoBusinessImpl.retrieveTodosRelatedToSpring("user");
		assertEquals(2, todos.size());
		assertNotEquals(1, todos.size());
		assertFalse(todos.size()<2);
	}

}
