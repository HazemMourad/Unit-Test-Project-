package com.charseqfunctions;

public class CharAtMethod {
    public CharAtMethod() {
    }


    /* for the charAt method
    * Parameters:
    index - the index of the char value to be returned
    Returns: the specified char value
Throws:IndexOutOfBoundsException - if the index argument is negative or not less than length()
    * */

  public  char charAtMethod(int index , String str)
    {
        if (index<0 || index > str.length())
        {
            throw  new ArrayIndexOutOfBoundsException("out of boundaries exception ");
        }

            char result = str.charAt(index);
            return result;

    }

}
