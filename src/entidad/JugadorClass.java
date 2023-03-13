package entidad;

public class JugadorClass {
    private String nombre;
    private int edad;
    private double altura;
    private double peso;
    private String nacionalidad;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        System.out.printf ("NOMBRE", "\t" , "EDAD" , "\t" , "ALTURA", "\t","PESO" , "\t", "NACIONALIDAD" );
        return

                "nombre='" + nombre + "\t" +
                ", edad=" + edad + "\t"+
                ", altura=" + altura + "\t"+
                ", peso=" + peso + "\t"+
                ", nacionalidad='" + nacionalidad + '\'' +
                '}';
    }
}
