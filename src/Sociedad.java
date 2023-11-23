public class Sociedad  implements Cliente{
    private String CodigoCliente;
    private String DireccionPostal;
    private String Poblacion;
    private String Provincia;
    private String Email;
    private String Telefono;
    private String Cif;
    private String RazonSocial;

    public String getCif() {
        return Cif;
    }

    public void setCif(String cif) {
        Cif = cif;
    }


    @Override
    public String getCodigoCliente() {
        return CodigoCliente;
    }

    @Override
    public void setCodigoCliente() {
        this.CodigoCliente=Cif;
    }

    @Override
    public String getDireccionPostal() {
        return DireccionPostal;
    }

    @Override
    public void setDireccionPostal(String DireccionPostal) {
        this.DireccionPostal=DireccionPostal;
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
        return RazonSocial;
    }

    @Override
    public void setNombre(String Nombre) {
        this.RazonSocial=Nombre;
    }
}
