import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Employee> emp=new ArrayList<Employee>();
        emp.add(new Employee(1,"mahesh",101,"active",2000));
        emp.add(new Employee(2,"Arjun",10,"active",5000));
        emp.add(new Employee(3,"Funde",10,"active",4000));
        emp.add(new Employee(4,"Pooja",11,"inactive",50000));
        emp.add(new Employee(5,"Priyanka",11,"inactive",58000));

        //find cost of each department

        Map<String,Double> sal=emp.stream().collect(Collectors.groupingBy(Employee::getStatus,Collectors.summingDouble(Employee::getSalary)));
        System.out.println(sal);

        emp.stream().filter(id-> id.getSalary()<=50000).forEach(System.out::println);
        Map<Integer,Long> m1=emp.stream().collect(Collectors.groupingBy(Employee::getDept_id,Collectors.counting()));
        System.out.println(m1);
        emp.stream().filter(empl-> empl.getStatus()=="active").collect(Collectors.toList()).forEach(System.out::println);

        //print employee details based on departments
       Map<Integer,List<Employee>> l1=emp.stream().collect(Collectors.groupingBy(Employee::getDept_id,Collectors.toList()));

        //System.out.println(l1);
        l1.entrySet().forEach(entry-> System.out.println(entry.getKey()+"------"+entry.getValue()));

        //get count employees in department

        System.out.println("Number of employees in each dept are:");

       Map<Integer,Long> empCount= emp.stream().collect(Collectors.groupingBy(Employee::getDept_id,Collectors.counting()));
        //System.out.println(empCount);
       empCount.entrySet().forEach(entry-> System.out.println(entry.getKey()+" "+ entry.getValue()));

       //getting sum of salaries by each department
        System.out.println("Departmentwise Cost Of total salaries of all employees");
        Map<Integer,Double> sumSalaryByDept=emp.stream().collect(Collectors.groupingBy(Employee::getDept_id,Collectors.summingDouble(Employee::getSalary)));
        sumSalaryByDept.entrySet().forEach(entry-> System.out.println(entry.getKey()+"----"+entry.getValue()));



    }
}