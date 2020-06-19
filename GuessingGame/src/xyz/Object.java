package xyz;
import java.util.Scanner;

public class Object {
	Scanner rand = new Scanner(System.in);
	Scanner scan = new Scanner(System.in);	
	
	public String _contacts(String contact, String tel) {
		return String.format("%s\nNumber:%s ", contact, tel);
	}
	
	public void loop() {
		String tryAgain = null, play;
		int i=0;
		System.out.println("Do you want to play?..");
		play = rand.nextLine();
		
		if(play.equals("yes")) {
			tryAgain = "yes";
		}else
			tryAgain = null;
		
		while(tryAgain != null)
		{
			System.out.println("I'm real ya know!!");
			System.out.println(i);
			i++;
			if(i == 1000) {
				break;
			}
			
		}
			
	}
	
	public void Hey() {
		
		call1();
	}
	
	public void call1() {
			
		call2();
		}
	
	public void call2() {
		call3();
		
	}
	
	public void call3() {
		
		call4();
	}
	public void call4() {
		
		System.out.println("Ohayaou!!");
				
		}
	
	
	class Animal{
		String[] sounds = {"bleat","moo","meow","bleat","hiss","bark","sing","roar"};
		String[] habitats = {"terrestrial","aquatic"};
		
	
		private void limbs(){
			
		}
		
		private void behavour(String sound) {
			
			
		}
		
	}

	
	
	
	
	
	
	

}
