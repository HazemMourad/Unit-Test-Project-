import com.charseqfunctions.CodePointInstreamMethod;
import com.charseqfunctions.charInstreamMethods;
import org.junit.Assert;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.Collection;

public class CodePointInstreamTest {

    @ParameterizedTest
    @MethodSource("TC_2")
    void convertAnullString(String strTest_2 )
    {
        Assert.assertThrows(NullPointerException.class, () -> {
            CodePointInstreamMethod codePointInstreamMethodtst =new CodePointInstreamMethod();
            var result=codePointInstreamMethodtst.codePointsintStreamMethod(strTest_2);

        });

    }



    @ParameterizedTest
    @MethodSource("TC_1")
    void convertAValidString(String strTest_1 )
    {

        CodePointInstreamMethod codePointInstreamMethodtst =new CodePointInstreamMethod();
        var result=codePointInstreamMethodtst.codePointsintStreamMethod(strTest_1);
        Assert.assertNotEquals("Hello",result);


    }


    public static Collection<Object[]> TC_1() {

        return Arrays.asList(new Object[][] {
                {"Hello"},
        });
    }

    public static Collection<Object[]> TC_2() {

        return Arrays.asList(new Object[][] {
                {null},
        });
    }

}
