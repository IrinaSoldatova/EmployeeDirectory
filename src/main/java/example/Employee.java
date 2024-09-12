package example;

public class Employee {
    private String id;
    private String phone;
    private String name;
    private int experience;

    public Employee(String id, String phone, String name, int experience) {
        this.id = id;
        this.phone = phone;
        this.name = name;
        this.experience = experience;
    }

    public String getId() {
        return id;
    }

    public String getPhone() {
        return phone;
    }

    public String getName() {
        return name;
    }

    public int getExperience() {
        return experience;
    }
}
