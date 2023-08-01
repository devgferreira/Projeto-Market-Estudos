public class Employee {
    private String Name;
    private int Age;
    private Section Section;

    public Employee(String name, int age, Section section) {
        Name = name;
        Age = age;
        Section = section;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

}
