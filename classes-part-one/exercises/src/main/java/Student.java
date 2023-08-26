public class Student {
        private String name;
        private int studentId;
        private int numberOfCredits = 0;
        private double gpa = 0.0;

        public Student(String name, int studentId, int numberOfCredits, double gpa) {
                this.name = name;
                this.numberOfCredits = numberOfCredits;
                this.studentId = studentId;
                this.gpa = gpa;
        }

        // Drop your getters and setters below for the Student class.
        public String getName() {
                return name;
        }

        public void setName(String aName){
                name = aName;
        }

        public int getStudentId() {
                return studentId;
        }

        public void setStudentId(Integer aStudentId) {
                studentId = aStudentId;
        }

        public int getNumberOfCredits () {
                return numberOfCredits;
        }

        private void setNumberOfCredits(int aNumberOfCredits) {
                numberOfCredits = aNumberOfCredits;
        }

        public void setGpa(double aGpa) {
                gpa = aGpa;
        }

        public double getGpa() {
                return gpa;
        }
        // To instantiate the Student class, add your code to the main in the file, SchoolPractice.

}
