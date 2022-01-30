package Controlador;

import Modelo.GestorTraduccion;

public class OyenteTraduccion {
    
    GestorTraduccion gestor = new GestorTraduccion();
    
    public OyenteTraduccion(){}
    
    public String TextToBrialle(String origen){
        return gestor.TextToBraille(origen);
    }
    
    public String BrialleToText(String origen){
        return gestor.BrailleToText(origen);
    }
    
}
