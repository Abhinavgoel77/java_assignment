
// question : Implement your  own abstract  classes and  interfaces

// =========================================================================================
//abstract class
// ===========================================================================================
abstract class Base {
    abstract void fun();             // object of abstract class cant be created
}
class Derived extends Base {
    void fun()
    {
        System.out.println("Derived fun() called");
    }
}
class Main {
    public static void main(String args[])
    {
  
        Base b = new Derived();
        b.fun();
    }
}

// ===============================================================================================
// interfaces
// ===========================================================================================

import java.io.*;
  
interface In1
{
     int a = 10;
    void display();
}
  
// A class that implements the interface.
class TestClass implements In1
{
    // Implementing the capabilities of
    // interface.
    public void display()
    {
        System.out.println("Geek");
    }
  
    // Driver Code
    public static void main (String[] args)
    {
        TestClass t = new TestClass();
        t.display();
        System.out.println(a);
    }
}