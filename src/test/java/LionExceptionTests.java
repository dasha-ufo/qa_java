import com.example.Lion;
import com.example.Predator;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionExceptionTests {

    @Rule
    public ExpectedException exceptionRule = ExpectedException.none();

    @Mock
    Predator predator;

    @Test
    public void testOfExceptionForManeWrongWord() throws Exception {
        exceptionRule.expect(Exception.class);
        exceptionRule.expectMessage("Используйте допустимые значения пола животного - самец или самка");
        Lion lion = new Lion("Мартышка");
        }


    @Test
    public void testOfExceptionForManeIsEmpty() throws Exception {
        exceptionRule.expect(Exception.class);
        exceptionRule.expectMessage("Используйте допустимые значения пола животного - самец или самка");
        Lion lion = new Lion("");
    }

    @Test
    public void testOfExceptionForFullConstructor() throws Exception {
        exceptionRule.expect(Exception.class);
        exceptionRule.expectMessage("Используйте допустимые значения пола животного - самец или самка");
        Lion lion = new Lion(predator,"lalala");
    }
}




