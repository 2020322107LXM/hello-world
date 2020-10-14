package CP;
public class PC {
    CPI cpu;

    HarjDisk HD;

    void setCPI(CPI cpu) {
        this.cpu = cpu;

    }

     void setHarjDisk(HarjDisk HD) {
        this.HD = HD;

    }

    void show(){
       System.out.println("roate:"+cpu.getSpeed());

       System.out.println("Hard dirve c:"+HD.getAmount());
       System.out.println("cpi^s name is"+cpu.getName());
       System.out.println("HarjDisk^s speed is"+HD.getSpeed());
    }

}

