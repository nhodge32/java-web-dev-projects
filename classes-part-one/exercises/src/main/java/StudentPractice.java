public class StudentPractice {
    public static void main(String[] args){
        //insantiate your Student class below
        Student student = new Student("Natasha", 1234, 1, 4.0);
        Teacher teacher = new Teacher("Shay", "Day", "English", 14);

        System.out.println(student.getName());
        System.out.println(student.getStudentId());
        System.out.println(student.getGpa());
        System.out.println(student.getNumberOfCredits());

        System.out.println("\n" + teacher.getFirstName() + " " + teacher.getLastName() + " teaches " +
                teacher.getSubject() + " and has been for " + teacher.getYearsTeaching() + " years.");
    }
}
