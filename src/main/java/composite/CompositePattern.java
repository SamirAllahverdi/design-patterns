package composite;

public class CompositePattern {
    public static void main(String[] args) {
        Employee dev1 = new Developer(100, "Lokesh Sharma", "Pro Developer");
        Employee dev2 = new Developer(101, "Vinay Sharma", "Developer");
        CompanyDirector engDirectory = new CompanyDirector();
        engDirectory.addEmployee(dev1);
        engDirectory.addEmployee(dev2);

        Employee man1 = new Manager(200, "Kushagra Garg", "SEO Manager");
        Employee man2 = new Manager(201, "Vikram Sharma ", "Kushagra's Manager");

        CompanyDirector accDirectory = new CompanyDirector();
        accDirectory.addEmployee(man1);
        accDirectory.addEmployee(man2);

        CompanyDirector directory = new CompanyDirector();
        directory.addEmployee(engDirectory);
        directory.addEmployee(accDirectory);
        directory.showEmployeeDetails();
    }
}
