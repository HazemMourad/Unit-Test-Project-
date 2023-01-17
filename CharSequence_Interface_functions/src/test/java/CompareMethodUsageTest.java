import com.charseqfunctions.CharesequenceMethod;
import com.charseqfunctions.CompareMethodUsage;
import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

public class CompareMethodUsageTest {


    @ParameterizedTest
    @MethodSource("TC_1")
    void twoWordsareEqual(CharSequence c1,CharSequence c2 )
    {
        CompareMethodUsage compareMethodUsagetst=new CompareMethodUsage();
     int res=   compareMethodUsagetst.compareMethodUsage(c1,c2);
     Assert.assertEquals(0,res);
    }

    @ParameterizedTest
    @MethodSource("TC_2")
    void twoWordsarenotEqual(CharSequence c1,CharSequence c2 )
    {
        CompareMethodUsage compareMethodUsagetst=new CompareMethodUsage();
        int res=   compareMethodUsagetst.compareMethodUsage(c1,c2);
        Assert.assertNotEquals(0,res);
    }

    @ParameterizedTest
    @MethodSource("TC_3")
    void twoWordsarenotEqual_2(CharSequence c1,CharSequence c2 )
    {
        CompareMethodUsage compareMethodUsagetst=new CompareMethodUsage();
        int res=   compareMethodUsagetst.compareMethodUsage(c1,c2);
        Assert.assertNotEquals(0,res);
    }


    public static Collection<Object[]> TC_1() {

        return Arrays.asList(new Object[][] {
                {"hello","hello"},
        });
    }

    public static Collection<Object[]> TC_2() {

        return Arrays.asList(new Object[][] {
                {"hello","he"},
        });
    }

    public static Collection<Object[]> TC_3() {

        return Arrays.asList(new Object[][] {
                {"he","hello"},
        });
    }
}
