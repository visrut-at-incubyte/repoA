class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void display() {
        System.out.println(name + " is " + age + " years old.");
    }
}

public class RepoA_PersonDemo {
    public static void main(String[] args) {
        Person p = new Person("Alice", 30);
        p.display();
    }
}
