public class Servicio implements Venta{
    private Integer CodigoServicio;
    private Integer Precio;
    private Integer Tipo;
    private String Nombre;
    private Integer Total;


    @Override
    public String getNombre() {
        return Nombre;
    }

    @Override
    public Integer getPrecio() {
        return Precio;
    }

    @Override
    public Integer getTipo() {
        return Tipo;
    }

    @Override
    public void setNombre(String Nombre) {
        this.Nombre=Nombre;
    }

    @Override
    public void setPrecio(Integer Precio) {
        this.Precio=Precio;
    }

    @Override
    public void setTipo(Integer Tipo) {
        this.Tipo=Tipo;
    }

    @Override
    public Integer getCodigo() {
        return CodigoServicio;
    }

    @Override
    public void setCodigo(Integer Codigo) {
        this.CodigoServicio=Codigo;
    }

    @Override
    public Integer getTotal() {
        return Total;
    }

    @Override
    public void setTotal() {
        this.Total=(int) Math.floor(Precio+Precio*(Tipo/100));
    }
}
