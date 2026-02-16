package za.ac.cput;

import org.junit.Test;
import static org.junit.Assert.*;

public class GraduateStudentTest {

    @Test
    public void testGraduateCreation() {

        GraduateStudent student =
                new GraduateStudent.Builder()
                        .studentId("G201")
                        .name("Khanyi")
                        .email("khanyi@gmail.com")
                        .department("CS")
                        .researchAssistant(true)
                        .stipend(5000)
                        .build();

        assertNotNull(student);
        assertEquals("Graduate Student", student.getStudentType());
    }

    @Test
    public void testTuitionCalculation() {

        GraduateStudent student =
                new GraduateStudent.Builder()
                        .studentId("G201")
                        .name("Khanyi")
                        .email("khanyi@gmail.com")
                        .department("CS")
                        .researchAssistant(true)
                        .stipend(5000)
                        .build();

        double expected = 20000 - 5000;
        assertEquals(expected, student.calculateTuition(), 0.0);
    }
}
