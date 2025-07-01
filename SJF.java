import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class Process {
    String id;
    int burstTime;
    int arrivalTime;
    int startTime;
    int completeTime;
    int waitingTime;

    public Process(String id, int burstTime, int arrivalTime) {
        this.id = id;
        this.burstTime = burstTime;
        this.arrivalTime = arrivalTime;
    }
}

public class SJF {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Process> processes = new ArrayList<>();

        // Input burst times and arrival times
        for (int i = 1; i <= 6; i++) {
            System.out.println("Enter burst time for process P" + i + ": ");
            int burstTime = sc.nextInt();
            System.out.println("Enter arrival time for process P" + i + ": ");
            int arrivalTime = sc.nextInt();
            processes.add(new Process("P" + i, burstTime, arrivalTime));
        }

        processes.sort(Comparator.comparingInt(p -> p.arrivalTime));

        int currentTime = 0;
        List<Process> waitingQueue = new ArrayList<>();
        List<Process> completedProcesses = new ArrayList<>();

        System.out.println("Short Job First (SJF)");
        System.out.println();
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s%n", "Time", "Process", "Burst", "Arrival", "Start", "Complete", "Waiting");

        while (!processes.isEmpty() || !waitingQueue.isEmpty()) {
            for (Process p : processes) {
                if (p.arrivalTime <= currentTime && !waitingQueue.contains(p)) {
                    waitingQueue.add(p);
                }
            }
            processes.removeAll(waitingQueue);

            if (waitingQueue.isEmpty()) {
                currentTime++;
                continue;
            }

            waitingQueue.sort(Comparator.comparingInt(p -> p.burstTime));
            Process currentProcess = waitingQueue.remove(0);

            currentProcess.startTime = currentTime;
            currentProcess.completeTime = currentTime + currentProcess.burstTime;
            currentProcess.waitingTime = currentProcess.startTime - currentProcess.arrivalTime;

            System.out.printf("%-10d %-10s %-10d %-10d %-10d %-10d %-10d%n", currentTime, currentProcess.id, currentProcess.burstTime, currentProcess.arrivalTime, currentProcess.startTime, currentProcess.completeTime, currentProcess.waitingTime);

            currentTime = currentProcess.completeTime;
            completedProcesses.add(currentProcess);
        }

        double totalWaitingTime = 0;

        for (Process p : completedProcesses) {
            totalWaitingTime += p.waitingTime;
        }

        double averageWaitingTime = totalWaitingTime / completedProcesses.size();
        System.out.println();
        System.out.printf("Average waiting time = %.1f%n", averageWaitingTime);

        sc.close();
    }
}
