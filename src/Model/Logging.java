package Model;

public class Logging 
{
	
	public void debug(String tag, String text)
	{
		System.out.println ( tag + ":" + text);
	}
	
	public void error(String tag, String text)
	{
		System.out.println ( tag + ":" + text);
	}
	
	public void exception(String tag, String text)
	{
		System.out.println ( tag + ":" + text);
	}
	
	public void warning(String tag, String text)
	{
		System.out.println ( tag + ":" + text);
	}
	
	public void message(String tag, String text)
	{
		System.out.println ( tag + ":" + text);
	}
	
}
