public class Person {
    String name;
    private static int id;
    private static int nextid;


    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        id = id;
    }

    public static int getNextId() {
        return nextid;
    }

    public static void setNextId(int nextId) {
        Person.nextid = nextid;
    }

}