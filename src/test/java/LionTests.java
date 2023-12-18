import com.example.Cat;
import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class LionTests {
    private Lion lion;
@Spy
    Feline feline;

    @Before
    public void setUp() {
        lion = new Lion(feline);
    }

@Test
    public void getKittensForLionZero() {
    int result = lion.getKittens();
    Assert.assertEquals(1, result);
    }

    @Test
    public void lionGetCorrectFoodMeat() throws Exception {
        List<String> result = lion.getFood();
        Assert.assertEquals((List.of("Животные", "Птицы", "Рыба")),result);
    }

    @Test
    public void doesHasManeTrue() throws Exception {
        Lion lionSamets = new Lion("Самец");
        Lion lionSpy = Mockito.spy(lionSamets);
        boolean result = lionSpy.doesHaveMane();
        Mockito.verify(lionSpy, Mockito.times(1)).doesHaveMane();
        Assert.assertTrue(result);
    }
    @Test
    public void doesHasManeFalse() throws Exception {
        Lion lionSamets = new Lion("Самка");
        Lion lionSpy = Mockito.spy(lionSamets);
        boolean result = lionSpy.doesHaveMane();
        Mockito.verify(lionSpy, Mockito.times(1)).doesHaveMane();
        Assert.assertFalse(result);
    }


}