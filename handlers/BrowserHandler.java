package wikilink.handlers;

import java.lang.reflect.Method;

import wikilink.WikiLinkReference;
import net.minecraft.entity.player.EntityPlayer;

/** BrowserHandler is the class that handles the opening of the default browser.
 *  It also finds what operating system you are using and makes sure it runs the correct files.
 *
 *  All methods that open a wiki end here. *NEI -> Here, Command -> Here
 *
 *	All methods that use the browser handler need to input "browserHyperlink" as the go-to URL
 *
 * @author Tyler
 */

public class BrowserHandler 
{
	// I'm not sure if this is supposed to be static or not
	static String osName = System.getProperty("os.name");
	
	public static void browserInit(String browserHyperlink, EntityPlayer player)
	{
		try
		{
			if(osName.startsWith("Windows"))
			{
				Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler " + WikiLinkReference.browserHyperlink);
				System.out.println("Website Opened");
			}
			else if(osName.startsWith("Mac OS"))
			{
				 Class fileMgr = Class.forName("com.apple.eio.FileManager");
	             Method openURL = fileMgr.getDeclaredMethod("openURL", new Class[] {String.class});
	             openURL.invoke(null, new Object[] {WikiLinkReference.browserHyperlink});
			}
			else
			{//assume Unix or Linux
	            String[] browsers = { "firefox", "opera", "konqueror", "epiphany", "mozilla", "netscape" };
	            String browser = null;
	            for (int count = 0; count < browsers.length && browser == null; count++) 
	            {
	                if (Runtime.getRuntime().exec(new String[] {"which", browsers[count]}).waitFor() == 0) 
	                {
	                    browser = browsers[count];
	                }
	            }
	            if (browser == null) {
	                throw new Exception();
	            } else {
	                Runtime.getRuntime().exec(new String[] {browser, WikiLinkReference.browserHyperlink});
	            }
			}
		} catch (Exception e) {
            player.addChatMessage("Could not find web browser. :(");
        }
    }
}

		
	
	

