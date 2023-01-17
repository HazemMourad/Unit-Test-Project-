package com.charseqfunctions;

import static java.lang.CharSequence.compare;


/* Compare :
Compares two CharSequence instances lexicographically.
Returns a negative value, zero, or a positive value if the
 first sequence is lexicographically less than, equal to, or
 greater than the second, respectively.
 */

/*Parameters:
cs1 - the first CharSequence
cs2 - the second CharSequence
Returns:
the value 0 if the two CharSequence are equal;
 a negative integer if the first CharSequence is lexicographically less than the second; or a positive integer if the first CharSequence is lexicographically greater than the second.*/


public class CompareMethodUsage {

    public CompareMethodUsage() {
    }

    public  int compareMethodUsage(CharSequence c1, CharSequence c2)
    {
        int result=compare(c1,c2);
        return result;
    }

    public void printStatus(int results)
    {
        if(results==0)
        {
            System.out.println("the two sequences are identical\n");
        }
        else if(results>0)
        {
            System.out.println("a positive integer if the first" +
                    " CharSequence is lexicographically greater than the second");
        }
        else
        {
            System.out.println("a negative integer if the first" +
                    " CharSequence is lexicographically less than the second");
        }
    }

}
