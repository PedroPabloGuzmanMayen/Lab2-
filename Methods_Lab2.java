import java.util.ArrayList;

public class Methods_Lab2 {
	
    public ArrayList<Integer> process; 
    public ArrayList<Integer> waitlist;
    

	
	public boolean canBeAdded(int programSpace, int AviableSpace){
		if(programSpace < AviableSpace  ) {
			return true;
			
		}
		else {
			return false;
		}
		
	}
	public void addToWaitList(int totalBlocks){
		
		
		
	}
	public void GenerateProcessList(int totalBlocks) {
		for (int i =0; i < totalBlocks +1; i++) {
			process.add(0);
		}

	}
	public void addSpace() {
		
	}

	public void removeSpace() {
		
	}
	public void addProgram(int programBlocks) {
		for (int i =0; i < programBlocks +1; i++) {
			
			
		}
	}
	public void removeFromProcessList() {
		
	}
}
