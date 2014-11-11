

package listsmapsandsetslabs;

import java.util.*;

public class Lab4 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        
       Employee emp1 = new Employee("Smith", "John", "111-11-1111");
        Employee emp2 = new Employee("Jones", "James", "222-22-2222");
        Employee emp3 = new Employee("Adams", "Davente", "333-33-3333");
        Employee emp4 = new Employee("White", "Berry", "222-22-2222");
        
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        
        System.out.println("The size of the List is: " + list.size());
        
        Employee emp5 = list.get(1);
        
        System.out.println("\nThe Employee at index 1 is: " + emp5.toString());
        
        System.out.println("\nThis shows that some duplicates still exist:");
        for (Employee e : list){
            System.out.println(e.toString());
        }
        
        System.out.println("\nThis shows the duplicates have been removed: ");
        
        Set<Employee> set = new HashSet<>(list);
        list = new ArrayList<>(set);
        
        for (Employee e : list){
            System.out.println(e.toString());
        }
        
        System.out.println("The size of the list is now: " + list.size());
    }
}
