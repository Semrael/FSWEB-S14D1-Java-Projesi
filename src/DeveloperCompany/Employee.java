package DeveloperCompany;

public abstract class Employee {
    private int id;
    private String name;
    private int salary;


    public Employee(int id, String name) {
        this.id = id;
        this.name = name;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void Work() {
        System.out.println(getName()+"Employee starts to working");
    }

    public abstract void work();
}



