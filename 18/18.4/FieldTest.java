import java.lang.reflect.Field;

/**
 * A simple class representing a person with a name and age.
 */
class Person {
    private String name;
    private int age;
    
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
}

/**
 * A test class to demonstrate the usage of reflection to access and modify fields.
 */
public class FieldTest {
    public static void main(String[] args) throws Exception {
        var p = new Person();
        Class<?> personClazz = Person.class;
        
        // Access and modify the 'name' field
        Field nameField = personClazz.getDeclaredField("name");
        nameField.setAccessible(true);
        nameField.set(p, "Tom");
        
        // Access and modify the 'age' field
        Field ageField = personClazz.getDeclaredField("age");
        ageField.setAccessible(true);
        ageField.set(p, 30);
        
        // Print the modified object
        System.out.println(p);
    }    
}