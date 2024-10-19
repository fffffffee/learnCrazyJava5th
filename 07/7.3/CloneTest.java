class Address
{
    String detail;
    public Address(String detail)
    {
        this.detail = detail;
    }
}
class User implements Cloneable
{
    int age;
    Address address;
    public User(int age)
    {
        this.age = age;
        address = new Address("广州天河");
    }
    public User clone() throws CloneNotSupportedException
    {
        return (User)super.clone();
    }
}
public class CloneTest
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        var u1 = new User(29);
        var u2 = u1.clone();
        System.out.println(u1 == u2);
        System.out.println(u1.address == u2.address);
    }
}
