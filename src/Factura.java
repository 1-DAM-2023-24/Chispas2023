import java.util.ArrayList;
import java.util.Date;

public class Factura {
    private Integer CodigoFactura;
    private Date Fecha;
    private Integer BaseImponible;
    private double Total;
    private Cliente cliente;
    private ArrayList<Venta> venta = new ArrayList<Venta>();

    public Integer getCodigoFactura() {
        return CodigoFactura;
    }

    public void setCodigoFactura(Integer codigoFactura) {
        CodigoFactura = codigoFactura;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date fecha) {
        Fecha = fecha;
    }

    public Integer getBaseImponible() {
        return BaseImponible;
    }

    public void setBaseImponible(){
       Integer total = 0;
        for (Venta venta: this.venta) {
            total+=venta.getPrecio();
        }
        this.BaseImponible=total;
    }

    public double getTotal() {
        return Total;
    }

    public void setTotal() {
        Total = BaseImponible * 1.21;
    }
    public Factura(Cliente cliente){
        this.cliente = cliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public ArrayList<Venta> getVenta() {
        return venta;
    }

    public void setVenta(ArrayList<Venta> venta) {
        this.venta = venta;
    }
}
