package composite;

import java.util.ArrayList;
import java.util.List;

class CompanyDirector implements Employee
{
    private List<Employee> employeeList = new ArrayList<>();

    @Override
    public void showEmployeeDetails()
    {
        for(Employee emp:employeeList)
        {
            emp.showEmployeeDetails();
        }
    }

    public void addEmployee(Employee emp)
    {
        employeeList.add(emp);
    }

    public void removeEmployee(Employee emp)
    {
        employeeList.remove(emp);
    }
}