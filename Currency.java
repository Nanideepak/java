import java.util.Scanner;
public class Currency 
{
double inr,usd,euro,yen;
Scanner nan = new Scanner(System.in);
public void dollartorupee()
{
	System.out.println("enter the dollars to convert into rupees:");
	usd=nan.nextDouble();
	inr =usd*67;
	System.out.println("Dollar="+usd+"equal to inr ="+inr);
}
public void rupeetodollar()
{
	System.out.println("enter the rupee to convert into dollars:");
	inr=nan.nextDouble();
	usd=inr/67;
	System.out.println("rupee="+inr+"equal to dollars= "+usd);
}
public void eurotorupee()
{
	System.out.println("enter euro to convert into rupees");
	euro=nan.nextDouble();
	inr=euro*79.50;
	System.out.println("euro="+euro+"equal to INR="+inr);

}
public void rupeetoeuro()
{
	System.out.println("enter the ruppee to convert into euro:");
	inr=nan.nextDouble();
	euro=(inr/79.50);
	System.out.println("rupee="+inr+"equal to euro="+euro);
}
public void yentorupee()
{
	System.out.println("enter yen to convert into rupees:");
	yen=nan.nextDouble();
	inr=yen*0.61;
	System.out.println("YEN="+yen+"equal to inr="+inr);
}
public void rupeetoyen()
{
	System.out.println("enter rupees to convert into yen:");
	inr=nan.nextDouble();
	yen=(inr/0.61);
	System.out.println("INR="+inr+"equal to YEN "+yen);


}
}
