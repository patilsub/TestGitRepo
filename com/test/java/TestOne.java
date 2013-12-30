package com.test.java;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Vector;

//testOne
public class TestOne {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	/*	testjava testjava = new testjava();
		testjava.inner inner = testjava.new inner();
		inner.srt1 = "";
		testjava.str = "";*/
		
		Vector v = new Vector();
		v.add(1);
		v.add("two");
		
		System.out.println(v);
		Vector V1 = (Vector)Collections.checkedCollection(v, Integer.class);
		
		V1.add("q");
		
	}

}
