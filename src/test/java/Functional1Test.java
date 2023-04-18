import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class Functional1Test
{
    @Test
    public void LinFTest() throws IllegalAccessException {
        Functional1<LinearFunc> f1 = new Functional1<>();
        LinearFunc func = new LinearFunc(0,10,2,3);
        assertEquals(f1.FunctionalValue(func), 39);
    }
    @Test
    public void TrigTest() throws IllegalAccessException {
        Functional1<TrigonometryFunc> f1 = new Functional1<>();
        TrigonometryFunc func = new TrigonometryFunc(3.14,6.28,1,1);
        assertEquals(f1.FunctionalValue(func), Math.sin(3.14)+Math.sin(6.28)+Math.sin(9.42/2));
    }
    @Test
    public void RatFTest() throws IllegalAccessException {
        Functional1<LinearFunc2> f1 = new Functional1<>();
        LinearFunc2 func = new LinearFunc2(0,10, 2, 3, 0,1);
        assertEquals(f1.FunctionalValue(func), 39);
    }
    @Test
    public void ExpFTest() throws IllegalAccessException {
        Functional1<TrigonometryFunc2> f1 = new Functional1<>();
        TrigonometryFunc2 func = new TrigonometryFunc2(0,2,1,0);
        assertEquals(f1.FunctionalValue(func), Math.exp(0)+Math.exp(1)+Math.exp(2));
    }
}