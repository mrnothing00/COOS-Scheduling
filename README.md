# COMPUTER ORGANIZATION AND OPERATING SYSTEMS (COOS) Scheduling Algorithms

This project contains Java implementations of three CPU scheduling algorithms for COOS coursework:

| Algorithm               | File             | Description                                                  |
|------------------------|------------------|--------------------------------------------------------------|
| First Come First Serve | `FCFS.java`       | Processes are scheduled in the order they arrive.            |
| Shortest Job First     | `SJF.java`        | Non-preemptive version; selects the shortest burst job.      |
| Round Robin            | `roundRobin.java` | Time-sliced scheduling with a quantum of 20 units.           |

## How to Compile and Run

```bash
javac FCFS.java
java FCFS

javac SJF.java
java SJF

javac roundRobin.java
java roundRobin
