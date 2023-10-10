package ModeloImp;

public class Factura {
    private String concepto;
    private double valor;
    private String nombre;
    private int cedula;

    public Factura(String concepto, double valor, String nombre, int cedula) {
        this.concepto = concepto;
        this.valor = valor;
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public String getConcepto() {
        return concepto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setConcepto(String concepto) {
        this.concepto = concepto;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
}
