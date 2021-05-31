package studentlist;

/**
 * This class represents students in our application
 *
 * @author Mario Martinez, May 2021
 */
public class Student {
    
    private String name;

    public Student(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        name = newName;
    }
    
    
}
