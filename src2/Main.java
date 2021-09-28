package homework2109;

public class Main {
    public static void main(String[] args) {
        Employee sertetor = new Worker("Alex", "Ivanov",10);
        Employee janitor = new Worker("Mark","Petrov", 2);
        Employee accountant = new Worker("Helen", "limutina",4);
        Director director1 = new Director("Ben", "Smit", 17,new Employee [3]);
        Director director2 = new Director("Nik", "Peskov", 9,new Employee [1]);

        director2.getEmployees() [0] = accountant;
        director1.getEmployees() [0] = sertetor;
        director1.getEmployees() [1] = janitor;
        director1.getEmployees() [2] = director2;

//
//        System.out.println(director1);

        Searchable searchable = new Serchableimpl();
        searchable.searchEmployee(director1, "Mark");
//        Searchable searchable2 = new SearchableDeepimpi();
//        searchable2.searchEmployee(director1,"elena");
//
//      Rec rec = new Rec();
//      rec.test1();
//      System.out.println("Result of recursion " + rec.rec(0));


    }
}
