import java.util.ArrayList;
public class PrintJob extends Thread{
    public boolean print_job(String file_name){
        if(Main.computer1.working_status == false){
            try{
                Main.computer1.activate_printer(file_name,Main.computer1);
                return true;
            }
            catch (Exception e){
                return false;
            }
        }
        else if(Main.computer2.working_status == false){
            try{
                Main.computer2.activate_printer(file_name,Main.computer2);
                return true;
            }
            catch (Exception e){
                return false;
            }
        }
        else if(Main.computer3.working_status == false){
            try{
                Main.computer3.activate_printer(file_name,Main.computer3);
                return true;
            }
            catch (Exception e){
                return false;
            }
        }
        return false;
    }
}
