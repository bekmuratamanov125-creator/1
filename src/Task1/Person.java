package Task1;

public class Person {
    String name;
    int age;
    String work;
    String salary;
    String phone;

    public Person() {

    }

    public Person(String name, int age, String work, String salary, String phone) {
        this.name = name;
        this.age = age;
        this.work = work;
        this.salary = salary;
        this.phone = phone;

    }
    public void getInfo() {
        System.out.println("Name: " + name + "\n" +
                "Age: " + age + "\n" +
                "Work: " + work + "\n"+
                "salary: " + salary + "\n"+
                "phone: " + phone + "\n");
    }

//    public void getInfo() {
//       System.out.println("Name: " + name);
//       System.out.println("work: " + work);
//       System.out.println("phone: " + phone);
//        System.out.println("salary: " + salary);
//        System.out.println("age: " + age);
//        System.out.println("-------------------------");
//    }
}
