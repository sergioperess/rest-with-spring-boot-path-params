package com.example.restwithspringboot.controller;

//import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.restwithspringboot.converters.NumberConverter;
import com.example.restwithspringboot.exceptions.UnsupportedMathOpperationException;
import com.example.restwithspringboot.math.SimpleMath;

// Controlador REST, facilita nas requisições web
@RestController
public class MathController {

    //private final AtomicLong counter = new AtomicLong();

    private SimpleMath simpleMath= new SimpleMath();

    // Entre chaves é necessário passar parâmetros obrigatórios
    @RequestMapping(value = "/sum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double sum(
        // Utilizada para recuperar dados da url e permite que o controller lide com url
        // parametrizadas, nesse caso serão passados dois parâmetros
        @PathVariable(value = "numberOne") String numberOne,
        @PathVariable(value = "numberTwo") String numberTwo
        ) throws Exception{
            if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)){
                throw new UnsupportedMathOpperationException("Please set a numeric value!");
            }
            return simpleMath.sum(NumberConverter.convertToDouble(numberOne),
                                  NumberConverter.convertToDouble(numberTwo));
    }

    @RequestMapping(value = "/sub/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double sub(
        // Utilizada para recuperar dados da url e permite que o controller lide com url
        // parametrizadas, nesse caso serão passados dois parâmetros
        @PathVariable(value = "numberOne") String numberOne,
        @PathVariable(value = "numberTwo") String numberTwo
        ) throws Exception{
            if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)){
                throw new UnsupportedMathOpperationException("Please set a numeric value!");
            }
            return simpleMath.sub(NumberConverter.convertToDouble(numberOne),
                                  NumberConverter.convertToDouble(numberTwo));
    }

    @RequestMapping(value = "/mult/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double mult(
        // Utilizada para recuperar dados da url e permite que o controller lide com url
        // parametrizadas, nesse caso serão passados dois parâmetros
        @PathVariable(value = "numberOne") String numberOne,
        @PathVariable(value = "numberTwo") String numberTwo
        ) throws Exception{
            if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)){
                throw new UnsupportedMathOpperationException("Please set a numeric value!");
            }
            return simpleMath.mult(NumberConverter.convertToDouble(numberOne),
                                   NumberConverter.convertToDouble(numberTwo));
    }

    @RequestMapping(value = "/div/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double div(
        // Utilizada para recuperar dados da url e permite que o controller lide com url
        // parametrizadas, nesse caso serão passados dois parâmetros
        @PathVariable(value = "numberOne") String numberOne,
        @PathVariable(value = "numberTwo") String numberTwo
        ) throws Exception{
            if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)){
                throw new UnsupportedMathOpperationException("Please set a numeric value!");
            }
            return simpleMath.div(NumberConverter.convertToDouble(numberOne),
                                  NumberConverter.convertToDouble(numberTwo));
    }

    @RequestMapping(value = "/medNum/{numberOne}/{numberTwo}", method = RequestMethod.GET)
    public Double medNum(
        // Utilizada para recuperar dados da url e permite que o controller lide com url
        // parametrizadas, nesse caso serão passados dois parâmetros
        @PathVariable(value = "numberOne") String numberOne,
        @PathVariable(value = "numberTwo") String numberTwo
        ) throws Exception{
            if(!NumberConverter.isNumeric(numberOne) || !NumberConverter.isNumeric(numberTwo)){
                throw new UnsupportedMathOpperationException("Please set a numeric value!");
            }
            
            Double media = simpleMath.medNum(NumberConverter.convertToDouble(numberOne),
                                     NumberConverter.convertToDouble(numberTwo));
            return media;
    }

    @RequestMapping(value = "/sqrNum/{number}", method = RequestMethod.GET)
    public Double sqrNum(
        // Utilizada para recuperar dados da url e permite que o controller lide com url
        // parametrizadas, nesse caso serão passados dois parâmetros
        @PathVariable(value = "number") String number
        ) throws Exception{
            if(!NumberConverter.isNumeric(number)){
                throw new UnsupportedMathOpperationException("Please set a numeric value!");
            }
            
            Double raiz = simpleMath.sqrNum(NumberConverter.convertToDouble(number));
            return raiz;
    }
   
}
