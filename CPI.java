package CP;



public class CPI {
	private int speed;
	private String name;
	   public CPI(){
	   }
	   
	   int getSpeed() {
	      return speed;

	   }
	   String getName(){
		return name;  
	   }

	   public void setSpeed(int speed) {
	      this.speed = speed;

	   }
	   public void setName(String name){
		   this.name = name;
	   }
	   public CPI(int speed){
		   this.speed = speed;
	   }
	   public CPI(String name){
		   this.name = name;
	   }

	}