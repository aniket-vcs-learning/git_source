package session_1;
public class Employee {

	// demo comment added by aniket, 26/04/2023

    private String name;
    private String gender;
    private String department;
    private int age;

    public Employee(String name, String gender, String department, int age) {
        super();
        this.name = name;
        this.gender = gender;
        this.department = department;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee [name=" + name + ", gender=" + gender + ", department=" + department + ", age=" + age + "]";
    }




}
