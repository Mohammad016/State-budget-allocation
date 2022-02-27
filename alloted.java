package project;
import java.util.*;
interface Allstates
{
	public void AP();
	public void TE();
	public void TN();
	public void KE();
	public void KA();
	public void MP();
}
public class alloted implements Allstates
{
	public void AP()
	{
		int ap=229779;
		System.out.println("State Budget is : "+ap);
	}
	public void TE()
	{
		int te=230826;
		System.out.println("State Budget is : "+te);
	}
	public void TN()
	{
		int tn=329035;
		System.out.println("State Budget is : "+tn);
	}
	public void KE()
	{
		int ke=214479;
		System.out.println("State Budget is : "+ke);
	}
	public void KA()
	{
		int ka=246207;
		System.out.println("State Budget is : "+ka);
	}
	public void MP()
	{
		int mp=241375;
		System.out.println("State Budget is : "+mp);
	}
}