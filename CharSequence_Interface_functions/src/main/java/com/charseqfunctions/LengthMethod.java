package com.charseqfunctions;

public class LengthMethod {

    public LengthMethod() {
    }

    /* int length()
Returns the length of this character sequence. The length is the number of 16-bit chars in the sequence.
Returns:
the number of chars in this sequence
    * */

    public int ReturnLength(String str)
    {
        if(str==null || str.isBlank())
        {
           return -1;
        }
        else {
            int LengthofWord = str.length(); /*Returns:the number of chars in this sequence*/
            return LengthofWord;
        }
    }
}
