import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CatTests {

    @Spy
    private Feline feline;

    @Test
    public void getKittensEquals10() {
        int expected = 10;
        int actual = feline.getKittens(10);
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getKittensWithoutNumber() {
        int expected = 1;
        int actual = feline.getKittens();
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getFamilyFeline() {
        String expected = "Кошачьи";
        Assert.assertEquals(expected,feline.getFamily());
    }
}
