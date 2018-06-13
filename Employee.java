/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package serialization;

/**
 *
 * @author hp
 */
public class Employee implements java.io.Serializable{
    public String name;
    public String address;
    public int SSN;
    public int number;
    
    public void mailCheque(){
        System.out.println("mailing a cheque to "+ name + "" + address); 
    }
    
}
