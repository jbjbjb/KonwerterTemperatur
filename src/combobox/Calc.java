/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package combobox;

/**
 *
 * @author Justyna
 */
class Calc {
    private double r;
    public Calc(){}
    
    public double choose (String inputScale, String outputScale,double input){
        if(inputScale.equalsIgnoreCase("Kelvin"))
        {
            if(outputScale.equalsIgnoreCase("Fahrenheit")){
                 r= (9/5)*(input-273.15)+32;
                 return r;
            }
            if(outputScale.equalsIgnoreCase("Celcius")){
                 r= input-273.15;
                 return r;
            }
            if(outputScale.equalsIgnoreCase("Kelvin")){
                 return input;
            }
        }
        else if(inputScale.equalsIgnoreCase("Celcius"))
        {
            if(outputScale.equalsIgnoreCase("Fahrenheit")){
                 r= (9/5)*input+32;
                 return r;
            }
            if(outputScale.equalsIgnoreCase("Kelvin")){
                 r= input+273.15;
                 return r;
            }
            if(outputScale.equalsIgnoreCase("Celcius")){
                 return input;
            }
        }
        else   
        {
            if(outputScale.equalsIgnoreCase("Celcius")){
                 r= (5/9)*(input-32);
                 return r;
            }
            if(outputScale.equalsIgnoreCase("Kelvin")){
                 r= (5/9)*(input-32)+273.15;
                 return r;
            }
            if(outputScale.equalsIgnoreCase("Fahrenheit")){
                 return input;
            }
        }
       return 0;   
    }
    
    
}
