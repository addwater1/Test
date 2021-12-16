package practice2021_11_12;
public class StopWatch {
	private long startTime;
	private long endTime;
	void start() {
		startTime = System.currentTimeMillis();
	}
	void end() {
		endTime = System.currentTimeMillis();
	}
	double getElapsedTime() {
		return endTime-startTime;
	}
}
