public class Timer {
	private int hours;
	private int minutes;
	private int seconds;

	public Timer(){
		hours = 0;
		minutes = 0;
		seconds = 0;
	}

	public void incrementHours(){
		// Your code here.
		hours++;
		if (hours > 23){
			hours = 0;
		}
	}

	public void decrementHours(){
		// Your code here.
		hours--;
		if (hours < 0){
			hours = 23;
		}
	}

	public int getHours(){
		return hours;
	}

	public void incrementMinutes(){
		// Your code here.
		minutes++;
		if (minutes > 59){
			minutes = 0;
			this.incrementHours();
		}
	}
	public void decrementMinutes(){
		// Your code here.
		minutes--;
		if (minutes < 0){
			minutes = 59;
			this.decrementHours();
		}
	}

	public int getMinutes() {
		return minutes;
	}

	public void incrementSeconds(){
		// Your code here.
		seconds++;
		if (seconds > 59){
			seconds = 0;
			this.incrementMinutes();
		}
	}

	public void decrementSeconds(){
		// Your code here.
		seconds--;
		if (seconds < 0){
			seconds = 59;
			this.decrementMinutes();
		}
	}

	public int getSeconds(){
		return seconds;
	}

	public String toString () {
		return "Timer "+hours+":"+minutes+":"+seconds;
	}
}
