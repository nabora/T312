import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Data data = new Data();
		Area area = new Area();
		
	
		System.out.println("-Area of Geometry Shapes-");
		System.out.println("[1]Triangle");
		System.out.println("[2]Rectangle");
		System.out.println("[3]Parellelogram");
		System.out.println("[4]Circle");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Choice: ");
		int choice = scan.nextInt();
		
		
		if (choice == 1) {
			
			System.out.println("-Solving Area Of Triangle-");
			System.out.println("Height: ");
			data.setHeight(scan.nextDouble());
			System.out.println("Base: ");
			data.setBase(scan.nextDouble());
			
			double calculateAoT = data.getHeight()*data.getBase()/2;

			area.AoT();System.out.println(calculateAoT);}
			
			
		else if (choice == 2) {
				
				System.out.println("-Solving Area Of Rectangle-");
				System.out.println("Lenght: ");
				data.setLenght(scan.nextDouble());
				System.out.println("Width: ");
				data.setWidth(scan.nextDouble());
				
				double calculateAoR = data.getWidth()*data.getLenght();
				
				area.AoR();System.out.println(calculateAoR);}
		
		
		else if (choice == 3) {
			
		
			System.out.println("-Solving Area Of Parallelogram-");
			System.out.println("Base: ");
			data.setB(scan.nextDouble());
			System.out.println("Height: ");
			data.setH(scan.nextDouble());
			
			double calculateAoP = data.getB()*data.getH();
			
			area.AoP();System.out.println(calculateAoP);}
		
		
		else if(choice == 4) {
		
			System.out.println("-Solving Area Of Circle-");
			System.out.println("Raduis: ");
			data.setRaduis(scan.nextDouble());
			
			double calculateAoC = Math.PI*(data.getRaduis()*data.getRaduis());
			
			area.AoC();System.out.println(calculateAoC);}
		
		else {
			
			System.out.println("Choose only From 1 to 4!"); 
		}
		
		scan.close();
	}
}
