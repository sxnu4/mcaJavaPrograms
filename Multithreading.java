import java.util.*;
import java.io.*;

class MultithreadingTest extends Thread{
    public void run(){
        try{
            System.out.println("Thread " + Thread.currentThread().getId() + " is running.");

        }
        catch(Exception e){
            System.out.println("Exception is caught.");

        }
    }
}

public class Multithreading {
        public static void main(String[] args){
        int n =8;
        for(int i=0; i<n; i++){
            MultithreadingTest obj = new MultithreadingTest();
            obj.start();
        }
    }
}
