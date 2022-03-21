import java.util.ArrayList;
import java.util.List;

class Result {

    public static boolean checkStudentRange(int students) {
        return (students >= 1 && students <= 60);
    }

    public static boolean checkGradeRange(int grade) {
        return (grade >= 1 && grade <= 100);
    }

    public static boolean gradeRounding(int grade) {
       if(grade < 38){
            return false;
        }
       else return grade % 5 > 2;
    }

    public static boolean studentsEqualsGrades(List<Integer> grades){
        return(grades.get(0) == grades.size()-1);
    }



    public static List<Integer> gradingStudents(List<Integer> grades) {

        List<Integer>  gradesAfterGrading = new ArrayList<>();

        if(studentsEqualsGrades(grades) && checkStudentRange(grades.get(0))){
            for (int i = 1; i < grades.size(); i++) {
                if(checkGradeRange(grades.get(i))){
                    if (gradeRounding(grades.get(i))){
                        gradesAfterGrading.add(grades.get(i) + (5 - (grades.get(i) % 5)));
                    }
                    else gradesAfterGrading.add(grades.get(i));
                }
            }
        }
        return gradesAfterGrading;
    }
}