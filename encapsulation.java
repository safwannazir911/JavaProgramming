public class encapsulation {
    private String name;

    public void getName() {
        System.out.println(this.name);
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        encapsulation obj = new encapsulation();
        obj.setName("safwan");

        obj.getName();
    }
}
