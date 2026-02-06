public class Person {
    protected int ID;
    protected int Age;
    protected String Lastname ;
    public Person(int id, int age, String lastname) {
        this.ID = id;
        this.Age = age;
        this.Lastname = lastname;
    }

    public int getAge() {
        return Age;
    }

    public int getID() {
        return ID;
    }

    public String getLastname() {
        return Lastname;
    }

    public String toString() {
        return String.format("Person{id=%d, age=%d, name=%s}", ID, Age, Lastname);
    }
}
