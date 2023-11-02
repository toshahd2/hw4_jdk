package handbook;

public class Employee {
    private int id;
    private String phone;
    private String name;
    private int experience;

    public int getId() {
        return id;
    }

    public Employee(int id, String phone, String name, int experience) {
        this.id = id;
        this.phone = phone;
        this.name = name;
        this.experience = experience;
    }


    public void setId(int id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int exp) {
        this.experience = experience;
    }
    @Override
    public String toString() {
        return id + "|" + phone + "|" + name + "|" + experience;
    }
}
