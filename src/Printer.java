public class Printer {
    public int Id;
    public boolean working_status;
    public Printer(int Id){
        this.Id = Id;
    }
    public void print(String file_name,Computer c){
        System.out.println("Printing in progress...");
        System.out.print("Progress: ");
        for (int i = 0; i < 10; i++) {
            System.out.print(".");
        }
        System.out.println("FINISHED");
        System.out.println("File Name: " + file_name);
        System.out.println("Used Printer ID:  " + this.Id);
        System.out.println("Used Computer ID: " + c.Id);
    }
}
