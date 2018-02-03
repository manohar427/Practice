package com.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.mockito.Mockito.mock;

@RunWith(PowerMockRunner.class)
@PrepareForTest(PowerMockDemo.class)
public class TestPowerMockDemo {

	@Test
	public void testMockNew() throws Exception {
		Point mockPoint = mock(Point.class);
		PowerMockito.whenNew(Point.class).withAnyArguments().thenReturn(mockPoint);
		Mockito.doReturn(100).when(mockPoint).test();
		int x = PowerMockDemo.publicMethod();
		Assert.assertTrue(x == 100);
	}
}