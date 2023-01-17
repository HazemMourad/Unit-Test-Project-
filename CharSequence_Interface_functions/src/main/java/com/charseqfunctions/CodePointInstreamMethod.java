package com.charseqfunctions;

import java.util.stream.IntStream;

public class CodePointInstreamMethod {
    public CodePointInstreamMethod() {
    }

    /*
    * The codePoints() method of IntStream class is used to get a stream of code point values from the given sequence.
    * It returns the ASCII values of the characters passed as an argument*/

   public IntStream codePointsintStreamMethod(String str)
    {
        if (str==null || str.isEmpty()||str.isBlank())
        {
            throw new NullPointerException("No words entered");
        }
        IntStream stream =str.codePoints();
        return stream;
    }
}
