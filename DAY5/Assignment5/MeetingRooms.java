// package Assignment5;
import java.util.*;

class Interval {
    int start;
    int end;
    
    Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

public class MeetingRooms {
    
    public static boolean canAttend(List<Interval> intervals){
        Collections.sort(intervals, (a,b) -> a.start - b.start);

        int prevEnd = Integer.MIN_VALUE;

        for(Interval interval : intervals){
            if(interval.start < prevEnd) return false;
            prevEnd = interval.end;
        }
        return true;
    }
    
    public static void main(String[] args) {
        List<Interval> intervals1 = Arrays.asList(new Interval(0, 30), new Interval(5, 10), new Interval(15, 20));
        System.out.println(canAttend(intervals1));
        
        List<Interval> intervals2 = Arrays.asList(new Interval(7, 10), new Interval(2, 4));
        System.out.println(canAttend(intervals2));
    }
}
