public class program1 {

    int age = 9;

    static class hello {
        program1 p;

        hello(program1 p) {
            this.p = p;
        }

        void print() {
            System.err.println(p.age);
        }
    }

    public static void main(String[] args) {
        program1 obj = new program1();
        hello h = new hello(obj);
        h.print();
    }

}
