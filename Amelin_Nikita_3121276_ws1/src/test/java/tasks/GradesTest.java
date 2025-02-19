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
	int[] grades3 = {90, 30, 30};
	
	int mingrade = 40;	//minimal grade
	
	//Make sure to test a range of values, at least three different sets of values per test. 
	//Check for negatives, positives and null values.
	
	@Test
	public void testGradesMax() {
		assertEquals(100, Grades.gradesMax(grades1));	
		assertEquals(80, Grades.gradesMax(grades2));	
		assertEquals(90, Grades.gradesMax(grades3));	
	}
	
	@Test
	public void testGradesTotal() {
		assertEquals(4, Grades.gradesTotal(grades1));	
		assertEquals(5, Grades.gradesTotal(grades2));	
		assertEquals(3, Grades.gradesTotal(grades3));
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
