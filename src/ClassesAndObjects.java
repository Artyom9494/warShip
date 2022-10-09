public class ClassesAndObjects {
    public static void main(String[] args) {
    Person personOne = new Person();
    personOne.name = "Tom";
    personOne.age = 28;
        System.out.println("Меня зовут " + personOne.name + ", мне полных лет " + personOne.age + ".");
    Person personTwo = new Person();
    personTwo.name = "Kris";
    personTwo.age =25;
        System.out.println("Меня зовут " + personTwo.name + ", мне полных лет " + personTwo.age + ".");
    }
}

class Person {
    String name;
    int age;
}
