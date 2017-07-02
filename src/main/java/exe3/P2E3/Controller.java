package exe3.P2E3;

public abstract class Controller {
	
	public Controller() {
	}
	
	public abstract void updateView();
	
	public abstract void setName(String name);
	
	public abstract void setRollNo(String rollNo);
	
	public abstract String getName();
	
	public abstract String getRollNo();
}
