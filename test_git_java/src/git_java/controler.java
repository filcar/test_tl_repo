/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package git_java;

import dao.Idao;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author fil
 */
public class controler {
     private Idao dao;
   
    public controler (Idao dao){
        this.dao=dao;
    }
    public int getMinnumbers()
    {
        int i;
        List<Integer> numberCon = dao.getNumbers();
        if(!numberCon.isEmpty())
        i = Collections.min(numberCon);
        else i=0;
        return i; 
    }
            
    public int getMaxnumbers(){
             //throw new UnsupportedOperationException("Not implemented yet");
        int i;
        List<Integer> numberCon = dao.getNumbers();
        if(!numberCon.isEmpty())
        i = Collections.max(numberCon);
        else i=0;
        return i;   
    }
}
