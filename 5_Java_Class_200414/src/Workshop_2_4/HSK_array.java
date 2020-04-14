package Workshop_2_4;

class Student_Score{
	final static String[] strarr_Corr_Answer = {"D", "B", "D", "C", "C", "D", "A", "E", "A", "D"};
	private String[] strarr_Stu_Answer = new String[10];
	private int iScore = 0;
	
	public Student_Score() {}
	
	public void setAnswer(String[] scr) {
		strarr_Stu_Answer = scr;
	}
	
	public String[] getAnswer() {
		return strarr_Stu_Answer;
	}

	public void fnCal_Score() {
		iScore += 1;
	}
	
	public int getScore() {
		return iScore;
	}
}

public class HSK_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			
		Student_Score[] score_arr = new Student_Score[5];
		score_arr[0] = new Student_Score();
		score_arr[1] = new Student_Score();
		score_arr[2] = new Student_Score();
		score_arr[3] = new Student_Score();
		score_arr[4] = new Student_Score();
		
		String[] student1 = {"A", "B", "A", "C", "C", "D", "E", "F", "A", "D"};
		score_arr[0].setAnswer(student1);

		String[] student2 = {"D", "B", "A", "B", "C", "A", "E", "F", "A", "D"};
		score_arr[1].setAnswer(student1);
		
		String[] student3 = {"E", "D", "D", "A", "C", "B", "E", "E", "A", "D"};
		score_arr[2].setAnswer(student1);
		
		String[] student4 = {"C", "B", "A", "E", "D", "D", "E", "F", "A", "D"};
		score_arr[3].setAnswer(student1);
		
		String[] student5 = {"A", "B", "D", "C", "C", "D", "E", "E", "A", "D"};
		score_arr[4].setAnswer(student1);
		
		for(int inx = 0; inx<score_arr.length; inx++) {
			for(int inx2 = 0; inx2<10; inx2++) {
				if(Student_Score.strarr_Corr_Answer[inx2].equals(score_arr[inx].getAnswer()[inx2])) {
					score_arr[inx].fnCal_Score();
			}		
			}
		}
		
		for(int inx = 0; inx<5; inx++) {
			System.out.println("The Student[" + (inx+1) + "]'s Score is " + score_arr[inx].getScore());
		}
	}

}
