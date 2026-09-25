public class EmpleadoPorComision extends Empleado
{
    protected double tarifaComision;
    protected double ventasBrutas;
    
    public EmpleadoPorComision(String primerNombre, String apellidoPaterno, String numeroSeguroSocial, double tarifaComision, double ventasBrutas)
        {
            //llamada explicita al contructor de empleado
            super(primerNombre, apellidoPaterno, numeroSeguroSocial);

            this.tarifaComision = tarifaComision;
            this.ventasBrutas = ventasBrutas;
        }
    
   

    public double getTarifaComision(){
        return tarifaComision;
    }

    public double getVentasBrutas(){
        return ventasBrutas;
    }

 
    public void setTarifaComision(double tarifaComision){
        if(tarifaComision <= 0.0 || tarifaComision >= 1.0)
            throw new IllegalArgumentException(
                "La tarifa de comision debe ser > 0.0 y < 1.0"
            );
        this.tarifaComision = tarifaComision;
    }

    public void setMontoVentas(double ventasBrutas){
        if (ventasBrutas < 0.0)
            throw new IllegalArgumentException(
            "las ventas brutas deben ser >=0"
        );
        this.ventasBrutas = ventasBrutas;
    }
    @Override 
    public double ingresos(){
        return getTarifaComision() * getVentasBrutas();
    }

    //devolver la representacion String del objeto EmpleadoPorComision
    @Override
    public String toString(){
        return String.format( "%s: %s%n%s: %.2f%n%s: %.2f",
            "Empleado por comision" , super.toString(),
            "Ventas brutas" , getVentasBrutas(),
            "tarifa por comision" , getTarifaComision());
    }
}
