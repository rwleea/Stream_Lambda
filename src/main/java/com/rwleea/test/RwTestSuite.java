package com.rwleea.test;

import com.rwleea.core.Test;
import com.rwleea.core.TestInfo;
import com.rwleea.core.TestInfo.Priority;

@TestInfo(priority = Priority.MEDIUM,
tags={"reflect","annotation"})
public class RwTestSuite {

	@Test(enable=false)
	public void TestA(){
		System.out.println("test A");
	}
	@Test(enable=true)
	public void TestB(){
		System.out.println("test B");
	}



		


}
