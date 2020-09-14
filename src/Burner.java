
public class Burner {
	enum Temperature{ 
        BLAZING, HOT, WARM, COLD; 
    } 
	private Temperature myTemperature;
	
	public Temperature getMyTemp() {
		return myTemperature;
	}
	
	private Setting mySetting;
	public int timer;
	
	public final static int TIME_DURATION = 2;
	
	public void stoveOperation() {
		
	}
}
