import java.io.FileNotFoundException;
import java.util.Scanner;
import java.lang.String;


public class Main {
    static Computer computer1 = new Computer(1);
    static Computer computer2 = new Computer(2);
    static Computer computer3 = new Computer(3);
    static Printer printer1 = new Printer(1);
    static Printer printer2 = new Printer(2);
    public static void main(String args[])throws Exception{

          SharedQueue queue = new SharedQueue();

        Scanner input = new Scanner(System.in);
        int checker = 0;
        String filename="";
        while (checker == 0){
            System.out.println("enter your file name");
            filename = input.nextLine();

            while (! (filename.matches(".+\\.(txt|csv|log|pdf)"))){                 //check the file type
                    System.out.println(" TypeNotSupportedException occurred");
                    System.out.println("please enter correct file / text file ");
                    filename = input.nextLine();
                }
            if(queue.addToQueue(filename)){
                PrintJob pj = new PrintJob();
                while(! (pj.print_job(filename))){
                    Thread.sleep(100);
                }
            }
            System.out.println("enter 0 to give a print order,  1 to exit");
            checker = input.nextInt();
            input.nextLine();
        }
    }


}
