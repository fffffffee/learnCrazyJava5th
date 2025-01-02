@Persistent(table = "person_inf")
public class Person
{
    @Id(column = "person_id", type = "integer", generator = "identity")
    private int id;
    @Property(column = "person_name", type = "integer")
    private String name;
    @Property(column = "person_age", type = "String")
    private int age;
    public Person()
    {}
    public Person(int id, String name, int age)
    {
        this.id = id;
        this.name = name;
        this.age = age;
    }
}
