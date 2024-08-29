/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Operaciones;

/**
 *
 * @author 57320
 */
public class operaciones {
    
    
    private float num1;
    private float num2;
    private float resultado;

    public operaciones(float num1, float num2, float resultado) {
        this.num1 = num1;
        this.num2 = num2;
        this.resultado = resultado;
    }
    
    
    public float suma(float num1,float num2){
        
       resultado= getNum1()+getNum2();
        return getResultado();
        
        
    }
    
    public float resta (float num1,float num2){
        
        resultado= getNum1()-getNum2();
        return getResultado();
    }

    public float multiplicacion(float num1,float num2){
        
        resultado= getNum1()*getNum2();
        return getResultado();
    }
    
    public float division(){
        
        resultado= getNum1()/getNum2();
        return getResultado();
    }

    /**
     * @return the num1
     */
    public float getNum1() {
        return num1;
    }

    /**
     * @return the num2
     */
    public float getNum2() {
        return num2;
    }

    /**
     * @return the resultado
     */
    public float getResultado() {
        return resultado;
    }
}
