package com.charseqfunctions;

import java.lang.instrument.Instrumentation;
import java.util.stream.IntStream;

public class charInstreamMethods {

    public charInstreamMethods() {
    }
/*
* The chars() method is an instance method of the String class.
*  It returns an IntStream that consists of the code point values of the
*  characters in the given string*/

  public IntStream charintStreamMethod(String str)

    {
        if (str==null || str.isEmpty()||str.isBlank())
        {
            throw new NullPointerException("No words entered");
        }
        IntStream stream =str.chars();
      return stream;
    }
}
