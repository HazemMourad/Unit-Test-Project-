import com.charseqfunctions.ToStringMethods;
import org.junit.Assert;
import org.junit.Test;

public class ToStringTest {

    @Test
 public   void toStringmethTestValid() {
        ToStringMethods toStringMethodstst = new ToStringMethods("lorem", 25);
        toStringMethodstst.PrintPersonData();
        Assert.assertEquals("lorem",
                toStringMethodstst.getName().toString());
        Assert.assertEquals("25",
                toStringMethodstst.getAge().toString());

    }

    }
