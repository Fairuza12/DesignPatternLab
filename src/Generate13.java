import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public interface Generate13 {
	String[] SentenceGenerator();
}

class Randomly implements Generate13{
	public String[] vocabulary1 = new String[20];
	int n;
	int index;
	@Override
	public String[] SentenceGenerator() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		for(int i=0;i<n;i++)
		{
			vocabulary1[i] = scanner.nextLine();
			vocabulary1[i].toLowerCase();
		}
		Random random = new Random();
		index = random.nextInt(vocabulary1.length);
		System.out.println(vocabulary1[index].toLowerCase());
		return vocabulary1;
	}
}

class Sortedly implements Generate13{
	public String[] vocabulary2 = new String[20];
	int n;
	@Override
	public String[] SentenceGenerator() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		for(int k=0;k<n;k++)
		{
			vocabulary2[k] = scanner.nextLine();
			vocabulary2[k].toLowerCase();
		}
		for(int i=0;i<vocabulary2.length;i++) {
			for(int j=i+1;j<vocabulary2.length;j++) {
				if(vocabulary2[i].toLowerCase().compareTo(vocabulary2[j].toLowerCase())>0) {
					String tempString = vocabulary2[i];
					vocabulary2[i] = vocabulary2[j];
					vocabulary2[j] = tempString;
				}
			}
		}
		//System.out.println(vocabulary2);
		return vocabulary2;
	}
	
}

class Orderedly implements Generate13{
	public String[] vocabulary3 = new String[20];
	int n;
	@Override
	public String[] SentenceGenerator() {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		for(int j=0;j<n;j++)
		{
			vocabulary3[j] = scanner.nextLine();
			vocabulary3[j].toUpperCase();
		}
		for (int i = 0; i < vocabulary3.length; i++) {
			System.out.println(vocabulary3[i]);
		}
		//System.out.println(vocabulary3);
		return vocabulary3;
	}
	
}
