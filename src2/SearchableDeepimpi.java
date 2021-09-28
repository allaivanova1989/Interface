package homework2109;

import java.util.Objects;

public class SearchableDeepimpi implements Searchable {
    @Override
    public void searchEmployee(Director director, String name) {
        for (int i = 0; i < director.employees.length; i++) {
            if (director.employees[i].getName().equals(name)) {
                System.out.println("The Employee " + name + " found with the director " + director.getName());
                System.exit(1);
            }

        }
        for (int j = 0; j < director.employees.length; j++) {
            if (director.employees[j] instanceof Director) {

                searchEmployee((Director)director.employees[j], name);
            }
        }

    }

}


