package OOP2;

public class SeleniumLib {

public void launchBrowser(String browserName)
{
	System.out.println("launch the browser");
	
	interactWithBrowser(browserName);
}

private void interactWithBrowser(String browserName)
{
	if(browserName.equals("chrome"))
	{
		System.out.println("launch chrome");
		launchChrome();
	}

	
	else if(browserName.equals("ff"))
	{
		System.out.println("launch ff");
		launchFF();
	}
	else if(browserName.equals("Safari"))
	{
		System.out.println("launch Safari");
		launchSafari();
	}
	
	else
	{
		System.out.println("launch chrome");
	}
	
	
	
}

private void launchChrome()
{
	System.out.println("google chrome is launched");
}

private void launchFF()
{
	System.out.println("FF is launched");
}

private void launchSafari()
{
	System.out.println("Safari is launched");
}


}
