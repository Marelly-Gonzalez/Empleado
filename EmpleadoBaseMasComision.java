public class EmpleadoBaseMasComision extends EmpleadoPorComision 
{
    private double salarioBase;
    
    public EmpleadoBaseMasComision(String primerNombre, String apellidoPaterno, 
    String numeroSeguroSocial, double montoVentasBrutas, 
    double comision, double salarioBase)
    {
        super(primerNombre, apellidoPaterno, numeroSeguroSocial, comision, montoVentasBrutas);

        if(salarioBase < 0.0)
            throw new IllegalArgumentException(
        "El salario base debe ser >= 0.0");
        this.salarioBase = salarioBase;
    }
    public void establecerSalarioBase(double salarioBase)
    {
        if(salarioBase < 0.0)
            throw new IllegalArgumentException(
                "El salario base debe ser >= 0.0");
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase(){
        return salarioBase;
    }

    @Override
    public double ingresos(){
        return getSalarioBase() + super.ingresos();
    }

    @Override
    public String toString(){
        return String.format("%s%n%s%n%s: %.2f", super.toString(),
            "Con sueldo base", "Salario base", getSalarioBase());
    }
}
