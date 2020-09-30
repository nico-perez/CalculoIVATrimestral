package edu.facturacion;

public enum IVA
{
    Normal(.21),
    Reducido(.1),
    Superreducido(.04);

    public double pctj;
    private IVA(double d)
    {
        pctj = d;
    }
}
