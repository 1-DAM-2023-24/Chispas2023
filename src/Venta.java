public interface Venta {
    public String  getNombre();
    public Integer getPrecio();
    public Integer getTipo();
    public Integer getCodigo();
    public Integer getTotal();

    public void setNombre(String Nombre);
    public void setPrecio(Integer Precio);
    public  void  setTipo(Integer Tipo);
    public  void  setCodigo(Integer Codigo);
    public void setTotal();
}
