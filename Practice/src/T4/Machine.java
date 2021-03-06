package T4;

public interface Machine {
	void run();
}

class Person{
	public void run(){
		System.out.println("Jenny is running");
	}
}

class Roboot extends Person{
	
	private class MachineCar implements Machine{
		
		public void run(){
			System.out.println("Roboot is running now");
			}
		}
	Machine getM(){
		return new MachineCar();
	}	
}

class TestM{
	public static void main(String[] args){
		Roboot ro = new Roboot();
		Machine m = ro.getM();
		m.run();
	}
}