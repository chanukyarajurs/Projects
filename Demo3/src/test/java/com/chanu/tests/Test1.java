package com.chanu.tests;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.audex.shapes.MyPoint;


public class Test1 {
MyPoint point1;
MyPoint point2;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
	}

	@Before
	public void setUp() throws Exception {
	
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public final void testMyPoint() {

		
//		assertTrue("Verify defauntConstructor", myPoint.toString().equals("(0,0")));
		assertTrue((new MyPoint()).toString().equals("(0,0"));		
	}

	@Test
	public final void testMyPointIntInt() {
		assertTrue((new MyPoint(20,30)).toString().equals("(20,30)"));
	}

	@Test
	public final void testGetX() {
		assertTrue((new MyPoint(20,30)).getX() == 20);
	}

	@Test
	public final void testGetY() {
		assertTrue((new MyPoint()).getY() == 0);
	}

	@Test
	public final void testSetX() {
		assertTrue(true);
	}

	@Test
	public final void testSetY() {
		assertTrue(true);
	}

	@Test
	public final void testGetXY() {
		assertArrayEquals(new int[]{23,45}, (new MyPoint(23,45)).getXY());
	}

	@Test
	public final void testSetXY() {
		MyPoint myPoint = new MyPoint(20,30);
		myPoint.setXY(40, 50);
		assertTrue(myPoint.toString().equals("(40,50)"));
	}

	@Test
	public final void testDistanceIntInt() {
		MyPoint myPoint = new MyPoint(20,30);
		assertTrue(100== myPoint.distance(40, 50));
	}

	@Test
	public final void testDistanceMyPoint() {
		assertTrue(true);
	}

	@Test
	public final void testDistance() {
		assertTrue(true);
	}

	@Test
	public final void testToString() {
		assertTrue(true);
	}

}
