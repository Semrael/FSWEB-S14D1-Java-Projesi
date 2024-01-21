package DeveloperCompany;

public class MidDeveloper extends Employee{
    public MidDeveloper(int id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println(getName()+"Mid Developer");
        setSalary(Salaries.MID.getSalary());
    }
}
