import javax.xml.crypto.Data;

public class Estudiante {

    String nombre;
    String codigo;
    Data fechaNacimiento;
    double promedio;

    public Estudiante(String nombre, String codigo, Data fechaNacimiento, double promedio) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.fechaNacimiento = fechaNacimiento;
        this.promedio = promedio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Data getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Data fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }
}
