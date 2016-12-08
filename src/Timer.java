
/**
 *
 * @author ohs5008
 */
public class Timer {
    
    long total;
    long startTime;
    long endTime;
    boolean isRunning;
    
    public void startTimer() {
        isRunning = true; 
        if(isRunning == true) {
            startTime = System.currentTimeMillis();
        }
    }
        
    public void stopTimer() {
        isRunning = false;
        if(isRunning == true) {
            endTime = System.currentTimeMillis();
            total = total + endTime - startTime;
        }
    }
    
    public long totalTime() {
        if(isRunning) {
            long eTime = System.currentTimeMillis();
            return total + eTime - startTime;
        } else { 
            return total;
        }    
    }
    
    public long resetTimer() {
        return total = 0;
    }
    
    public void displayTime() {
        System.out.println("Time: " + totalTime() + total);
    }
}
