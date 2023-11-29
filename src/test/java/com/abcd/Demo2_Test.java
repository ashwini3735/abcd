package com.abcd;

import org.testng.annotations.Test;

public class Demo2_Test {
	@Test
	public void test2()
	{
		System.out.println("--test2---");
	}
	@Test(groups="smoke")
	public void test4()
	{
		System.out.println("---test4--");
	}

}
