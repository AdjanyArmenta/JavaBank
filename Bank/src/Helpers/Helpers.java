package Helpers;

import java.util.Random;


public class Helpers {
    
    
    public static String generarNumeroAleatorio() {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < 16; i++) {
            sb.append(random.nextInt(10));
        }

        return sb.toString();
    }
        
    
    
}
