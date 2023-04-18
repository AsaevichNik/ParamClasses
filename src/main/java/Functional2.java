public class Functional2 <func extends FuncDo> implements Functional<func>
{
private double leftLim, rightLim;

public Functional2(double leftLim, double rightLim)
{
    this.leftLim = leftLim;
    this.rightLim = rightLim;
}

@Override
public double FunctionalValue(func f) throws IllegalAccessException
{
    if(f.getfuncleftlim() > leftLim || f.getfuncrightlim() < rightLim) throw new IllegalAccessException();
    return (rightLim - leftLim)*f.getfuncvalue((rightLim + leftLim)/2);
}
}
