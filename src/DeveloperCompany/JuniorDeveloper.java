package DeveloperCompany;

public class JuniorDeveloper extends Employee{
    public JuniorDeveloper(int id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println(getName()+"Junior Developer");
        setSalary(Salaries.JUNIOR.getSalary());
    }


}
