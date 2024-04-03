public class Computer extends Thread{
    public int Id;

    public  Computer(int Id){
        this.Id = Id;
    }
    public boolean working_status;
    public void activate_printer(String file_name,Computer c){
        Main.printer1.working_status = true;
        if(Main.printer1.working_status == false){
             Thread t1 = new Thread(new Runnable() {
                @Override
                public void run() {
                    c.working_status = true;
                    Main.printer1.print(file_name,c);
                    Main.printer1.working_status = false;
                    c.working_status = false;
                }
            });
            t1.start();

        }
        else if(Main.printer2.working_status == false){
            Thread t2 = new Thread(new Runnable() {
                @Override
                public void run() {
                    Main.printer2.working_status = true;
                    Main.printer1.print(file_name,c);
                    Main.printer2.working_status = false;
                    Main.printer1.working_status = true;
                }
            });
            t2.start();
        }
    }
}
