public class PruebaNomina {
    public static void main(String[] args)
    {
        EmpleadoAsalariado objEmpleadoAsalariado = new EmpleadoAsalariado("Erling", "Haaland", "123-234-456",800.00);
        EmpleadoPorHoras objEmpleadoPorHoras = new EmpleadoPorHoras("Jude", "Bellingham", "867-736-947", 50.50, 40);
        EmpleadoPorComision objEmpleadoPorComision = new EmpleadoPorComision("Yael","Avila","845-835-958", 20000, 0.6);
        EmpleadoBaseMasComision objEmpleadoBaseMasComision = new EmpleadoBaseMasComision("Marelly", "Gonzalez", "384-955-284", 15000, 0.4, 400 );

    //procesamiento de empleados por separado
    System.out.println("Empleados procesados por separado: ");
    System.out.printf("%n%s%n%s: $%,.2f%n%n", objEmpleadoAsalariado, "Ingresos", 
        objEmpleadoAsalariado.ingresos());
    System.out.printf("%n%s%n%s: $%,.2f%n%n", objEmpleadoPorHoras, "Ingresos", 
        objEmpleadoPorHoras.ingresos());
    System.out.printf("%n%s%n%s: $%,.2f%n%n", objEmpleadoPorComision, "Ingresos", 
        objEmpleadoPorComision.ingresos());
    System.out.printf("%n%s%n%s: $%,.2f%n%n", objEmpleadoBaseMasComision, "Ingresos", 
        objEmpleadoBaseMasComision.ingresos());
    }


}
