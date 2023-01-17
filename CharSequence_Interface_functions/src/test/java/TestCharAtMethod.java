import com.charseqfunctions.CharAtMethod;
import org.hamcrest.core.IsNull;
import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Stream;

public class TestCharAtMethod {



    @ParameterizedTest
    @MethodSource("data_1")
    void tstCharAtwithvaliddataIndex(String tstInpString,int testindex)
    {
        CharAtMethod charAtMethodtst=new CharAtMethod();
    var testResul= charAtMethodtst.charAtMethod(testindex,tstInpString);
    Assert.assertEquals('A',testResul);
    }



    @ParameterizedTest
    @MethodSource("data_2")
    void tstCharAtwithInvaliddataIndexnegative(String tstInpString,int testindex)
    {
       Assert.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
           CharAtMethod charAtMethodtst=new CharAtMethod();
           var testResul= charAtMethodtst.charAtMethod(testindex,tstInpString);
        });

    }

    @ParameterizedTest
    @MethodSource("data_3")
    void tstCharAtwithInvaliddataoutofBoundaries(String tstInpString,int testindex)
    {
        Assert.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            CharAtMethod charAtMethodtst=new CharAtMethod();
            var testResul= charAtMethodtst.charAtMethod(testindex,tstInpString);
        });

    }

   public static Collection<Object[]> data_1() {

       return Arrays.asList(new Object[][] {
               {"Alexandria",0},
       });
   }

    public static Collection<Object[]> data_2() {

        return Arrays.asList(new Object[][] {
                {"Alexandria",-1},
        });
    }

    public static Collection<Object[]> data_3() {

        return Arrays.asList(new Object[][] {
                {"Alexandria",11},
        });
    }





   }


