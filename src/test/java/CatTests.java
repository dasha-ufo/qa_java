import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;
import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class CatTests {
        private Cat cat;

        @Spy
        Feline catfeline;

        @Before
        public void setUp() {
        cat = new Cat(catfeline);
        }

        @Test
        public void checkCatSoundMeow(){
            String result = cat.getSound();
            Assert.assertEquals("Мяу",result);
        }

        @Test
        public void catGetCorrectEatMeat() throws Exception {
            List<String> result = cat.getFood();
            Assert.assertEquals((List.of("Животные", "Птицы", "Рыба")),result);
        }
    }
