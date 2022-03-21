
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ResultTest {

    //repo link
    //

    //checks if number of students is between 1 and 60
    @Test
    void test_CheckStudentRange_belowZero(){
        assertFalse(Result.checkStudentRange(-1));
    }
    @Test
    void test_CheckStudentRange_above60(){
        assertFalse(Result.checkStudentRange(61));
    }
    @Test
    void test_CheckStudentRange_inRange25(){
        assertTrue(Result.checkStudentRange(25));
    }
    @Test
    void test_CheckStudentRange_inRange60(){
        assertTrue(Result.checkStudentRange(60));
    }
    @Test
    void test_CheckStudentRange_inRange1(){
        assertTrue(Result.checkStudentRange(1));
    }


    // check if the entered grade is between 1 and 100
    @Test
    void test_CheckGradeRange_inRange1(){
        assertTrue(Result.checkGradeRange(1));
    }
    @Test
    void test_CheckGradeRange_inRange50(){
        assertTrue(Result.checkGradeRange(50));
    }
    @Test
    void test_CheckGradeRange_inRange100(){
        assertTrue(Result.checkGradeRange(100));
    }
    @Test
    void test_CheckGradeRange_outOfRange101(){
        assertFalse(Result.checkGradeRange(101));
    }
    @Test
    void test_CheckGradeRange_outOfRangeBelowZero(){
        assertFalse(Result.checkGradeRange(-1));
    }
    @Test
    void test_CheckGradeRange_outOfRangeZero(){
        assertFalse(Result.checkGradeRange(0));
    }


    // check rounding
    @Test
    void test_gradeRounding_roundUp78(){
        assertTrue(Result.gradeRounding(78));
    }
    @Test
    void test_gradeRounding_roundUp38(){
        assertTrue(Result.gradeRounding(38));
    }
    @Test
    void test_gradeRounding_noRound1(){
        assertFalse(Result.gradeRounding(1));
    }
    @Test
    void test_gradeRounding_noRound37(){
        assertFalse(Result.gradeRounding(37));
    }

    //checks if number of students is equal to grades
    @Test
    void test_studentsEqualsGrades_equals(){

        List<Integer> gradesBeforeGrading = new ArrayList<>();
        gradesBeforeGrading.add(4);
        gradesBeforeGrading.add(73);
        gradesBeforeGrading.add(67);
        gradesBeforeGrading.add(38);
        gradesBeforeGrading.add(33);

        assertTrue(Result.studentsEqualsGrades(gradesBeforeGrading));
    }

    @Test
    void test_studentsEqualsGrades_notEqualsMoreEntries(){

        List<Integer> gradesBeforeGrading = new ArrayList<>();
        gradesBeforeGrading.add(4);
        gradesBeforeGrading.add(73);
        gradesBeforeGrading.add(67);
        gradesBeforeGrading.add(38);
        gradesBeforeGrading.add(33);
        gradesBeforeGrading.add(33);

        assertFalse(Result.studentsEqualsGrades(gradesBeforeGrading));
    }
    @Test
    void test_studentsEqualsGrades_notEqualsLessEntries(){

        List<Integer> gradesBeforeGrading = new ArrayList<>();
        gradesBeforeGrading.add(4);
        gradesBeforeGrading.add(73);
        gradesBeforeGrading.add(67);
        gradesBeforeGrading.add(38);

        assertFalse(Result.studentsEqualsGrades(gradesBeforeGrading));
    }

    //check gradingStudents
    @Test
    void test_gradingStudents(){
        List<Integer> gradesBeforeGrading = new ArrayList<>();
        gradesBeforeGrading.add(4);
        gradesBeforeGrading.add(73);
        gradesBeforeGrading.add(67);
        gradesBeforeGrading.add(38);
        gradesBeforeGrading.add(33);

        List<Integer> expected = new ArrayList<>();
        expected.add(75);
        expected.add(67);
        expected.add(40);
        expected.add(33);

        List<Integer> actual = Result.gradingStudents(gradesBeforeGrading);
        assertEquals(expected, actual);

    }
}
