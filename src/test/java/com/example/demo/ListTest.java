package com.example.demo;

import static org.junit.Assert.*;
import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;

public class ListTest {

	@Test
	public void test() {
		List mockList = mock(List.class);
		when(mockList.size()).thenReturn(2);
		assertEquals(2, mockList.size());
	}
	
	@Test
	public void test_multipleValue() {
		List mockList = mock(List.class);
		when(mockList.size()).thenReturn(2).thenReturn(3);
		assertEquals(2, mockList.size());
		assertEquals(3, mockList.size());
	}
	
	@Test
	public void test_getMethod() {
		List mockList = mock(List.class);
		when(mockList.get(0)).thenReturn("Test");
		assertEquals("Test", mockList.get(0));
		assertEquals(null, mockList.get(1));
	}
	
	@Test
	public void test_any() {
		List mockList = mock(List.class);
		when(mockList.get(anyInt())).thenReturn(2);
		assertEquals(2, mockList.get(5));
	}
	
	@Test(expected=RuntimeException.class)
	public void test_exception() {
		List mockList = mock(List.class);
		when(mockList.size()).thenThrow(new RuntimeException("Test Ecxeption"));
		mockList.size();
	}

}
