package Modelo;

import java.util.LinkedList;

public interface Braille {
    
    public static String ToBraille(String original){
        String resultado = "";
        char[] ingresado = original.toCharArray();
        int i;
        
        String[] cadena = new String[original.length()];
        for(i=0; i<cadena.length; i++){
            cadena[i] = String.valueOf(ingresado[i]);
        }
        
        for(i=0; i<cadena.length ; i++){
            switch(cadena[i]){
                case "0" -> {resultado = resultado.concat("⠼⠚");}
                case "1" -> {resultado = resultado.concat("⠼⠁");}
                case "2" -> {resultado = resultado.concat("⠼⠃");}
                case "3" -> {resultado = resultado.concat("⠼⠉");}
                case "4" -> {resultado = resultado.concat("⠼⠙");}
                case "5" -> {resultado = resultado.concat("⠼⠑");}
                case "6" -> {resultado = resultado.concat("⠼⠋");}
                case "7" -> {resultado = resultado.concat("⠼⠛");}
                case "8" -> {resultado = resultado.concat("⠼⠓");}
                case "9" -> {resultado = resultado.concat("⠼⠊");}
                    
                case "A" -> {resultado = resultado.concat("⠨⠁");}
                case "B" -> {resultado = resultado.concat("⠨⠃");}
                case "C" -> {resultado = resultado.concat("⠨⠉");}
                case "D" -> {resultado = resultado.concat("⠨⠙");}
                case "E" -> {resultado = resultado.concat("⠨⠑");}
                case "F" -> {resultado = resultado.concat("⠨⠋");}
                case "G" -> {resultado = resultado.concat("⠨⠛");}
                case "H" -> {resultado = resultado.concat("⠨⠓");}
                case "I" -> {resultado = resultado.concat("⠨⠊");}
                case "J" -> {resultado = resultado.concat("⠨⠚");}
                case "K" -> {resultado = resultado.concat("⠨⠅");}
                case "L" -> {resultado = resultado.concat("⠨⠇");}
                case "M" -> {resultado = resultado.concat("⠨⠍");}
                case "N" -> {resultado = resultado.concat("⠨⠝");}
                case "O" -> {resultado = resultado.concat("⠨⠕");}
                case "P" -> {resultado = resultado.concat("⠨⠏");}
                case "Q" -> {resultado = resultado.concat("⠨⠟");}
                case "R" -> {resultado = resultado.concat("⠨⠗");}
                case "S" -> {resultado = resultado.concat("⠨⠎");}
                case "T" -> {resultado = resultado.concat("⠨⠞");}
                case "U" -> {resultado = resultado.concat("⠨⠥");}
                case "V" -> {resultado = resultado.concat("⠨⠧");}
                case "W" -> {resultado = resultado.concat("⠨⠺");}
                case "X" -> {resultado = resultado.concat("⠨⠭");}
                case "Y" -> {resultado = resultado.concat("⠨⠽");}
                case "Z" -> {resultado = resultado.concat("⠨⠵");}
                  
                case "a" -> {resultado = resultado.concat("⠁");}
                case "b" -> {resultado = resultado.concat("⠃");}
                case "c" -> {resultado = resultado.concat("⠉");}
                case "d" -> {resultado = resultado.concat("⠙");}
                case "e" -> {resultado = resultado.concat("⠑");}
                case "f" -> {resultado = resultado.concat("⠋");}
                case "g" -> {resultado = resultado.concat("⠛");}
                case "h" -> {resultado = resultado.concat("⠓");}
                case "i" -> {resultado = resultado.concat("⠊");}
                case "j" -> {resultado = resultado.concat("⠚");}
                case "k" -> {resultado = resultado.concat("⠅");}// K
                case "l" -> {resultado = resultado.concat("⠇");}
                case "m" -> {resultado = resultado.concat("⠍");}
                case "n" -> {resultado = resultado.concat("⠝");}
                case "o" -> {resultado = resultado.concat("⠕");}
                case "p" -> {resultado = resultado.concat("⠏");}
                case "q" -> {resultado = resultado.concat("⠟");}
                case "r" -> {resultado = resultado.concat("⠗");}
                case "s" -> {resultado = resultado.concat("⠎");}
                case "t" -> {resultado = resultado.concat("⠞");}
                case "u" -> {resultado = resultado.concat("⠥");}
                case "v" -> {resultado = resultado.concat("⠧");}
                case "w" -> {resultado = resultado.concat("⠺");}    //w
                case "x" -> {resultado = resultado.concat("⠭");}
                case "y" -> {resultado = resultado.concat("⠽");}    //y
                case "z" -> {resultado = resultado.concat("⠵");}
                    
                case "Á" -> {resultado = resultado.concat("⠨⠷");}
                case "É" -> {resultado = resultado.concat("⠨⠮");}
                case "Í" -> {resultado = resultado.concat("⠨⠌");}
                case "Ó" -> {resultado = resultado.concat("⠨⠬");}
                case "Ú" -> {resultado = resultado.concat("⠨⠾");}
                case "á" -> {resultado = resultado.concat("⠷");}
                case "é" -> {resultado = resultado.concat("⠮");}
                case "í" -> {resultado = resultado.concat("⠌");}
                case "ó" -> {resultado = resultado.concat("⠬");}
                case "ú" -> {resultado = resultado.concat("⠾");}
                    
                case "ñ" -> {resultado = resultado.concat("⠻");}
                case "Ñ" -> {resultado = resultado.concat("⠨⠻");}
                    
                case "ü" -> {resultado = resultado.concat("⠳");}
                case "Ü" -> {resultado = resultado.concat("⠨⠳");}

                case "¡" -> {resultado = resultado.concat("⠖");}
                case "!" -> {resultado = resultado.concat("⠖");}
                case "¿" -> {resultado = resultado.concat("⠢");}
                case "?" -> {resultado = resultado.concat("⠢");}
                    
                case "," -> {resultado = resultado.concat("⠂");}
                case "-" -> {resultado = resultado.concat("⠤");}
                case "." -> {resultado = resultado.concat("⠄");}
                    
                case ":" -> {resultado = resultado.concat("⠒");}
                case ";" -> {resultado = resultado.concat("⠆");}
                    
                case "(" -> {resultado = resultado.concat("⠣");}
                case ")" -> {resultado = resultado.concat("⠜");}
                default -> {resultado = resultado.concat(cadena[i]);}
            }
        }
 
        return resultado;
    }
    
