public class Autonomos implements Cliente{
    private String CodigoCliente;
    private String DireccionPostal;
    private String Poblacion;
    private String Provincia;
    private String Email;
    private String Telefono;
    private String DNI;
    private String Nombre;
    private String Apellidos;

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }


    @Override
    public String getCodigoCliente() {
        return CodigoCliente;
    }

    @Override
    public void setCodigoCliente() {
        this.CodigoCliente=DNI;
    }

    @Override
    public String getDireccionPostal() {
        return DireccionPostal;
    }

    @Override
    public void setDireccionPostal(String DireccionPostal) {
        this.DireccionPostal = DireccionPostal;
    }

    @Override
    public String getPoblacion() {
        return Poblacion;
    }

    @Override
    public void setPoblacion(String Poblacion) {
        this.Poblacion=Poblacion;
    }

    @Override
    public String getPorvincia() {
        return Provincia;
    }

    @Override
    public void setProvincia(String Provincia) {
        this.Provincia=Provincia;
    }

    @Override
    public String getEmail() {
        return Email;
    }

    @Override
    public void setEmail(String Email) {
        this.Email=Email;
    }

    @Override
    public String getTelefono() {
        return Telefono;
    }

    @Override
    public void setTelefono(String Telefono) {
        this.Telefono=Telefono;
    }

    @Override
    public String getNombre() {
        return Nombre;
    }

    @Override
    public void setNombre(String Nombre) {
        this.Nombre=Nombre;
    }
}
