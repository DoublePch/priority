package pcb_nonpreemptive;

public class PCB {

	private int indexPS = 0;
	private String status[] = { "New", "Ready", "Running", "Waiting", "Terminated" };
	private int processID, avgwaTime, arrivalTime, burstTime, turnAroundtime, wating_Time, cpuTime, ioTime, priority;

	public PCB() {

	}

	public PCB(int processID, int indexPS, int priority, int arrivalTime, int burstTime, int wating_Time) {

		this.processID = processID;
		this.indexPS = indexPS;
		this.priority = priority;
		this.arrivalTime = arrivalTime;
		this.burstTime = burstTime;
		this.wating_Time = wating_Time;
		this.ioTime = ioTime;
	}

	public int getProcessID() {
		return processID;
	}

	public void setProcessID(int processID) {
		this.processID = processID;
	}

	public int getCpuTime() {
		return cpuTime;
	}

	public void setCpuTime(int cpuTime) {
		this.cpuTime = cpuTime;
	}

	public String getStatus() {
		return status[indexPS];
	}

	public void setStatus(int indexPS) {
		this.indexPS = indexPS;
	}

	public int getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(int arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public int getBurstTime() {
		return burstTime;
	}

	public void setBurstTime(int burstTime) {
		this.burstTime = burstTime;
	}

	public int getWating_Time() {
		return wating_Time;
	}

	public void setWating_Time(int wating_Time) {
		this.wating_Time = wating_Time;
	}

	public int getIoTime() {
		return ioTime;
	}

	public void setIoTime(int ioTime) {
		this.ioTime = ioTime;
	}

	public int getAvgwaTime() {
		return avgwaTime;
	}

	public void setAvgwaTime(int avgwaTime) {
		this.avgwaTime = avgwaTime;
	}

	public int getPriority() {
		return priority;
	}

	public void setPriority(int priority) {
		this.priority = priority;
	}

}
