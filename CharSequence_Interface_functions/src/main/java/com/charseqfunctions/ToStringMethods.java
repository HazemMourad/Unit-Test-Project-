package com.charseqfunctions;

public class ToStringMethods {

        String name ;
        Integer age;

    public ToStringMethods(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public ToStringMethods() {
    }

    /*
    String toString()
Returns a string containing the characters in this sequence in the same order as this sequence. The length of the string will be the length of this sequence.
Overrides:
toString in class Object
Returns:
a string consisting of exactly this sequence of characters
     */

    /*toString() 1
    The first implementation is when it is called as a method
    of an object instance. The example below shows this implementation*/


    public void firstUsagetoString( Integer x)
    {
        System.out.println( Integer.toString(x));
    }
    /* tostring() 2
    The second implementation is when you call the member method
    of the relevant class by passing the value as an argument.
    The example below shows how to do this
     */

    public void SecondUsagetoString( Integer x,Double y ,Long z , boolean logic)
    {
        // The method is called on datatype Double
        // It is passed the double value as an argument
        System.out.println(Double.toString(y));
        // Implementing this on other datatypes

        //Integer
        System.out.println(Integer.toString(x));

        // Long
        System.out.println(Long.toString(z));

        // Booleam
        System.out.println(Boolean.toString(logic));
    }
/*
*
* What is interesting is that this method can also be over-ridden as
* part of a class to cater to the customized needs of the user.
* The example below shows how to do this!
* */

    public String toString(){
        return "The name of the Person  is " + this.name +
                ". The age of Person pet is " + this.age;
    }

public void PrintPersonData()
{
    System.out.println("Name is " +this.name.toString());
    System.out.println("age is "+this.age.toString());
}

}

