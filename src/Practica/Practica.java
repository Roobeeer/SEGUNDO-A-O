package Practica;

public class Practica {
    private int numero;
    private NodoInt siguiente;
    private NodoInt dato;


}


class NodoInt{
    private int dato;
    private NodoInt siguiente;

    public void NodoInt(int dato, NodoInt siguiente){
        this.dato = dato;
        this.siguiente = siguiente;
    }

    public void NodoInt(int dato){
        this.siguiente = null;
        this.dato = dato;

    }

    public void NodoInt(NodoInt siguiente){
        this.siguiente = siguiente;
        this.dato = 0;

    }
}
