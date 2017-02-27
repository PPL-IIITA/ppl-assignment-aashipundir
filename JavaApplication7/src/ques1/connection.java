/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ques1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Suraj Singh
 */
public class connection {
  boy big[] = new boy[1000];  
  void boy() throws FileNotFoundException
  {
      int i=0;
        
        boy a = new boy();
        a.fix();
        String flow="boy.csv";
        BufferedReader buffer=null ;
        String gap = "";
	String Split = ",";
        try{
                    buffer = new BufferedReader(new FileReader(flow));
                    while((gap = buffer.readLine() )!= null){
			String[] by = gap.split(Split);
			big[i] = new boy();
                        big[i].name = by[0];
                        big[i].atrac = Integer.parseInt(by[1]);
			big[i].budget = Integer.parseInt(by[2]);
			big[i].iq= Integer.parseInt(by[3]);
                        big[i].minatrac= Integer.parseInt(by[4]);
			i++;
                    }
		}
		catch(FileNotFoundException e){
                    e.printStackTrace();
		}
                catch(IOException e){
                    e.printStackTrace();
		}
        
       
        
		
  
  }
  girl bigo[] = new girl[1000];
   void girl() throws FileNotFoundException
  {
      int j = 0;
      
        girl b = new girl();
        b.fix();
        String flow="girl.csv";
        BufferedReader buffer=null ;
        String gap = "";
	String Split = ",";
        try{
                    buffer = new BufferedReader(new FileReader(flow));
                    while((gap = buffer.readLine() )!= null){
			String[] by = gap.split(Split);
			bigo[j] = new girl();
                        bigo[j].name = by[0];
                        bigo[j].beauty = Integer.parseInt(by[1]);
			bigo[j].budget = Integer.parseInt(by[2]);
			bigo[j].iq= Integer.parseInt(by[3]);
                        j++;
                    }
		}
		catch(FileNotFoundException e){
                    e.printStackTrace();
		}
                catch(IOException e){
                    e.printStackTrace();
		}
        
  }
  void call()
  {
      patchup z = new patchup();
      z.jodi(big, bigo);
      
  }
    
}
