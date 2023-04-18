import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class Functional2Test
{

    @Test
    public void LinTest() throws IllegalAccessException {
        Functional2<LinearFunc> f1 = new Functional2<>(0 ,1);
        LinearFunc func = new LinearFunc(0,1, 1, 0);
        assertEquals(f1.FunctionalValue(func), 0.5);
    }

    @Test
    public void Lin2Test() throws IllegalAccessException {
        Functional2<LinearFunc2> f1 = new Functional2<>(0 ,1);
        LinearFunc2 func = new LinearFunc2(0,1,2,2,2,2);
        assertEquals(f1.FunctionalValue(func), 1);
    }

    @Test
    public void TrigTest() throws IllegalAccessException {
        Functional2<TrigonometryFunc> f1 = new Functional2<>(0 ,1);
        TrigonometryFunc func = new TrigonometryFunc(0,1, 1, 0);
        assertEquals(f1.FunctionalValue(func), 0);
    }

    @Test
    public void Trig2Test() throws IllegalAccessException {
        Functional2<TrigonometryFunc2> f1 = new Functional2<>(0 ,1);
        TrigonometryFunc2 func = new TrigonometryFunc2(0,1, 1, 0);
        assertEquals(f1.FunctionalValue(func), Math.pow(Math.exp(1), 0.5));
    }
}
