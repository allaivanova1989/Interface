package homework2109;

import java.util.Objects;

public class Serchableimpl implements Searchable {
    @Override
    public void searchEmployee(Director director, String name) {
        for (int i =0; i<director.employees.length; i++) {
            if (director.employees[i].getName().equals(name)) {
                System.out.println("The Employee " + name + " found with the director " + director.getName());
                System.exit(1);
            }
            else  {
                continue;
            }
        }
        System.out.println( name + " was not find");
    }
}


