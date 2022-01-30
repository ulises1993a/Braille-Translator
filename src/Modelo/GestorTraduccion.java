package Modelo;

import static Modelo.Braille.*;

public class GestorTraduccion{
    
    public GestorTraduccion(){};
    
    public String TextToBraille(String origen){
        return ToBraille(origen);
    }
    
    public String BrailleToText(String origen){
        return FromBraille(origen);
    }
    
}
