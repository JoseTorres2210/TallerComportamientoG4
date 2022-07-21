
package parrafo1;

import java.util.ArrayList;


public class InventarioIterator implements AlmacenIterator{
    private Inventario inventario;
    private int posActual;
    private ArrayList<Item> items;
    

    public InventarioIterator(Inventario inventario, int posActual) {
        this.inventario = inventario;
        this.posActual = posActual;
    }
    
    
    public Item previousItem(){
        posActual--;
        return items.get(posActual);
    }

    @Override
    public Item nextItem() {
        if(hasNext()){
            posActual++;
        }        
        return items.get(posActual);
    }

    @Override
    public boolean hasNext() {
        if(items.get(posActual+1)== null){
            return false;
        }else{
            return true;
        }        
    }
}
