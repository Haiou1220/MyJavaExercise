package clock;

public class Display {
	
	private int value = 0;
	private int limit = 0;
	
	public Display(int limit) {
		this.limit = limit;
	}
	
	public void increase() {
		this.value++;
		if(this.value==this.limit) {
			this.value = 0;
		}
	}
	
	public int getValue() {
		return this.value;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display d = new Display(24);
		
		for(;;) {
			d.increase();
			System.out.println(d.getValue());
		}
		
			
	}

}


