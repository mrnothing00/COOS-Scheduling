import java.util.Scanner;

public class roundRobin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for burst times and arrival times
        System.out.print("Enter Burst Time for P1: ");
        int p1Burst1 = scanner.nextInt();
        System.out.print("Enter Arrival Time for P1: ");
        int p1Arrival1 = scanner.nextInt();

        System.out.print("Enter Burst Time for P2: ");
        int p2Burst1 = scanner.nextInt();
        System.out.print("Enter Arrival Time for P2: ");
        int p2Arrival1 = scanner.nextInt();

        System.out.print("Enter Burst Time for P3: ");
        int p3Burst1 = scanner.nextInt();
        System.out.print("Enter Arrival Time for P3: ");
        int p3Arrival1 = scanner.nextInt();

        System.out.print("Enter Burst Time for P4: ");
        int p4Burst1 = scanner.nextInt();
        System.out.print("Enter Arrival Time for P4: ");
        int p4Arrival1 = scanner.nextInt();

        System.out.print("Enter Burst Time for P5: ");
        int p5Burst = scanner.nextInt();
        System.out.print("Enter Arrival Time for P5: ");
        int p5Arrival = scanner.nextInt();

        System.out.print("Enter Burst Time for P6: ");
        int p6Burst = scanner.nextInt();
        System.out.print("Enter Arrival Time for P6: ");
        int p6Arrival = scanner.nextInt();

        // Close the scanner to avoid resource leak
        scanner.close();

        // Initialization
        int p1Start1 = 0, p2Start1, p3Start1, p4Start1;
        int p1Complete1, p2Complete1, p3Complete1, p4Complete1;
        int p1Waiting1, p2Waiting1, p3Waiting1, p4Waiting1;
        int p1Remaining1, p2Remaining1, p3Remaining1, p4Remaining1;
        int p1Burst2, p2Burst2, p3Burst2, p4Burst2;
        int p1Arrival2, p2Arrival2, p3Arrival2, p4Arrival2;
        int p1Start2, p2Start2, p3Start2, p4Start2, p5Start2, p6Start2;
        int p1Complete2, p2Complete2, p3Complete2, p4Complete2, p5Complete2, p6Complete2;
        int p1Waiting2, p2Waiting2, p3Waiting2, p4Waiting2, p5Waiting2, p6Waiting2;
        int p1Remaining2, p2Remaining2, p3Remaining2, p4Remaining2, p5Remaining2, p6Remaining2;
        int p5Burst3, p6Burst3;
        int p5Arrival3, p6Arrival3;
        int p5Start3, p6Start3;
        int p5Complete3, p6Complete3;
        int p5Waiting3, p6Waiting3;
        int p5Remaining3, p6Remaining3;
        int averageWaiting;
        int quantum = 20;

        // First Cycle
        p1Complete1 = p1Start1 + quantum; 
        p1Remaining1 = p1Burst1 - quantum;
        p1Waiting1 = p1Start1 - p1Arrival1;

        p2Start1 = p1Complete1;
        p2Complete1 = p2Start1 + quantum;
        p2Remaining1 = p2Burst1 - quantum;
        p2Waiting1 = p2Start1 - p2Arrival1;

        p3Start1 = p2Complete1;
        p3Complete1 = p3Start1 + quantum;
        p3Remaining1 = p3Burst1 - quantum;
        p3Waiting1 = p3Start1 - p3Arrival1;

        p4Start1 = p3Complete1;
        p4Complete1 = p4Start1 + quantum;
        p4Remaining1 = p4Burst1 - quantum;
        p4Waiting1 = p4Start1 - p4Arrival1;

        System.out.println("Round Robin (RR)");
        System.out.println();
        System.out.println("First Cycle: ");
        System.out.println();
        System.out.println("Process\tBurst\tArrival\tStart\tComplete\tWaiting\tRemaining");
        System.out.println("P1\t" + p1Burst1 + "\t" + p1Arrival1 + "\t" + p1Start1 + "\t" + p1Complete1 + "\t\t" + p1Waiting1 + "\t" + p1Remaining1);
        System.out.println("P2\t" + p2Burst1 + "\t" + p2Arrival1 + "\t" + p2Start1 + "\t" + p2Complete1 + "\t\t" + p2Waiting1 + "\t" + p2Remaining1);
        System.out.println("P3\t" + p3Burst1 + "\t" + p3Arrival1 + "\t" + p3Start1 + "\t" + p3Complete1 + "\t\t" + p3Waiting1 + "\t" + p3Remaining1);
        System.out.println("P4\t" + p4Burst1 + "\t" + p4Arrival1 + "\t" + p4Start1 + "\t" + p4Complete1 + "\t\t" + p4Waiting1 + "\t" + p4Remaining1);

        // Second Cycle
        System.out.println();
        
        p1Burst2 = p1Remaining1;
        p1Arrival2 = p1Complete1;
        p1Start2 = p4Complete1; 
        p1Complete2 = p1Start2 + p1Burst2;
        p1Waiting2 = p1Start2 - p1Arrival2;
        p1Remaining2 = p1Remaining1 - p1Burst2;

        p5Start2 = p1Complete2;
        p5Complete2 = p5Start2 + quantum;
        p5Waiting2 = p5Start2 - p5Arrival;
        p5Remaining2 = p5Burst - quantum;

        p2Burst2 = p2Remaining1;
        p2Arrival2 = p2Complete1;
        p2Start2 = p5Complete2; 
        p2Complete2 = p2Start2 + p2Burst2;
        p2Waiting2 = p2Start2 - p2Arrival2;
        p2Remaining2 = p2Remaining1 - p2Burst2;

        p6Start2 = p2Complete2;
        p6Complete2 = p6Start2 + quantum;
        p6Waiting2 = p6Start2 - p6Arrival;
        p6Remaining2 = p6Burst - quantum;
        
        p3Burst2 = p3Remaining1;
        p3Arrival2 = p3Complete1;
        p3Start2 = p6Complete2; 
        p3Complete2 = p3Start2 + p3Burst2;
        p3Waiting2 = p3Start2 - p3Arrival2;
        p3Remaining2 = p3Remaining1 - p3Burst2;

        p4Burst2 = p4Remaining1;
        p4Arrival2 = p4Complete1;
        p4Start2 = p3Complete2; 
        p4Complete2 = p4Start2 + p4Burst2;
        p4Waiting2 = p4Start2 - p4Arrival2;
        p4Remaining2 = p4Remaining1 - p4Burst2;

        System.out.println("-----------------------------------------------------------------------------------");        
        System.out.println("Second Cycle: ");
        System.out.println();
        System.out.println("Process\tBurst\tArrival\tStart\tComplete\tWaiting\tRemaining");
        System.out.println("P1\t" + p1Burst2 + "\t" + p1Arrival2 + "\t" + p1Start2 + "\t" + p1Complete2 + "\t\t" + p1Waiting2 + "\t" + p1Remaining2);
        System.out.println("P5\t" + p5Burst + "\t" + p5Arrival + "\t" + p5Start2 + "\t" + p5Complete2 + "\t\t" + p5Waiting2 + "\t" + p5Remaining2);
        System.out.println("P2\t" + p2Burst2 + "\t" + p2Arrival2 + "\t" + p2Start2 + "\t" + p2Complete2 + "\t\t" + p2Waiting2 + "\t" + p2Remaining2);
        System.out.println("P6\t" + p6Burst + "\t" + p6Arrival + "\t" + p6Start2 + "\t" + p6Complete2 + "\t\t" + p6Waiting2 + "\t" + p6Remaining2);
        System.out.println("P3\t" + p3Burst2 + "\t" + p3Arrival2 + "\t" + p3Start2 + "\t" + p3Complete2 + "\t\t" + p3Waiting2 + "\t" + p3Remaining2);
        System.out.println("P4\t" + p4Burst2 + "\t" + p4Arrival2 + "\t" + p4Start2 + "\t" + p4Complete2 + "\t\t" + p4Waiting2 + "\t" + p4Remaining2);

        // Third Cycle
        System.out.println();

        p5Burst3 = p5Remaining2;
        p5Arrival3 = p5Complete2;
        p5Start3 = p4Complete2; 
        p5Complete3 = p5Start3 + p5Burst3;
        p5Waiting3 = p5Start3 - p5Arrival3;
        p5Remaining3 = p5Remaining2 - p5Burst3;

        p6Burst3 = p6Remaining2;
        p6Arrival3 = p6Complete2;
        p6Start3 = p5Complete3; 
        p6Complete3 = p6Start3 + p6Burst3;
        p6Waiting3 = p6Start3 - p6Arrival3;
        p6Remaining3 = p6Remaining2 - p6Burst3;

        System.out.println("-----------------------------------------------------------------------------------");
        System.out.println("Third Cycle: ");
        System.out.println();
        System.out.println("Process\tBurst\tArrival\tStart\tComplete\tWaiting\tRemaining");
        System.out.println("P5\t" + p5Burst3 + "\t" + p5Arrival3 + "\t" + p5Start3 + "\t" + p5Complete3 + "\t\t" + p5Waiting3 + "\t" + p5Remaining3);
        System.out.println("P6\t" + p6Burst3 + "\t" + p6Arrival3 + "\t" + p6Start3 + "\t" + p6Complete3 + "\t\t" + p6Waiting3 + "\t" + p6Remaining3);

        System.out.println();
        averageWaiting = (p1Waiting1 + p2Waiting1 + p3Waiting1 + p4Waiting1 + p1Waiting2 + p5Waiting2 + p2Waiting2 + p6Waiting2 + p3Waiting2 + p4Waiting2 + p5Waiting3 + p6Waiting3) / 6;
        System.out.println("Average waiting time: " + averageWaiting);
    }
}
