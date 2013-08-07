package wikilink.handlers;

import java.util.ArrayList;

import cpw.mods.fml.common.Loader;
import net.minecraft.entity.player.EntityPlayer;
import wikilink.api.Plugin;
import wikilink.WikiLink;
import wikilink.WikiLinkReference;

/** StringHandler is the file that changes InputArray[] into a hyperlink
 *  
 *  The programming for these methods is not complete. I need to make 
 *  conditional operations to determine what type of wiki to use and 
 *  what type of string to build. These are only temporary methods 
 *  for testing purposes. :)
 *
 * @author Tyler
 * @version 1.0
 * 
 * @since 1.6.2-1.0
 */

public class StringHandler 
{
	
	public static ArrayList keyList = new ArrayList();
	public static ArrayList nameList = new ArrayList();
	public static ArrayList domainList = new ArrayList();
	public static ArrayList softwareList = new ArrayList();
	
	
	/** keyParser will compare all keys within the modWikiKeyArray with inputArray[0]
	 *  if one of keys in modWikiKeyArray is = to inputArray[0] it will do some code.
	 * 
	 * 
	 * @author DrEinsteinium
	 */
	@SuppressWarnings({ "unused" })
	public static void wikiInit(ArrayList keyList, ArrayList nameList, ArrayList domainList, ArrayList softwareList, String[] inputArray, EntityPlayer player)
	{
		if(WikiLink.wikiDebugMode == (true))
		{
			System.out.println("These are the current lists:");
			System.out.println("Key List: " + keyList);
			System.out.println("Name List: " + nameList);
			System.out.println("Domain List: " + domainList);
			System.out.println("Software List: " + softwareList);
			System.out.println("Mod List: "+ Loader.instance().getIndexedModList());
		}
		// KEY PARSER
		if(keyList.contains(inputArray[0]))
		{
			int x = keyList.indexOf(inputArray[0]);
			
			StringBuilder hyperlinkBuilder = new StringBuilder();
			for(int y = 1; y < inputArray.length; y++)
			{
				hyperlinkBuilder.append(inputArray[y] + " ");	
			}
				if((softwareList.get(x)).equals("MEDIAWIKI"))
				{
					String hyperlink = "http://" + domainList.get(x) + "/index.php?search=" + hyperlinkBuilder.toString();
					
					System.out.println("Searching for " + hyperlinkBuilder.toString() + "on the " + nameList.get(x));
					player.addChatMessage("Searching for " + hyperlinkBuilder.toString() + "on the " + nameList.get(x));
					
					
					  BrowserHandler.browserInit(hyperlink.replace(" ", "+"), player);
					  System.out.println("Opening " + hyperlink.replace(" ", "+"));
					  
				}
				else if((softwareList.get(x)).equals("WIKIA"))
				{
					String hyperlink = "http://" + domainList.get(x) + "/index.php?search=" + hyperlinkBuilder.toString();
					
					System.out.println("Searching for " + hyperlinkBuilder.toString() + "on the " + nameList.get(x));
					player.addChatMessage("Searching for " + hyperlinkBuilder.toString() + "on the " + nameList.get(x));
					
					  BrowserHandler.browserInit(hyperlink.replace(" ", "+"), player);
					  System.out.println("Opening " + hyperlink.replace(" ", "+"));
					 
				}
				else if((softwareList.get(x)).equals("DOKUWIKI"))
				{
					String hyperlink = "http://" + domainList.get(x) + "/wiki.new/doku.php?do=search&id=" + hyperlinkBuilder.toString();
					
					System.out.println("Searching for " + hyperlinkBuilder.toString() + "on the " + nameList.get(x));
					player.addChatMessage("Searching for " + hyperlinkBuilder.toString() + "on the " + nameList.get(x));
					
					  BrowserHandler.browserInit(hyperlink.replace(" ", "+"), player);
					  System.out.println("Opening " + hyperlink.replace(" ", "+"));
					  
				}
				else if((softwareList.get(x)).equals("WIKISPACES"))
				{
					String hyperlink = "http://" + domainList.get(x) + "/search/view/" + hyperlinkBuilder.toString();
					
					System.out.println("Searching for " + hyperlinkBuilder.toString() + "on the " + nameList.get(x));
					player.addChatMessage("Searching for " + hyperlinkBuilder.toString() + "on the " + nameList.get(x));
					
					  BrowserHandler.browserInit(hyperlink.replace(" ", "+"), player);
					  System.out.println("Opening " + hyperlink.replace(" ", "+"));
					  
				}
				else if((softwareList.get(x)).equals("PHPWIKI"))
				{
					String hyperlink = "http://" + domainList.get(x) + "/?do=search&id=" + hyperlinkBuilder.toString();
					
					System.out.println("Searching for " + hyperlinkBuilder.toString() + "on the " + nameList.get(x));
					player.addChatMessage("Searching for " + hyperlinkBuilder.toString() + "on the " + nameList.get(x));
					
					  BrowserHandler.browserInit(hyperlink.replace(" ", "+"), player);
					  System.out.println("Opening " + hyperlink.replace(" ", "+"));
					  
				}
				else // assume CUSTOM, not implemented yet
				{
					System.out.println("An error has occurred in the wiki initialization method. Contact author.");
					player.addChatMessage("An error has occurred in the wiki initialization method. Contact author.");
						
				}	
			
		}
		else if(inputArray[0].equals("keys"))
		{
			player.addChatMessage(keyList.toString());
		}
		else if(inputArray[0].equals("help"))
		{
			player.addChatMessage("Using WikiLink is as easy as pie. Just follow these instructions:");
			player.addChatMessage("1. Find the name of item you would like to search for.");
			player.addChatMessage("2. Use the command /wiki keys for a list of wikis.");
			player.addChatMessage("3. Then use /wiki <key> <item name>");
			player.addChatMessage("4. Final Example: /wiki mcw pumpkin pie");
		}
		else
		{
			StringBuilder hyperlinkBuilder = new StringBuilder();
			for(int y = 0; y < inputArray.length; y++)
			{
				hyperlinkBuilder.append(inputArray[y] + " ");	
			}
			
			String hyperlink = "http://" + domainList.get(0) + "/index.php?search=" + hyperlinkBuilder.toString();
			
			System.out.println("Searching for " + hyperlinkBuilder.toString() + "on the " + nameList.get(0));
			player.addChatMessage("Searching for " + hyperlinkBuilder.toString() + "on the " + nameList.get(0));
			
			
			  BrowserHandler.browserInit(hyperlink.replace(" ", "+"), player);
			  System.out.println("Opening " + hyperlink.replace(" ", "+"));
		}
		
			
	}
}




