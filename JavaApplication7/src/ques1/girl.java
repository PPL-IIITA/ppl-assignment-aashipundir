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
public class girl {
    
    String name;
    int beauty;
    int iq;
    int budget;
    boolean iscommitted=false;
    
    void fix() throws FileNotFoundException{
    
        PrintWriter print = new PrintWriter(new File("girl.csv"));
        StringBuilder connect = new StringBuilder();
     for(int i=0;i<34;i++)
        {
            name="lucy" + "a" + (i);
            beauty=(int) (2+(Math.random()*30));
            budget=(int) (100+(Math.random()*1000));
            iq=(int) (10+(Math.random()*20));
            
            
            connect.append(name);
            connect.append(',');
            connect.append(beauty);
            connect.append(',');
            connect.append(budget);
            connect.append(',');
            connect.append(iq);
            connect.append("\n");
            
        }
         print.write(connect.toString());
        print.close();
        System.out.println("girl.csv Done!");
}
    
}
