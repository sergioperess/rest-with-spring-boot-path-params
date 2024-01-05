package com.example.restwithspringboot.converters;

public class NumberConverter {
    public static Double convertToDouble(String strNumber) {
        if(strNumber == null) return 0D;
        
        // Utilizado para mudar virgula em ponto, ou seja, toda virgula que receber 
        // será transformado em ponto
        String number = strNumber.replaceAll(",", ".");

        if(isNumeric(number)){
            // Utilizado para converte para Double
            return Double.parseDouble(number);
        }
        return 0D;
    }

    public static boolean isNumeric(String strNumber) {
         if(strNumber == null) return false;
        String number = strNumber.replaceAll(",", ".");
        // numero positivo ou negativo de 0 a 9 e pode conter numeros fracionados
        return number.matches("[-+]?[0-9]*\\.?[0-9]+");

    }
     
}
