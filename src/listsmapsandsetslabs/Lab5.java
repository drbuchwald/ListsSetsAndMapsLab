
package listsmapsandsetslabs;

import java.util.*;

public class Lab5 {
    public static void main(String[] args) {
       
        Employee emp1 = new Employee("Smith", "John", "111-11-1111");
        Employee emp2 = new Employee("Jones", "James", "222-22-2222");
        Employee emp3 = new Employee("Adams", "Davente", "333-33-3333");
        Employee emp4 = new Employee("White", "Berry", "222-22-2222");
        Employee emp5 = new Employee("Anderson", "Neo", "444-44-4444");
        
         
        Map<String,Employee> employeeMap = new HashMap();
        
        employeeMap.put(emp1.getSsn(), emp1);
        employeeMap.put(emp2.getSsn(), emp2);
        //e3 replaces e1 at this key
        employeeMap.put(emp3.getSsn(), emp3);
        employeeMap.put(emp4.getSsn(), emp4);
        
        Employee e = employeeMap.get(emp1);
        
        
        
       
        System.out.println("Print out contents of map via the key.");
        Set <String>keys = employeeMap.keySet();
        for (Object key : keys){
            System.out.println(employeeMap.get(key));
        }
       
        System.out.println("\nPrint out contents of map: ");
        Collection <Employee>values = employeeMap.values();
        for (Object employee : values){
            System.out.println(employee.toString());
        }
        
        System.out.println("\nPrint out contents of the map key after emp5 added: ");
        
        employeeMap.put(emp2.getSsn(), emp5);

        
        for (Object key : keys){
            System.out.println(employeeMap.get(key));
        }
        
        System.out.println("\nPrint out the items in the map after emp5 added: ");
        for (Object employee : values){
            System.out.println(employee.toString());
        }
    }
}
