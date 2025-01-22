import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

public class FelineTests {

    @Spy
    private Feline feline;

    @Test
    public void getKittensWithoutNumber() {
        Feline feline = new Feline();
        int expected = 1;
        Assert.assertEquals(expected,feline.getKittens());
    }

    @Test
    public void getFamilyFeline() {
        Feline feline = new Feline();
        String expected = "Кошачьи";
        Assert.assertEquals(expected,feline.getFamily());
    }

    @Test
    public void getFoodForPredators() throws Exception {
        Feline feline = new Feline();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        Assert.assertEquals(feline.eatMeat(),expected);
    }
}
