
public class LogicalOperators {

	public static void main(String[] args) {
		int attendance = 75;
		int marks = 67;
		if (attendance>75 && marks>50) {
			System.out.println("Eligible");
		}
		else {
			System.out.println("Not Eligible");
		}
		
		int class_percentage = 80;
		int class_marks = 86;
		if (class_percentage>60 || class_marks>50) {
			System.out.println("Eligible");
		}
		else {
			System.out.println("Not Eligible");
		}
		
		

	}

}
