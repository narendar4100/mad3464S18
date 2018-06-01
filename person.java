/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods.pkgclass;

import java.util.Scanner;

/**
 *
 * @author hp
 */
public class person {
    String name;
    String address;
    int age;
    Scanner in = new Scanner(System.in);
    
    //defaoult constructor
    person(){
        name="unkonwn";
        address ="unknown";
        age = 1;
        
    }
    // parameterized constructor
    person(String name,String address,int age){
        this.name = name;
        this.address =address;
        this.age = age;   
    }
    person(person anotherperson){
         this.name = anotherperson.name;
         this.address= anotherperson.address;
         this.age= anotherperson.age;
        
    }
    
    void setname(){
    
    System.out.println("Enter name:");
    name =in.nextLine();
    }
    String getname(){
        return name;
    }
    void setaddress(){
    System.out.println("Enter address:");
    name = in.nextLine();
    
    }
    String getaddress(){
        return address;
       
    }
    void setage(){
        System.out.println("Enter age :");
        age = Integer.parseInt(in.nextLine());
        
    }
    int getage(){
        return age;
    }
    void setdata(){
        setname();
        setaddress();
        setage();
    }
    @Override
    public String toString(){
        String data = "name:"+ name+"\n address :"+ address +"\n age :"+ age;
        return data;
        
    }
    
}