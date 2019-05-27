import java.time.*;

class CD {
	static void timer(int sec) {
		LocalTime finish = LocalTime.now().plusSeconds(sec);
		while (LocalTime.now().isBefore(finish)) {};
	}
		
	public static void main(String[] args) {
		int sec = Integer.parseInt(args[0]);
		
		System.out.println("Timer starts");
		timer(sec);
		System.out.println("Time is up");
	}
}