package com.charseqfunctions;

import java.util.stream.IntStream;

public class Driver {

    public static void main (String[] args) throws IndexOutOfBoundsException
    {
        LengthMethod lm =new LengthMethod(); //instance of Class LengthMethod
        int noChars= lm.ReturnLength("Alexandria"); // to save the returened value from func
        System.out.println("the number of chars in word is : "+noChars); // demonstarte its working

        CharAtMethod cm= new CharAtMethod(); // instance of Class CharAtMethod
        char chatAtResult= cm.charAtMethod(0,"Hello"); // to save the returened value from func
        System.out.println("the character at the entered index is :"+chatAtResult); // demonstarte its working

        CharesequenceMethod csqM= new CharesequenceMethod();
        CharSequence charsqResutls= csqM.charSequenceMethod(1,3,"hello");
        System.out.println("the subsq word  between  the entered index is :"+charsqResutls);

        //demonstration of toString working
        ToStringMethods str=new ToStringMethods();
        str.setName("xyz"); //3rd method
        str.setAge(23);
        str.PrintPersonData();
        str.SecondUsagetoString(12,10.5, 123213123L,false); //2ndmethod
        str.firstUsagetoString(29); //1st Method

        //demonstration of  Instream chars() working
        charInstreamMethods chim =new charInstreamMethods();
        IntStream chimStream=chim.charintStreamMethod("HyperActive");
        System.out.println("char values are \n");
        chimStream.mapToObj(Character::toChars).forEach(System.out::println);

        // demonstration of InstreamCodepoints()
        CodePointInstreamMethod cpim=new CodePointInstreamMethod();
        IntStream cpimStream = cpim.codePointsintStreamMethod("HyperActive");
        System.out.println("ASCII Values are: ");
        // Print the code points
        cpimStream.forEach(System.out::println);

// usage of compare method
        CompareMethodUsage cmpmth= new CompareMethodUsage();
      int resultofcmp=  cmpmth.compareMethodUsage("Ace","Asd");
      cmpmth.printStatus(resultofcmp);

    }
}
