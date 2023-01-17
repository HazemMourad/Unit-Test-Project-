
import  com.charseqfunctions.LengthMethod;
import jdk.jfr.Name;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.testng.util.Strings;

public class TestLengthMethod {


  @ParameterizedTest
  @ValueSource(strings = {"Alexandria","Alex","A"})
  void testLengthmethodWithvalidStrings(String testInput)
  {
    LengthMethod tstLengthmth=new LengthMethod();
    int tstRes=tstLengthmth.ReturnLength(testInput);
    Assert.assertEquals(10,tstRes);

  }
  @ParameterizedTest
  @ValueSource(strings = {""})
  void testLengthmethodwithZeroLettersString(String testInput_2)
  {
    LengthMethod tstLengthmth=new LengthMethod();
    int tstRes=tstLengthmth.ReturnLength(testInput_2);
    Assert.assertEquals(-1,tstRes);
  }
  @ParameterizedTest
  @ValueSource(strings = {"\t","\n"})
  void testLengthmethodwithZeroLettersStringSpacesNewLine(String testInput_3)
  {
    LengthMethod tstLengthmth=new LengthMethod();
    int tstRes=tstLengthmth.ReturnLength(testInput_3);
    Assert.assertNotEquals(0,tstRes);
  }

  @ParameterizedTest
  @NullSource
  void NullString(String testInput_4)
  {
    LengthMethod tstLengthmth=new LengthMethod();
    int tstRes=tstLengthmth.ReturnLength(testInput_4);
    Assert.assertTrue(Strings.isNullOrEmpty(testInput_4));
  }

  @ParameterizedTest
  @EmptySource
  void BlankString(String testInput_5)
  {
    LengthMethod tstLengthmth=new LengthMethod();
    int tstRes=tstLengthmth.ReturnLength(testInput_5);
    Assert.assertTrue(testInput_5.isBlank());
  }



}
