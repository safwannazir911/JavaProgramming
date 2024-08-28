public class accessModifiers {
    static class Person {
        private String name; // Accessible only within this class
        public int age; // Accessible from any class

        void printPerson() {
            System.out.println(name);
            System.out.println(age);

        }
    }

    static class Safwan extends Person {
        void printSafwan() {
            System.out.println(age);
        }
    }

    public static void main(String[] args) {
        Safwan s1 = new Safwan();
        s1.printSafwan();

        Person p1 = new Person();
        p1.printPerson();
    }

}
