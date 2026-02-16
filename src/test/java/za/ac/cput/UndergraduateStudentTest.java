package za.ac.cput;

import org.junit.Test;
import static org.junit.Assert.*;

public class UndergraduateStudentTest {

    @Test
    public void testUndergraduateCreation() {

        UndergraduateStudent student =
                new UndergraduateStudent.Builder()
                        .studentId("U101")
                        .name("Naledi")
                        .email("naledi@gmail.com")
                        .department("IT")
                        .creditHours(5)
                        .scholarshipAmount(2000)
                        .build();

        assertNotNull(student);
        assertEquals("Undergraduate Student", student.getStudentType());
    }

    @Test
    public void testTuitionCalculation() {

        UndergraduateStudent student =
                new UndergraduateStudent.Builder()
                        .studentId("U101")
                        .name("Naledi")
                        .email("naledi@gmail.com")
                        .department("IT")
                        .creditHours(5)
                        .scholarshipAmount(2000)
                        .build();

        double expected = (5 * 1500) - 2000;
        assertEquals(expected, student.calculateTuition(), 0.0);
    }
}
