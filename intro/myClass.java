public class myClass {
    public static void main(String[] args) {
        ClassLoader classLoader = myClass.class.getClassLoader();
        System.out.println("ClassLoader: " + classLoader);
    }
}
