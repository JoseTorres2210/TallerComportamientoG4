
package parrafo1;

public interface ProductoIterator {
    public AlmacenIterator crearProductosDisponiblesIterator();
    public AlmacenIterator crearProductosFallasIterator();
    public AlmacenIterator crearProductosReparacionIterator();
}
