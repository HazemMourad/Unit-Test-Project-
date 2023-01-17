import com.charseqfunctions.CharAtMethod;
import com.charseqfunctions.CharesequenceMethod;
import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

public class TestSubseq {


@ParameterizedTest
@MethodSource("TC_1")
void allValiddata(int startTestIndex_1,int endTestindex_1,String strTest_1 )
{
    CharesequenceMethod charsubseqtst=new CharesequenceMethod();
   var tstRs= charsubseqtst.charSequenceMethod(startTestIndex_1,endTestindex_1,strTest_1);
    Assert.assertEquals("el",tstRs);
}

    @ParameterizedTest
    @MethodSource("TC_2")
    void lowerboundIsnotValid(int startTestIndex_2,int endTestindex_2,String strTest_2 )
    {
        Assert.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            CharesequenceMethod charsubseqtst=new CharesequenceMethod();
            var tstRs= charsubseqtst.
                    charSequenceMethod(startTestIndex_2,endTestindex_2,strTest_2);

        });

    }

    @ParameterizedTest
    @MethodSource("TC_3")
    void upperboundIsnotValid(int startTestIndex_3,int endTestindex_3,String strTest_3 )
    {
        Assert.assertThrows(ArrayIndexOutOfBoundsException.class, () -> {
            CharesequenceMethod charsubseqtst=new CharesequenceMethod();
            var tstRs= charsubseqtst.
                    charSequenceMethod(startTestIndex_3,endTestindex_3,strTest_3);

        });

    }


    @ParameterizedTest
    @MethodSource("TC_4")
    void stringIsnotValid(int startTestIndex_4,int endTestindex_4,String strTest_4 )
    {
        Assert.assertThrows(NullPointerException.class, () -> {
            CharesequenceMethod charsubseqtst=new CharesequenceMethod();
            var tstRs= charsubseqtst.
                    charSequenceMethod(startTestIndex_4,endTestindex_4,strTest_4);

        });

    }
    @ParameterizedTest
    @MethodSource("TC_5")
    void inversedBoundaries(int startTestIndex_5,int endTestindex_5,String strTest_5 )
    {
        Assert.assertThrows(StringIndexOutOfBoundsException.class, () -> {
            CharesequenceMethod charsubseqtst=new CharesequenceMethod();
            var tstRs= charsubseqtst.
                    charSequenceMethod(startTestIndex_5,endTestindex_5,strTest_5);

        });

    }





    public static Collection<Object[]> TC_1() {

        return Arrays.asList(new Object[][] {
                {1,3,"hello"},
        });
    }

    public static Collection<Object[]> TC_2() {

        return Arrays.asList(new Object[][] {
                {-1,3,"hello"},
        });
    }

    public static Collection<Object[]> TC_3() {

        return Arrays.asList(new Object[][] {
                {1,6,"hello"},
        });
    }
    public static Collection<Object[]> TC_4() {

        return Arrays.asList(new Object[][] {
                {1,3,null},
        });
    }
    public static Collection<Object[]> TC_5() {

        return Arrays.asList(new Object[][] {
                {4,1,"hello"},
        });
    }


}
