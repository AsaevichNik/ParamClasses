public class TrigonometryFunc implements FuncDo
{
private double start, end;
private double a, b;

public TrigonometryFunc(double start, double end, double a, double b) {
    this.start = start;
    this.end = end;
    this.a = a;
    this.b = b;
}

@Override
public double getfuncvalue(double x) {
    return (a*Math.sin(b*x));
}

@Override
public double getfuncleftlim()
{
    return start;
}

@Override
public double getfuncrightlim()
{
    return end;
}

public double getStart() {
    return start;
}

public void setStart(double start) {
    this.start = start;
}

public double getEnd() {
    return end;
}

public void setEnd(double end) {
    this.end = end;
}

}

