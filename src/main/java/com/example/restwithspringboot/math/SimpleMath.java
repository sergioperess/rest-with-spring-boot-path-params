package com.example.restwithspringboot.math;

public class SimpleMath {

    public Double sum(Double numberOne, Double numberTwo){  
        return  numberOne +  numberTwo;
    }
    
    public Double sub(Double numberOne, Double numberTwo){        
        return  numberOne -  numberTwo;
    }

    
    public Double mult(Double numberOne, Double numberTwo){   
        return  numberOne *  numberTwo;
    }

    
    public Double div(Double numberOne, Double numberTwo){            
        return  numberOne /  numberTwo;
    }   

    
    public Double medNum(Double numberOne, Double numberTwo){           
        Double media = ( numberOne +   numberTwo)/2;
        return media;
    }    

   
    public Double sqrNum(Double number){            
        Double raiz = Math.sqrt(number);
        return raiz;
    }
    
}
