package support;

import java.time.LocalTime;

public class WorkingTime implements WorkingDayTime{
	
	private LocalTime start;
	private LocalTime end;
	
	public WorkingTime(LocalTime start, LocalTime end) {
		this.start = start;
		this.end = end;
	}
	
	public LocalTime getStart() {
		return start;
	}
	
	public LocalTime getEnd() {
		return end;
	}

}
