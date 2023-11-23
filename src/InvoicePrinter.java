import java.util.ArrayList;

public class InvoicePrinter {
    public void print(Factura factura){
        //Factura: codigo | fecha
        //Cliente: cif/nif | nombre | direccion | poblacion | provincia | email
        //Linea Venta(producto/servicio): codigo | nombre | precio | tipo iva | total (precio+iva)
        //Total: total (calcula de la suma de todos los totales de la linea de venta)
        Cliente cliente=factura.getCliente();
        ArrayList<Venta> ventas = factura.getVenta();
        System.out.println("Factura: "+factura.getCodigoFactura()+" | "+factura.getFecha());
        System.out.println("Cliente: "+cliente.getCodigoCliente()+" | "+cliente.getNombre()+" | "+cliente.getDireccionPostal()+" | "+cliente.getPoblacion()+" | "+cliente.getPorvincia()+" | "+cliente.getEmail());
        for (Venta v:ventas) {
            System.out.println("Venta: "+v.getCodigo()+" | "+v.getNombre()+" | "+v.getPrecio()+"€ | "+v.getTipo()+"% | "+v.getTotal()+"€");
        }
        System.out.println("Total: "+factura.getTotal()+"€");
    }
}
