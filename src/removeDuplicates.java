import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Employeeclass{
    int id;
    String name;
    String department;
    int salary;

    public Employeeclass(int id, String name, String department, int salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}

public class removeDuplicates {
    public static void main(String[] args) {

        List<Employeeclass> e1= new ArrayList<>();
        e1.add(new Employeeclass(1,"mahesh","IT",50000));
        e1.add(new Employeeclass(2,"funde","abc",500));
        e1.add(new Employeeclass(3,"mah","IT",5000));
        e1.add(new Employeeclass(4,"xyz","dfg",10000));

        List<Employeeclass> s=e1.stream().filter(a-> a.getName().startsWith("m")).collect(Collectors.toList());

        Map<String,Integer> m1=e1.stream().collect(Collectors.groupingBy(Employeeclass::getDepartment,Collectors.summingInt(Employeeclass::getSalary)));

        System.out.println(m1);

        //sotring based on salary

        List<Employeeclass> l1= e1.stream().sorted(Comparator.comparingInt(Employeeclass::getSalary).reversed()).collect(Collectors.toList());

        System.out.println(l1);

        //remove duplicate elements from an array

        int a[] = {1,1,1,13,4,5,5,3,6,5};

        for (int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                if (a[i]==a[j]){
                    a[i]=-1;
                }
            }

        }
        for (int k=0;k<a.length;k++){
            if (a[k]!=-1){
                System.out.print(a[k]+" ");
            }
        }
        System.out.println();

        //reverse string words

        String s1=" i am mahesh";

        String rev="";
        s1=s1.trim();

        char ch;

        int i = s1.length()-1;
        for (int j=i;j>0;j--){
            ch=s1.charAt(j);
            if (ch!=' '){
                rev=ch+rev;
            }else {
                System.out.print(rev+" ");
                rev="";
            }
        }


    }
}
