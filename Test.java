package CP;
public class Test {
	   public static void main(String args[]) {
	       CPI cpu = new CPI();

	       HarjDisk HD=new HarjDisk();
	       cpu.setName(":dd");

	       cpu.setSpeed(2200);

	       HD.setAmount(300);
	      

	       PC pc =new PC();

	       pc.setCPI(cpu);

	       pc.setHarjDisk(HD);

	       pc.show();

	    }

	}
