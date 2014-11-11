
package listsmapsandsetslabs;

import java.util.*;


public class Lab2 {
    public static void main(String[] args) {
        List list = new ArrayList();
        Employee emp1 = new Employee("Smith", "John", "111-11-1111");
        Employee emp2 = new Employee("Jones", "James", "222-22-2222");
        Employee emp3 = new Employee("Adams", "Davente", "333-33-3333");
        Employee emp4 = new Employee("White", "Berry", "222-22-2222");
        
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        list.add(emp4);
        
        System.out.println("The list size is " + list.size());
        
      
        Employee emp5 = (Employee)list.get(1);
        
        System.out.println("Employee at index 1 is " + emp5.toString());
        
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        
        
        System.out.println("This is part of the list " + list.subList(2 , 4));
        
        
        list.remove(1);
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
