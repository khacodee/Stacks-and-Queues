package Q5;

/**
 *
 * @author CaoKha
 */
public class Students {

    String ID;
    String Name;
    int age;

    public Students(String ID, String Name, int age) {
        this.ID = ID;
        this.Name = Name;
        this.age = age;
    }

    @Override
    public String toString() {
        return ID + " - " + Name + " - " + age;
    }

}
