import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineTests {
    @Spy
    Feline feline;

    @Test
    public void felineGetCorrectEatMeat() throws Exception {
        List<String> result = feline.eatMeat();
        Assert.assertEquals((List.of("Животные", "Птицы", "Рыба")),result);
    }

    @Test
    public void getFamilyReturnCats() {
        String result = feline.getFamily();
        Assert.assertNotNull(result);
        Assert.assertEquals(("Кошачьи"),result);
    }

    @Test
    public void getKittensReturnDefaultValueOne() {
        int result = feline.getKittens();
        Mockito.verify(feline, Mockito.times(1)).getKittens(1);
    }

    @Test
    public void getKittensReturnCustomValue() {
        int result = feline.getKittens(15);
        Assert.assertEquals(15,result);
    }

}
