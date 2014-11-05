/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package askisi_2;

import dao.Idao;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author fil
 */
public class MyControler {
    private Idao dao;
   
    public MyControler (Idao dao){
        this.dao=dao;
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
