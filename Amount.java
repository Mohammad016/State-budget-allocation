import project.*;
import java.util.*;

class AP
{
	void budget()
	{
		System.out.println("AP state Budget : 29,00,000 cr");
	}
}

class Amount extends AP
{
	public Amount obj=new Amount();
	public static void main(String args[])
	{
		
		Scanner input=new Scanner(System.in);
		State s=new State();
		AP a=new AP();
		reader re=new reader();
		writter wr=new writter();
		alloted o=new alloted();
		System.out.println("Select any one Option :");
		System.out.println("1)ADMINISTRATOR\n2)CUSTOMER");
		int choice=input.nextInt();	
		if(choice==1)
			System.out.println("Welcome Administrator!!");
		else if(choice==2)
			System.out.println("Welcome Customer!!");
		System.out.println("Select any one Option :");
		s.States();
		int state=input.nextInt();
		try{switch(state)
		{
			case 1: a.budget();
					if(choice==1)
						wr.write(229779);
					else if(choice==2)
						re.meth(1234);
				break;
			case 2: o.TE();
					if(choice==1)
						wr.write(230826);
					else if(choice==2)
						re.meth(230826);
				break;
			case 3:	o.TN();
					if(choice==1)
						wr.write(329035);
					else if(choice==2)
						re.meth(329035);
				break;
			case 4: o.KE();
					if(choice==1)
						wr.write(214479);
					else if(choice==2)
						re.meth(214479);
				break;
			case 5: o.KA();
					if(choice==1)
						wr.write(246207);
					else if(choice==2)
						re.meth(246207);
				break;
			case 6: o.MP();
					if(choice==1)
						wr.write(241375);
					else if(choice==2)
						re.meth(241375);
				break;
			case 7:
				System.out.println("Finished the order...");
				break;
			default:
				System.out.println("Enter valid choice");
				break;
		}
		}
		catch(Exception e){
			System.out.println(e);
		}
	
		System.out.println("Completed");
	}
}
