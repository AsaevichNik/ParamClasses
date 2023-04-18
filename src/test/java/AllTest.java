import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class AllTest
{

@Test
public static void resF1()
{
    TrigonometryFunc2 func = new TrigonometryFunc2(0, 0, 1, 0);
    assertEquals(func.getfuncvalue(1), Math.exp(1));
}

@Test
public static void resF2()
{
    TrigonometryFunc func = new TrigonometryFunc(0, 0, 1, 0);
    assertEquals(func.getfuncvalue(1), 0);
}

@Test
public static void resF3()
{
    LinearFunc func = new LinearFunc(0, 0, 1, 0);
    assertEquals(func.getfuncvalue(1), 1);
}

@Test
public static void resF4()
{
    LinearFunc2 func = new LinearFunc2(0, 0, 1, 1, 1 ,1);
    assertEquals(func.getfuncvalue(1), 1);
}

}
