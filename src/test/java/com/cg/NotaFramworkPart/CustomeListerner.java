package com.cg.NotaFramworkPart;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class CustomeListerner extends Base1 implements ITestListener {
	public void onTestFailure(ITestResult result) {
		System.out.println("FAILED Test");
		try {
			Failed();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
