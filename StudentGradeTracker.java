import java.util.*;

public class StudentGradeTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> grades = new ArrayList<Integer>();

        System.out.println("Enter student grades and "
        		+ "enter -1 to finish: ");

        int grade;
        while (true) {
            grade = sc.nextInt();
            if (grade == -1 || grade>100) 
            {
                break;
            }
            grades.add(grade);
        }
        System.out.println("Numbers are: "+grades);
        
        int sum = 0;
        int high = grades.get(0);
        int low = grades.get(0);

        for (int i = 0; i < grades.size(); i++) {
            sum =sum + grades.get(i);
            if (grades.get(i) > high) 
            {
            	high = grades.get(i);
            }
            if (grades.get(i) < low) 
            {
            	low = grades.get(i);
            }
        }

        double average = (double)sum / grades.size();

        System.out.println("Average grade obtained: " + average);
        System.out.println("Highest grade obtained: " + high);
        System.out.println("Lowest grade obtained: " + low);
    }
}