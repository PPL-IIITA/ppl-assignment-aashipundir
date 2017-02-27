/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ques1;

import java.io.IOException;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;


public class patchup {
    
    void jodi(boy[] a,girl[] b)
   {
       Logger logger = Logger.getLogger("log");
       
       FileHandler flag;  
        try {   
            flag = new FileHandler("output.txt");  
            logger.addHandler(flag);
            SimpleFormatter form = new SimpleFormatter();  
            flag.setFormatter(form);  
        } 
        catch (SecurityException e) { 
            e.printStackTrace();  
        } 
        catch (IOException e) {  
            e.printStackTrace();  
        }  
       for(int i=0;i<40;i++)
       {
           for(int j=0;j<34;j++)
           {
               if(b[j].beauty < a[i].minatrac)
                   continue;
               else if(b[j].budget > a[i].budget)
                   continue;
               else if(b[j].iscommitted )
                   continue;
               else if(a[i].iscommited)
                   continue;
               else
               {
                   a[i].iscommited=true;
                   b[j].iscommitted=true;
                   logger.info(a[i].name+"--"+b[j].name);
                    break;
               }
                   
           }
       }
       
           
        
    }
    
}
