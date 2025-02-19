package tasks;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class GradesTest {
	//various sets of values 
	int[] grades1 = {100, 90, 60, 50};
	int[] grades2 = {80 , 40, 35, 70, 50};
	int[] grades3 = {90, 20, 10};
	
	int mingrade = 40;	//minimal grade
	
	//At least three different sets of values per test. 
	
	@Test
	public void testGradesMax() {
		assertEquals(100, Grades.gradesMax(grades1));	
		assertEquals(80, Grades.gradesMax(grades2));	
		assertEquals(90, Grades.gradesMax(grades3));	
	}
	
	@Test
	public void testGradesTotal() {
		assertEquals(300, Grades.gradesTotal(grades1));	
		assertEquals(275, Grades.gradesTotal(grades2));	
		assertEquals(120, Grades.gradesTotal(grades3));
	}

	@Test
	public void testGradesAverage() {
		assertEquals(75.0, Grades.gradesAverage(grades1), 0.001);	
		assertEquals(55.0, Grades.gradesAverage(grades2), 0.001);	
		assertEquals(50.0, Grades.gradesAverage(grades3), 0.001);	
	}
	
	@Test
	public void testCountFails() {
		assertEquals(0, Grades.countFails(grades1, mingrade));	
		assertEquals(1, Grades.countFails(grades2, mingrade));	
		assertEquals(2, Grades.countFails(grades3, mingrade));	
	}
	
}
