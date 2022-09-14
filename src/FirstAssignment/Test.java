package FirstAssignment;

public class Test{
public static void main(String[]args){
        Person person1=new Person();
        person1.setFirstName("Kish");
        person1.setLastName("Chauhan");
        person1.setAddress("48-399 Vodden St E");
        person1.setAge(48);
        System.out.println(person1.getFullName());
        System.out.println(person1.getAddress());
        System.out.println(person1.getAge());
        }
}