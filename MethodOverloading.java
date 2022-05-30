package Arrays;

public class MethodOverloading {
	public void disp(char c, int num)
	   {
	       System.out.println("I’m the first definition of method disp");
	   }
	   public void disp(int num, char c)
	   {
	       System.out.println("I’m the second definition of method disp" );
	   }
}
class Test1
{
	

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
	       obj.disp('x', 51 );
	       obj.disp(52, 'y');

	}

}
