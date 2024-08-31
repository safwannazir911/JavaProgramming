package exceptionHandeling;

import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.io.IOException;

class MySerializableClass implements Serializable {
    private static final long serialVersionUID = 1L;
    String name;

    MySerializableClass(String name) {
        this.name = name;
    }
}

public class serialization {
    public static void main(String[] args) {
        // Example of writing an object to a file
        try {
            MySerializableClass myObject = new MySerializableClass("Example Name");
            ObjectOutputStream oos = new ObjectOutputStream(
                    new FileOutputStream("/home/safwannazir911/Desktop/example.txt"));
            oos.writeObject(myObject);
            oos.close();

        } catch (IOException e) {
            e.printStackTrace(); // Handle the exception (e.g., print the stack trace)
        }

    }
}
