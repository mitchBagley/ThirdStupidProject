package third.controller;

public class Controller
{
	public void start()
	{ 
		System.out.println("Put some text");
		int carsInWait = 36;
				int iWantCars = carsInWait - 32;
				String possibleCars = "How many cars can I have?\n" + iWantCars;
				System.out.println(possibleCars);
				System.out.print(carsInWait);
	}
}
