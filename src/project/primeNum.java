/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project;

/**
 *
 * @author Owner
 */
public class primeNum {
    
    public void pn() {
        int noOfPrime=0;
        int i=1;
        while (noOfPrime<10001){
            int counter=0;
            for (int num=i;num>=1;num--){
                if (i%num==0){
                    counter++;
                }
            }
            if (counter==2){
                noOfPrime++;
                System.out.println(i);
            }
            i++;
        }
    }
    
    public static void main(String[] args){
        primeNum main = new primeNum();
        main.pn();
    }
}
