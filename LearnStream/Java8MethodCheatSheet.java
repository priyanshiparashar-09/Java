package LearnStream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8MethodCheatSheet {
    public static void main(String[] args) {
        List<Employee> employees = EmployeeDataBase.getAllEmployees();

        //ForEach

//        employees.forEach(e->{
//            System.out.println(e.getName()+":"
//            +e.getSalary());
//        });
//        employees.stream().forEach(e->{
//            System.out.println(e.getName());
//        });


        //Filter
        List<Employee> deptFilter = employees.stream().filter(e->e.getDept()=="Development" &&e.getSalary()> 6500).collect(Collectors.toList());
//        System.out.println(deptFilter);

        Map<String,Long> deptWiseEmp=employees.stream().collect(Collectors.groupingBy(Employee::getDept,Collectors.counting()));
//        deptWiseEmp.forEach((dept,count)-> System.out.println(dept+":"+count));


        //Map,distinct
     List<String> list=   employees.stream().map(e->e.getGender()).distinct().collect(Collectors.toList());
//        System.out.println(list);

      //flatMap -get list from the nested class
       List<String> listProject =  employees.stream().flatMap(e->e.getProjects().stream()).map(p->p.getName()).distinct().collect(Collectors.toList());
//        System.out.println(listProject);


      //sort

        List<Employee> collect = employees.stream().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());
//        System.out.println(collect);

        List<Employee> collectDesc = employees.stream().sorted(Collections.reverseOrder(Comparator.comparing(Employee::getDept))).collect(Collectors.toList());
//        System.out.println(collectDesc);


        //min && mx
     Optional<Employee> highestPaid=   employees.stream().max(Comparator.comparing(Employee::getSalary));
        Optional<Employee> lowestPaid=   employees.stream().min(Comparator.comparing(Employee::getSalary));
//        System.out.println(highestPaid);
//        System.out.println(lowestPaid);

        //group employee based on the gender
        Map<String, Long> collect1 = employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
//        System.out.println(collect1);
        Map<String, List<String>> collect2 = employees.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.mapping(Employee::getName, Collectors.toList())));
//        System.out.println(collect2);

        //findFirst

        Optional<Employee> development = employees.stream().filter(e -> e.getDept().equals("Development")).findFirst();
//        System.out.println(development);

        Employee employee = employees.stream().filter(e -> e.getDept().equals("Development")).findFirst().orElseThrow(() -> new IllegalArgumentException("employee not found"));
//        System.out.println(employee);

        Employee employee1 = employees.stream().filter(e -> e.getDept().equals("Development")).findAny().orElseThrow(() -> new IllegalArgumentException("employee not found"));
//        System.out.println(employee1);


        //anymatch(predicate),allmatch(predicate),noneMatch(predicate)
        boolean anyEmployeeDevelopment = employees.stream().anyMatch(e -> e.getDept().equals("priyanshi"));
        System.out.println(anyEmployeeDevelopment);

        boolean allEmployeeDevelopment = employees.stream().allMatch(e -> e.getSalary()>500);
        System.out.println(allEmployeeDevelopment);
        boolean noneEmployeeDevelopment = employees.stream().noneMatch(e -> e.getDept().equals("priyanshi"));
        System.out.println(noneEmployeeDevelopment);
        
        
        //limit(long)

        List<Employee> collect3 = employees.stream().sorted(Comparator.comparing(Employee::getSalary).reversed()).limit(3).collect(Collectors.toList());

//skip(long)

        List<Employee> collect4 = employees.stream().skip(5).collect(Collectors.toList());
        employees.stream().forEach(System.out::println);
    }

}
