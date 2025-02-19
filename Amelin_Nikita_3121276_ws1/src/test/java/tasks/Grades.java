package tasks;

public class Grades {
	
	static int gradesMax(int[] grades) {
		int m = grades[0]; 
		
		for(int i=0; i<grades.length; i++) {
			if(m<grades[i])
				m=grades[i];
		}
		return m;
		//get largest element
	}
	
	static int gradesTotal(int[] grades) {
		int n = 0;
		for(int i : grades)
			n+=i;
		return n;
		// get sum of array
	}
	
	static double gradesAverage(int[] grades) {
		return gradesTotal(grades)/grades.length;
		// get average of array
	}
	
	static int countFails(int[] grades, int minGrade) {
		return 0;
		// count how many grades < minGrade
	}
}
