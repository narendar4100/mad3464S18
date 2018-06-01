/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods.pkgclass;

/**
 *
 * @author hp
 */
public class MethodsClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        arithematic operation1 = new arithematic() ;
        operation1.num1=20;
        System.out.println("num1:"+ operation1.num1);
        operation1.additon();
        int sum = operation1.additon(23,45);
        System.out.println("sum="+sum);
        
        float fsum = operation1.additon(123.55f,12.31f);
        System.out.println("floatsum=" +fsum);
        
        int[]numbers ={10,20,30,40};
        operation1.additon(numbers);
        
        operation1.additon(1,2,3,4,5,67,65);
        
    }
 }
    

