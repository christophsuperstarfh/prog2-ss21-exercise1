import java.util.ArrayList;
import java.util.List;

class Result {

    public static void main(String[] args) throws Exception {

        List gradesBeforeGrading = new ArrayList();
        gradesBeforeGrading.add(4);
        gradesBeforeGrading.add(73);
        gradesBeforeGrading.add(67);
        gradesBeforeGrading.add(38);
        gradesBeforeGrading.add(33);

        gradingStudents(gradesBeforeGrading);
    }

    public static List<Integer> gradingStudents(List<Integer> grades) throws Exception {

        List gradesAfterGrading = new ArrayList();

        //Exception Handling

        if (grades.isEmpty()) {
            throw new Exception("The list is empty");
        } else if (grades.size() == 1) {
            throw new Exception("No grades entered in the list");
        } else if (grades.get(0) < 1 || grades.get(0) >= 60) {
            throw new Exception("Invalid number of students, choose a number between 1 and 60");
        } else {
            for (int i = 1; i <= grades.get(0); i++) {
                if(grades.get(i)<0||grades.get(i)>100){
                    throw new Exception("Invalid grade entered at position "+ i);
                }
                if (grades.get(i) < 38) {
                    gradesAfterGrading.add(grades.get(i));
                    //System.out.println("test");
                }
                else if (grades.get(i) % 5 > 2){
                    int grade;
                    grade = grades.get(i) + (5 - (grades.get(i) % 5));
                    System.out.println(grade);
                    gradesAfterGrading.add(grade);
                }
                else {
                    gradesAfterGrading.add(grades.get(i));
                }
            }
        }

        return gradesAfterGrading;
    }
}