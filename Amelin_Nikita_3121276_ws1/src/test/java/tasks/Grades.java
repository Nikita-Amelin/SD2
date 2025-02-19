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
	
	static int gradesTotal (int[] grades) {
		return 0;
		// get sum of array
	}
	
	static double gradesAverage(int[] grades) {
		return 0;
		// get average of array
	}
	
	static int countFails(int[] grades, int minGrade) {
		return 0;
		// count how many grades < minGrade
	}
}
