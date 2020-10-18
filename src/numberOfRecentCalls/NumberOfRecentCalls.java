package numberOfRecentCalls;

/*
    Problem: https://leetcode.com/problems/number-of-recent-calls/

    You have a RecentCounter class which counts the number of recent requests within a certain time frame.
    Implement the RecentCounter class:
    RecentCounter() Initializes the counter with zero recent requests.
    int ping(int t) Adds a new request at time t, where t represents some time in milliseconds, and returns the number
    of requests that has happened in the past 3000 milliseconds (including the new request). Specifically, return the
    number of requests that have happened in the inclusive range [t - 3000, t].
    It is guaranteed that every call to ping uses a strictly larger value of t than the previous call.
 */

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class NumberOfRecentCalls
{
    public static void main(String[] args) {
        RecentCounter recentCounter = new RecentCounter();
        System.out.println(recentCounter.ping(1));
        System.out.println(recentCounter.ping(100));
        System.out.println(recentCounter.ping(3001));
        System.out.println(recentCounter.ping(3002));
    }
}

class RecentCounter {

    private Queue<Integer> queue = new ConcurrentLinkedQueue<>();
    private static final int INTERVAL_GAP = 3000;

    public RecentCounter() {}

    public int ping(int t) {
        try {
            queue.peek();
        }
        catch(Exception e) {
            return 1;
        }

        queue.add(t);

        while((t-INTERVAL_GAP) > queue.peek())
            queue.poll();

        return queue.size();

    }
}
