package U1;

public class Estudiante extends Persona{
    
    private String numcontrol;
    private int semestre;
    protected String carrera;
    
    //Encapsular
    public void setNumcontrol(String numcontrol)
    {
        this.numcontrol=numcontrol;
    }
    
    public String getNumcontrol()
    {
        return this.numcontrol;
    }

    public void setSemestre(int semestre)
    {
        this.semestre=semestre;
    }
    
    public int getSemestre()
    {
        return this.semestre;
    }
 
    public void setCarrera(String carrera)
    {
        this.carrera=carrera;
    }
    
    public String getCarrera()
    {
        return this.carrera;
    }
    
    //Metodos
    public void Matricular(String numcontrol)
    {
        System.out.println("El alumno "+ numcontrol + " esta matriculado");
    }
}
