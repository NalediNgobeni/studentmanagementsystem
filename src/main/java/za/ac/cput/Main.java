package za.ac.cput;

public class Main {
    public static void main(String[] args) {

        UndergraduateStudent undergrad =
                new UndergraduateStudent.Builder()
                        .studentId("U101")
                        .name("Naledi Ngobeni")
                        .email("naledi@gmail.com")
                        .department("IT")
                        .creditHours(5)
                        .scholarshipAmount(2000)
                        .build();

        GraduateStudent graduate =
                new GraduateStudent.Builder()
                        .studentId("G201")
                        .name("Khanyi Smith")
                        .email("khanyi@gmail.com")
                        .department("Computer Science")
                        .researchAssistant(true)
                        .stipend(5000)
                        .build();

        undergrad.displayStudentDetails();
        graduate.displayStudentDetails();
    }
}
