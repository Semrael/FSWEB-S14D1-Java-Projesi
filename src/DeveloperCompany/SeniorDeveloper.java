package DeveloperCompany;

public class SeniorDeveloper extends Employee{

    public SeniorDeveloper(int id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println(getName()+"Senior Developer");
        setSalary(Salaries.SENIOR.getSalary());
    }
}