    public static String FromBraille(String original){
        String pivote = original;
        LinkedList<Integer> espacios = new LinkedList<>();
        boolean seguro = true;
        int cant;
        
        String[] array = getUnicodeArray(original);
        String resultado = "";
        
    /*    for (String array_i : array) {
            System.out.println(array_i);
        }*/
        while(seguro){
            int a = pivote.indexOf("⠨");
            if(a != -1){
                pivote = pivote.substring(0,a).concat(pivote.substring(a+1));
            } else{
                seguro = false;
            }
        }
        seguro = true;
        while(seguro){
            int a = pivote.indexOf("⠼");
            if(a != -1){
                pivote = pivote.substring(0,a).concat(pivote.substring(a+1));
            } else{
                seguro = false;
            }
        }
        seguro = true;
        while(seguro){
            int a = pivote.indexOf(" ");
            if(a != -1){
                espacios.add(a + espacios.size());
                pivote = pivote.substring(0,a).concat(pivote.substring(a+1));
            } else{
                seguro = false;
            }
        }
        cant = espacios.size();
        
        for (String array_i : array) {
            switch (array_i) {
                case "283c281a" -> {resultado = resultado.concat("0");}
                case "283c2801" -> {resultado = resultado.concat("1");}
                case "283c2803" -> {resultado = resultado.concat("2");}
                case "283c2809" -> {resultado = resultado.concat("3");}
                case "283c2819" -> {resultado = resultado.concat("4");}
                case "283c2811" -> {resultado = resultado.concat("5");}
                case "283c280b" -> {resultado = resultado.concat("6");}
                case "283c281b" -> {resultado = resultado.concat("7");}
                case "283c2813" -> {resultado = resultado.concat("8");}
                case "283c280a" -> {resultado = resultado.concat("9");}
                
                case "28282801" -> {resultado = resultado.concat("A");}
                case "28282803" -> {resultado = resultado.concat("B");}
                case "28282809" -> {resultado = resultado.concat("C");}
                case "28282819" -> {resultado = resultado.concat("D");}
                case "28282811" -> {resultado = resultado.concat("E");}
                case "2828280b" -> {resultado = resultado.concat("F");}
                case "2828281b" -> {resultado = resultado.concat("G");}
                case "28282813" -> {resultado = resultado.concat("H");}
                case "2828280a" -> {resultado = resultado.concat("I");}
                case "2828281a" -> {resultado = resultado.concat("J");}
                case "28282805" -> {resultado = resultado.concat("K");}
                case "28282807" -> {resultado = resultado.concat("L");}
                case "2828280d" -> {resultado = resultado.concat("M");}
                case "2828281d" -> {resultado = resultado.concat("N");}
                case "28282815" -> {resultado = resultado.concat("O");}
                case "2828280f" -> {resultado = resultado.concat("P");}
                case "2828281f" -> {resultado = resultado.concat("Q");}
                case "28282817" -> {resultado = resultado.concat("R");}
                case "2828280e" -> {resultado = resultado.concat("S");}
                case "2828281e" -> {resultado = resultado.concat("T");}
                case "28282825" -> {resultado = resultado.concat("U");}
                case "28282827" -> {resultado = resultado.concat("V");}
                case "2828283a" -> {resultado = resultado.concat("W");}
                case "2828282d" -> {resultado = resultado.concat("X");}
                case "2828283d" -> {resultado = resultado.concat("Y");}
                case "28282835" -> {resultado = resultado.concat("Z");}
                
                case "2801" -> {resultado = resultado.concat("a");}
                case "2803" -> {resultado = resultado.concat("b");}
                case "2809" -> {resultado = resultado.concat("c");}
                case "2819" -> {resultado = resultado.concat("d");}
                case "2811" -> {resultado = resultado.concat("e");}
                case "280b" -> {resultado = resultado.concat("f");}
                case "281b" -> {resultado = resultado.concat("g");}
                case "2813" -> {resultado = resultado.concat("h");}
                case "280a" -> {resultado = resultado.concat("i");}
                case "281a" -> {resultado = resultado.concat("j");}
                case "2805" -> {resultado = resultado.concat("k");}
                case "2807" -> {resultado = resultado.concat("l");}
                case "280d" -> {resultado = resultado.concat("m");}
                case "281d" -> {resultado = resultado.concat("n");}
                case "2815" -> {resultado = resultado.concat("o");}
                case "280f" -> {resultado = resultado.concat("p");}
                case "281f" -> {resultado = resultado.concat("q");}
                case "2817" -> {resultado = resultado.concat("r");}
                case "280e" -> {resultado = resultado.concat("s");}
                case "281e" -> {resultado = resultado.concat("t");}
                case "2825" -> {resultado = resultado.concat("u");}
                case "2827" -> {resultado = resultado.concat("v");}
                case "283a" -> {resultado = resultado.concat("w");}
                case "282d" -> {resultado = resultado.concat("x");}
                case "283d" -> {resultado = resultado.concat("y");}
                case "2835" -> {resultado = resultado.concat("z");}
                
                case "28282837" -> {resultado = resultado.concat("Á");}
                case "2828282e" -> {resultado = resultado.concat("É");}
                case "2828280c" -> {resultado = resultado.concat("Í");}
                case "2828282c" -> {resultado = resultado.concat("Ó");}
                case "2828283e" -> {resultado = resultado.concat("Ú");}
                case "2837" -> {resultado = resultado.concat("á");}
                case "282e" -> {resultado = resultado.concat("é");}
                case "280c" -> {resultado = resultado.concat("í");}
                case "282c" -> {resultado = resultado.concat("ó");}
                case "283e" -> {resultado = resultado.concat("ú");}
                
                case "283b" -> {resultado = resultado.concat("ñ");}
                case "2828283b" -> {resultado = resultado.concat("⠨Ñ");}
                
                case "2833" -> {resultado = resultado.concat("ü");}
                case "28282833" -> {resultado = resultado.concat("Ü");}
                
                case "2816" -> {resultado = resultado.concat("!");}
                case "2822" -> {resultado = resultado.concat("?");}
                case "2802" -> {resultado = resultado.concat(",");}
                case "2824" -> {resultado = resultado.concat("-");}
                case "2804" -> {resultado = resultado.concat(".");}
                case "2812" -> {resultado = resultado.concat(":");}
                case "2806" -> {resultado = resultado.concat(";");}
                case "2823" -> {resultado = resultado.concat("(");}
                case "281c" -> {resultado = resultado.concat(")");}
                default -> {resultado = resultado.concat(" ");}
            }
        }
        
        while(!espacios.isEmpty()){
            resultado = espacios(resultado, espacios.peek());
            espacios.pop();
        }
        resultado = resultado.substring(0, resultado.length()-cant);
        
        return resultado;
    }
        
