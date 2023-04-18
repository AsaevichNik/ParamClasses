
public class Functional1 <func extends FuncDo> implements Functional<func>
{

    @Override
    public double FunctionalValue(func f) throws IllegalAccessException
    {
        if(f == null)throw new IllegalAccessException();
        double middle = (f.getfuncleftlim()+f.getfuncrightlim())/2;
        return f.getfuncvalue(f.getfuncleftlim())+f.getfuncvalue(f.getfuncrightlim())+f.getfuncvalue(middle);
    }

}
