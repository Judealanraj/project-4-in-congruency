import java.util.*;
public class SharedQueue {
    public Queue<String> queue = new LinkedList<>();
    public boolean addToQueue(String filename) throws Exception{
        if(queue.size()>6){
            System.out.println("Work space is full\nTry after sometime");
            return false;
        }
        else{
            queue.add(filename);
            return true;
        }
    }
    public String takeFromQueue(){
        if(queue.size()>0){
            return queue.remove();
        }
        else {
            return null;
        }
    }
}