    private static String[] getUnicodeArray(String original){
        int i, j=0, cantidad;
        LinkedList<String> resultadoparcial = new LinkedList<>();
        String[] resultadofinal;
        
        int[] unicodesDEC = new int[original.length()];
        String[] unicodesHEX; 
        
        StringBuilder retStr = new StringBuilder();
        for(i=0; i<original.length();i++){
            int cp = Character.codePointAt(original, i);
            int charCount = Character.charCount(cp);
            if(charCount > 1){
                i += charCount - 1;
                if (i >= original.length()){
                    throw new IllegalArgumentException("truncated unexpectedly");
                }
            }
            
            if(cp < 128){
                retStr.appendCodePoint(cp);
            } else{
                unicodesDEC[j++]=cp;
            }
        }
        
        unicodesHEX = toHEX(unicodesDEC);    

        for(i=0; i<unicodesHEX.length; i++){
            
            if(unicodesHEX[i].equals("283c") || unicodesHEX[i].equals("2828")){
                resultadoparcial.add(unicodesHEX[i].concat(unicodesHEX[++i]));          
            } else{
                 resultadoparcial.add(unicodesHEX[i]);
            }
        }
        cantidad = resultadoparcial.size();
        
        resultadofinal = new String[resultadoparcial.size()];
        for(i=0; i<cantidad; i++){
            resultadofinal[i] = resultadoparcial.peekFirst();
            resultadoparcial.pop();
        }
        
        return resultadofinal;
    }
    
    private static String[] toHEX(int[] DEC){
        String[] resultado = new String[DEC.length];
        int i;
        
        for(i=0; i<DEC.length; i++){
            resultado[i] = Integer.toHexString(DEC[i]);
        }
        
        return resultado;
    }
    
    private static String espacios(String cadena, int posicion){
        String cadena1 = cadena.substring(0, posicion);
        String cadena2 = cadena.substring(posicion);
        cadena = cadena1.concat(" ");
        cadena = cadena.concat(cadena2);
        return cadena;
    }
}
