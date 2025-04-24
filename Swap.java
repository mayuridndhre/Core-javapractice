//WAP to swap the two number

class Swap
{
public static void main(String args[])
{
int var_1=50;
int var_2=100;
int temp_var;
System.out.println("Before swapping the value of var1 is :"+var_1 +" and var2 is :"+var_2);

temp_var=var_1;
System.out.println(var_1);
var_1=var_2;
var_2=temp_var;

System.out.println("After swapping the value of var1 is :"+var_1 +" and var2 is :" +var_2);

}
}