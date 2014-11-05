/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stubdao;

import dao.Idao;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author fil
 */
public class StubDao implements Idao {
    private List<Integer> numbers = new ArrayList<>();
//constractor
    public StubDao()
    {}
//constractor (dependency injection)
    public StubDao(List<Integer> numbers)
    {
        this.numbers=numbers;
    }
   public void setNumbers(List<Integer> numbers2)
    {
        numbers=numbers2;
    }
   @Override
    public List<Integer> getNumbers() 
    {
        return numbers;
    }
    
}
