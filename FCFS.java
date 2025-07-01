import java.util.Scanner;

public class FCFS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int p1Burst, p2Burst, p3Burst, p4Burst, p5Burst, p6Burst;
        int p1Arrival, p2Arrival, p3Arrival, p4Arrival, p5Arrival, p6Arrival;
        int p1Start = 0, p2Start, p3Start, p4Start, p5Start, p6Start;
        int p1Complete, p2Complete, p3Complete, p4Complete, p5Complete, p6Complete;
        int p1Waiting, p2Waiting, p3Waiting, p4Waiting, p5Waiting, p6Waiting;
        int averageWaiting;

        // Input burst times and arrival times
        System.out.println("Enter burst time for process P1: ");
        p1Burst = sc.nextInt();
        System.out.println("Enter arrival time for process P1: ");
        p1Arrival = sc.nextInt();
        
        System.out.println("Enter burst time for process P2: ");
        p2Burst = sc.nextInt();
        System.out.println("Enter arrival time for process P2: ");
        p2Arrival = sc.nextInt();
        
        System.out.println("Enter burst time for process P3: ");
        p3Burst = sc.nextInt();
        System.out.println("Enter arrival time for process P3: ");
        p3Arrival = sc.nextInt();
        
        System.out.println("Enter burst time for process P4: ");
        p4Burst = sc.nextInt();
        System.out.println("Enter arrival time for process P4: ");
        p4Arrival = sc.nextInt();
        
        System.out.println("Enter burst time for process P5: ");
        p5Burst = sc.nextInt();
        System.out.println("Enter arrival time for process P5: ");
        p5Arrival = sc.nextInt();
        
        System.out.println("Enter burst time for process P6: ");
        p6Burst = sc.nextInt();
        System.out.println("Enter arrival time for process P6: ");
        p6Arrival = sc.nextInt();

        p1Complete = p1Start + p1Burst;
        p1Waiting = p1Start - p1Arrival;

        p2Start = p1Complete;
        p2Complete = p2Start + p2Burst;
        p2Waiting = p2Start - p2Arrival;

        p3Start = p2Complete;
        p3Complete = p3Start + p3Burst;
        p3Waiting = p3Start - p3Arrival;

        p4Start = p3Complete;
        p4Complete = p4Start + p4Burst;
        p4Waiting = p4Start - p4Arrival;

        p5Start = p4Complete;
        p5Complete = p5Start + p5Burst;
        p5Waiting = p5Start - p5Arrival;

        p6Start = p5Complete;
        p6Complete = p6Start + p6Burst;
        p6Waiting = p6Start - p6Arrival;

        System.out.println("First Come First Serve (FCFS)");
        System.out.println();
        System.out.println("Process\tBurst\tArrival\tStart\tComplete\tWaiting");
        System.out.println("P1\t" + p1Burst + "\t" + p1Arrival + "\t" + p1Start + "\t" + p1Complete + "\t\t" + p1Waiting + "\t");
        System.out.println("P2\t" + p2Burst + "\t" + p2Arrival + "\t" + p2Start + "\t" + p2Complete + "\t\t" + p2Waiting + "\t");
        System.out.println("P3\t" + p3Burst + "\t" + p3Arrival + "\t" + p3Start + "\t" + p3Complete + "\t\t" + p3Waiting + "\t");
        System.out.println("P4\t" + p4Burst + "\t" + p4Arrival + "\t" + p4Start + "\t" + p4Complete + "\t\t" + p4Waiting + "\t");
        System.out.println("P5\t" + p5Burst + "\t" + p5Arrival + "\t" + p5Start + "\t" + p5Complete + "\t\t" + p5Waiting + "\t");
        System.out.println("P6\t" + p6Burst + "\t" + p6Arrival + "\t" + p6Start + "\t" + p6Complete + "\t\t" + p6Waiting + "\t");

        System.out.println();
        averageWaiting = (p1Waiting + p2Waiting + p3Waiting + p4Waiting + p5Waiting + p6Waiting) / 6;
        System.out.println("Average waiting time: " + averageWaiting);

        sc.close();
    }
}
