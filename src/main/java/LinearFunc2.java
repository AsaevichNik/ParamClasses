public class LinearFunc2 implements FuncDo
{

private double start; private double end;
private double a, b, c, d;

public LinearFunc2(double start, double end, double a, double b, double c, double d) {
    this.start = start;
    this.end = end;
    this.a = a;
    this.b = b;
    this.c = c;
    this.d = d;
}

@Override
public double getfuncvalue(double x)
{
    return (((a*x) + b)/((c*x) + d));
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

