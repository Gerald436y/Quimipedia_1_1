package U1;

public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private double estatura;
    private String caracteristicas;
    
    //encapsular
    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }
    
    public String getNombre()
    {
        return this.nombre;
    }
    
    public void setApellido(String apellido)
    {
        this.apellido=apellido;
    }
    
    public String getApellido()
    {
        return this.apellido;
    }
    
    public void setEdad(int edad)
    {
        this.edad=edad;
    }
    
    public int getEdad()
    {
        return this.edad;
    }
    
    public void setEstatura(double estatura)
    {
        this.estatura=estatura;
    }
    
    public double getEstatura()
    {
        return this.estatura;
    }
    
    public void setCaracteristicas(String caracteristicas)
    {
        this.caracteristicas=caracteristicas;
    }
    
    public String getcaracteristcas()
    {
        return this.caracteristicas;
    }
    
    //Metodos
    public void hablar (String mensaje)
            
    {
        System.out.println("Hola "+mensaje);
    }
}
