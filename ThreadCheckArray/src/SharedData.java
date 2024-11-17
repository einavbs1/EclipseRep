import java.util.ArrayList;

public class SharedData 
{
	private ArrayList <Integer> arrayList;
	private ArrayList <Boolean> winArrayList;
	private boolean flag;
	private final int b;
	
	   public SharedData(int[] array, int b) {
	        this.arrayList = new ArrayList<>();
	        for (int value : array) {
	            this.arrayList.add(value);
	        }
	        this.b = b;
	    }

	public ArrayList <Boolean> getWinArray() 
	{
		return winArrayList;
	}

	 public void setWinArray(boolean[] winArray) {
	        this.winArrayList = new ArrayList<>();
	        for (boolean value : winArray) {
	            this.winArrayList.add(value);
	        }
	    }

	public ArrayList <Integer> getArray() 
	{
		return arrayList;
	}

	public int getB() 
	{
		return b;
	}

	public boolean getFlag() 
	{
		return flag;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
