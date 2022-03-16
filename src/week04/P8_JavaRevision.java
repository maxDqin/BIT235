package week04;

public class P8_JavaRevision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double score = 100.0;
		String grade = null;
		if(score>=80) {
			grade = "HD";
		}else if(score>=70) {
			grade = "D";
		}else if(score>=60) {
			grade = "C";
		}else if(score>=50) {
			grade = "P";
		}else {
			grade = "Fail";
		}
		
		System.out.print("Score " + score + " is graded as "+ grade +".");
	}

}
