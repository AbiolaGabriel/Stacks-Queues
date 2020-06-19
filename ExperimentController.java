import java.util.*;
/**
 * Write a description of class ExperimentController here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ExperimentController{
    public ExperimentController(){
    }

    public static void main(String [] args){
        ExperimentController one = new ExperimentController();
        ExperimentController two = new ExperimentController();
        int i = 0;
        double avgQueue = 0;
        double avgStack = 0;
        int count = 0;
        while(i<10){
            avgQueue += one.timeAddQueue(100,23);
            avgStack += two.timePushStack(100,23);
            count++;
            i++;
        }
        System.out.println("The total trials: "+count);
        System.out.println("The average runtime for queue size of 100: "+(avgQueue/10));
        System.out.println("The average runtime for stack size of 100: "+(avgStack/10));
        
        // one.timeAddQueue(500, 23);
        // two.timePushStack(500, 23);

        // one.timeAddQueue(1000, 23);
        // two.timePushStack(1000, 23);

    }

    public long timeAddQueue(int x, int seed){
        long startTime = System.currentTimeMillis();
        MyQueue<Integer> q1 = new MyQueue<Integer>();
        Random r = new Random(seed);
        while(x>0){
            q1.add(r.nextInt());
            x--;
        }
        long endTime = System.currentTimeMillis();
        return (endTime - startTime);
    }

    public long timePushStack(int x, int seed){
        long startTime = System.currentTimeMillis();
        MyStack<Integer> s1 = new MyStack<Integer>();
        Random r = new Random(seed);
        while(x>0){
            s1.push(r.nextInt());
            x--;
        }
        long endTime = System.currentTimeMillis();
        return (endTime - startTime);
    }
}
