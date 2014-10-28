package dao;


import java.util.ArrayList;
import java.util.List;

public class StubDao implements IDao {
	
	private List<Integer> numbers = new ArrayList<>();
	
	public StubDao()
    {
        
    }
    public StubDao(List<Integer> numbers) 
    {
        this.numbers = numbers;
    }
    public List<Integer> getNumbers() {
    	 	
        return numbers;
    }

}
