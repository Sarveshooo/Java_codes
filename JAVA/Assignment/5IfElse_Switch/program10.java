class StudentGrade{

	public static void main(String[] args){

		int maths = 60;
		int biology = 7;
		int chemistry = 98;
		int english = 95;
		int marathi= 100;
		char grade;

		if (maths>=35 && biology>=35 && chemistry>=35 && english>=35&& marathi>=35){

			int total = maths+biology+chemistry+english+marathi;
			total = total/5;

			if(total>=95){
			
				grade = 'A';
			}else if(total >= 90 && total < 95){

				grade = 'B';
			}else{

				grade = 'c';
			}

			switch(grade){

				case 'A':
					System.out.println("First class with distinction!");
					break;
				case 'B':
					System.out.println("First class!");
					break;
				case 'C':
					System.out.println("Secoond class!");
					break;

				default :
					System.out.println("You passed");
			}

		}else{

			System.out.println("You failed");
		}
	}
}
