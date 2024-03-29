
// question  -  Implement your own encapsulating classes

// ============================================================================================


class Encapsulate {
    // private variables declared
    // these can only be accessed by
    // public methods of class
    private String geekName;
    private int geekRoll;
    private int geekAge;

    public int getAge() { return geekAge; }
 
    public String getName() { return geekName; }
 
    public int getRoll() { return geekRoll; }
 
    // set method for age to access
    public void setAge(int newAge) { geekAge = newAge; }
 
    // set method for name to access
    public void setName(String newName)
    {
        geekName = newName;
    }
 
    public void setRoll(int newRoll) { geekRoll = newRoll; }
}
 
public class TestEncapsulation {
    public static void main(String[] args)
    {
        Encapsulate obj = new Encapsulate();
 
        // setting values of the variables
        obj.setName("Harsh");
        obj.setAge(19);
        obj.setRoll(51);
 
        // Displaying values of the variables
        System.out.println("Geek's name: " + obj.getName());
        System.out.println("Geek's age: " + obj.getAge());
        System.out.println("Geek's roll: " + obj.getRoll());         // DIRECT ACCESS IS NOT POSSIBLE DUE TO ENCAPSULATION
 
    }
}