package org.java.javaTrap;

public class TestEqualsMain {

    public static void main(String[] args) {
        Employee e1 = new Employee(101);
        Employee e2 = new Employee(101);

        System.out.println("Tets e1==>>"+e1.hashCode());

        System.out.println("Tets e2==>>"+e2.hashCode());


        System.out.println("Tets Equals==>>"+e1.equals(e2));

    }

}

class Employee {
    private int id;

    public Employee(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object obj){
        Employee employee = (Employee)obj;
        return this.id == employee.id;
    }




}