/*
 * The Person Class. 
 *      Create a public class named Person that contains two private data variables 
 *      called id (of type int) and name (of type String). 
 *      Create a constructor for the person class that receives two parameters, id (type int) and name (type String). 
 *      In your constructor, assign the values to the appropriate class variables. 
 *      Add the id() and name() methods to the class to return the value of the appropriate variables. 
 *      Also add a setName() method to set the name variable. Note that the id variable must not be able to be changed. 
 *      (What modifier is used to make that happen?). Override Object’s equals method. 
 *      Two Person objects are considered equal if: 
 *          (a)they are both Person objects (or subclasses of Person - Java has a keyword to check this for you), 
 *          (b) their ID numbers match, and 
 *          (c) their names match exactly. All three conditions must be met: 
 *          if any one of them fails, the objects are not equal. 
 *      Finally, add a method such that when a person object is printed 
 *      (with System.out.println) it will display something like Person[id=1234, name=John Smythe].

 * 
 * 
 */
public class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name; 
    }

    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setId(int newId) {
        this.id = newId;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }

        if (!(other instanceof Person)) {
            return false;
        }

        Person otherPerson = (Person) other;

        return this.id == otherPerson.getId() && this.name.equals(otherPerson.getName());
    }

    @Override
    public String toString() {
        return "Person[id=" + this.id + ", name=" + this.name+"]";
    }

}
