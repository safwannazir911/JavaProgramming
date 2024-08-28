package accessProtection.testPackage;

import accessProtection.protectedClass.protectedExample;

public class test extends protectedExample {
    public static void main(String[] args) {
        test obj = new test();
        System.out.println(obj.x);
        obj.show();
    }
}
/*  */