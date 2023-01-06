public class Employee {
    private int employee_id;
    private String name;
    private int dept_id;
    private String status="active";
    private int salary;

    public Employee(int employee_id, String name, int dept_id, String status, int salary) {
        this.employee_id = employee_id;
        this.name = name;
        this.dept_id = dept_id;
        this.status = status;
        this.salary = salary;
    }


    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDept_id() {
        return dept_id;
    }

    public void setDept_id(int dept_id) {
        this.dept_id = dept_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employee_id=" + employee_id +
                ", name='" + name + '\'' +
                ", dept_id=" + dept_id +
                ", status='" + status + '\'' +
                ", salary=" + salary +
                '}';
    }
}
