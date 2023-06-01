package abstraction;

public class AbstractMethodImplentation extends Validation
{
	
	
	public boolean emailValidate(String email)
	{
		
		String comWords[] = {"@gmail.com","@yahoo.com", "@mailinator.com"};
		
		if(email.endsWith(comWords[0]) || email.endsWith(comWords[1]) || email.endsWith(comWords[2]))
		{
			return true;
		}
		
		else
		{
			return false;
		}
		
	}
	
	public boolean pwdValidate(String password)
	{
		int len =password.length();
		if(len<8)
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
}
