/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multithreading;

/**
 *
 * @author hp
 */
public class SecondThread implements Runnable{
    Thread t;
    String name;
    
    public SecondThread(String name){
        this.name= name;
        t= new Thread ( this, this.name);
        System.out.println("Second thread created"+ t);
        t.start();
        
        
    }
    @Override 
    public void run(){
        try{
        for(int i=1; i<=3; i++){
            System.out.println("Main thread :"+ i);
            Thread.sleep(3000);
        }
        }catch(InterruptedException e){
            e.printStackTrace();
            
        }finally{
            System.out.println("exiting from second thread");
        }
        
    }
    
}
