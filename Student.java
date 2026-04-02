public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private String id;
    private String department;
    private String course;

    public Student() {
        this.firstName = "Vera";
        this.lastName = "Dugah";
        this.age = 20;
        this.id = "70002028";
        this.department = "HR";
        this.course = "DATASCIENCE";
    }

    public Student(String firstName,String lastName,int age,String id, String department, String course ){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.id = id;
        this.department = department;
        this.course = course;

    }

    //GETTERS
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public String getId() {
        return id;
    }
    public String getDepartment() {
        return department;
    }
    public String getCourse() {
        return course;
    }

    //SETTERS
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public void setCourse(String course) {
        this.course = course;
    }
}


