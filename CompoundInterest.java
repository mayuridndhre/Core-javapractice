class Compound_Interest
{
public static void main(String args[])
{
float Principal=20000;
float Rate=20;
int time=2;
double Amount;
double CI;

Amount=Principal*Math.pow(1+Rate/100,time);
CI=Amount-Principal;
System.out.println("Compound Interest is :"+CI);

}
}
