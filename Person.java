import java.util.ArrayList;

public class Person
{
  // Attributes
  private String name;
  private int age;

  // Constructor that sets default values of attributes
  public Person()
  {
    name = "John";
    age = 30;
  }

  // Constructor to allow the passing of parameters to change attributes
  public Person(String n, int a)
  {
    name = n;
    age = a;
  }

  // Getters
  public String Name() {return name;}
  public int Age() {return age;}

  // Setters
  public void setName(String n) {name = n;}
  public void setAge(int a) {age = a;}

  public static void main(String[] args)
  {
    System.out.println();
    // Spacing

    // Create an ArrayList of objects of type 'Person'
    ArrayList<Person> students = new ArrayList<Person>();

    // Create objects of type 'Person' and add to 'students' ArrayList
    Person john = new Person();
    Person victor = new Person("Victor", 18);
    Person paddy = new Person("Paddy", 26);
    students.add(john);
    students.add(victor);
    students.add(paddy);

    System.out.println("Original data:");
    for (Person i: students) System.out.println(i.Name() + " " + i.Age());

    // Change age
    victor.setAge(19);

    System.out.println("\nChange data:");
    for (Person i: students) System.out.println(i.Name() + " " + i.Age());

    // Spacing
    System.out.println();
  }
}
