import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class LionPositiveTestParametrized {

    private final String sex;
    private final boolean expectedResult;

    public LionPositiveTestParametrized(String sex, boolean expectedResult){
        this.sex = sex;
        this.expectedResult = expectedResult;
    }
    @Parameterized.Parameters
    public static Object[][] setSexValue() {
        return new Object[][]{
                {"Самец", true},
                {"Самка",false},
        };
    }

    @Test
    public void doesHaveManeCheck() throws Exception {
        Lion lion = new Lion(sex);
        boolean actualResult = lion.doesHaveMane();
        Assert.assertEquals(expectedResult, actualResult);
        }
    }
