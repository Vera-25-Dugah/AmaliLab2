public class MainStudent {
    public static void main(String[] args){
        Student student = new Student();
        student.setFirstName("Joan");
        student.setLastName("Ahadzi");

        System.out.println(" My name is" + " " + student.getFirstName() + " " + student.getLastName());

        Student student1 = new Student(
                "Joan",
                "Ahadzi",
                20,
                "70002029",
                "CSR",
                "Software Engineering"
        );

        System.out.println("My name is " + student.getFirstName() + " " + student.getLastName());
        System.out.println("ID: " + student.getId());
        System.out.println("Department: " + student.getDepartment());


    }
}
