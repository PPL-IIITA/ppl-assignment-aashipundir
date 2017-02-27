/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ques1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
public class boy {
    
    String name;
    int atrac;
    int iq;
    int budget;
    int minatrac;
    boolean iscommited=false;
    
    
void fix() throws FileNotFoundException{
    
        PrintWriter print = new PrintWriter(new File("boy.csv"));
        StringBuilder connect = new StringBuilder();
     for(int i=0;i<40;i++)
        {
            name="no" + "more" + (i);
            atrac=(int) (2+(Math.random()*30));
            budget=(int) (100+(Math.random()*1000));
            iq=(int) (10+(Math.random()*20));
            minatrac=(int) (10+(Math.random()*25));
            
            connect.append(name);
            connect.append(',');
            connect.append(atrac);
            connect.append(',');
            connect.append(budget);
            connect.append(',');
            connect.append(iq);
            connect.append(',');
            connect.append(minatrac);
            connect.append("\n");
            
        }
         print.write(connect.toString());
        print.close();
        System.out.println("boy.csv Done!");
}
    
}
