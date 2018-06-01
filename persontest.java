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
public class persontest {
    public static void main(String args[]){
    person sumanth = new person();
    sumanth.name= "sumanth";
    sumanth.address ="toronto";
    sumanth.age=20;
    System.out.println("name:"+ sumanth.name + "\n address :"+ sumanth.address+ "\n Age:"+ sumanth.age);
    
//    person foram = new person();
//    foram.setname();
//    String nm = foram.getname();
//    foram.setaddress();
//    String add = foram.getaddress();
//    foram.setage();
//    int age = foram.getage ();
//    System.out.println("Name:"+ nm + "\naddress:"+ add + "\nage:"+ age);
//    
//    person anu = new person();
//    anu.setdata();
//    System.out.println(anu.toString());
//    
    person aman = new person();
    System.out.println(aman.toString());
    
    person rimpal = new person("rimpal","brampton",20);
    System.out.println(rimpal.toString());
    
    person rimpal2 = new person(rimpal);
    System.out.println(rimpal2.toString()); 
    }
   }
