import java.util.ArrayList;

/**
 * The SharedData class is used as a global storage for threads. It saves an
 * ArrayList of integer numbers and provides shared access to multiple threads.
 * When one of the threads finds a solution, it sets the flag to true and starts
 * writing into the boolean array to indicate which numbers contribute to the
 * solution for the target 'b' value.
 * 
 * @author Einav_Ben_Shushan_315064881
 * @author Avishag_Levi_314704222
 * @version ArrayList fixed 17/11/2024.
 */
public class SharedData {
	private ArrayList<Integer> arrayList;
	private ArrayList<Boolean> winArrayList;
	private boolean flag;
	private final int b;

	/**
	 * This Constructor is getting integer array and 'b' integer value and saving the
	 * array to ArrayList and the 'b' to our 'b'.
	 * 
	 * @param array Array of Integer numbers
	 * @param b     Integer number that we want to check if can sum of some numbers
	 *              will get us this value.
	 */
	public SharedData(int[] array, int b) {
		this.arrayList = new ArrayList<>();
		for (int value : array) {
			this.arrayList.add(value);
		}
		this.b = b;
	}

	/**
	 * This method is returning boolean ArrayList of the result which numbers in the
	 * integer array sum of them will get us the value b.
	 * 
	 * @return winArrayList ArrayList of boolean values each element in the Integer
	 *         ArrayList.
	 */
	public ArrayList<Boolean> getWinArray() {
		return winArrayList;
	}

	/**
	 * This method is getting boolean array and saving it in the boolean ArrayList.
	 * 
	 * @param winArray		Boolean array of the result each element in the integer array.
	 */
	public void setWinArray(boolean[] winArray) {
		this.winArrayList = new ArrayList<>();
		for (boolean value : winArray) {
			this.winArrayList.add(value);
		}
	}

	/**
	 * this method is returning the ArrayList of Integer.
	 * 
	 * @return arrayList Array of Integer list
	 */
	public ArrayList<Integer> getArray() {
		return arrayList;
	}

	/**
	 * This method is returning the b number.
	 * 
	 * @return b Integer number that we are checking if sum of numbers from array is
	 *         equal to.
	 */
	public int getB() {
		return b;
	}

	/**
	 * This method is tell us if some thread already found solution.
	 * 
	 * @return flag boolean value if some thread found solution it will be true.
	 */
	public boolean getFlag() {
		return flag;
	}

	/**
	 * This method is changing the flag to the param if found solution it will be
	 * true.
	 * 
	 * @param flag boolean value if some thread found solution it will be true.
	 */
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

}
