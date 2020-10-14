package CP;

public class HarjDisk {
	private int speed;
	   int amount; 
public HarjDisk(){
	
}
	   int getAmount() {
	      return amount;

	   }
	   int getSpeed(){
		   if(speed > 0){
			   return speed;}
			   return 0;
		   
	   }

	   public void setAmount(int amount) {
	      this.amount = amount;}
        void setAmount(int speed,String x){
	this.amount = amount;

	   }
        public HarjDisk(int amount,int speed){
        	this.amount = amount;
        	this.speed = speed;
        }

	}