package wikilink.commands;

import wikilink.WikiLinkReference;
import wikilink.handlers.BrowserHandler;
import wikilink.handlers.ConfigHandler;
import wikilink.handlers.StringHandler;
import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;

public class CommandWiki extends CommandBase
{
	public void processCommand(ICommandSender icommandsender, String[] inputArray)
	{
		if(icommandsender instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer)icommandsender;
			
			
			// First it takes inputArray and sends it to the hyperlink builder
			StringHandler.defaulHyperlinkBuilder(inputArray);
			System.out.println(WikiLinkReference.inputArray + "StringArray Sent to the StringHandler");
			// Second it checks the default wiki settings
			//ConfigHandler.defaultWikiChecker();
			System.out.println("Default Wiki Checked");
			// third it sends the link to the browser handler
			BrowserHandler.browserInit(WikiLinkReference.browserHyperlink, player);
			System.out.println(WikiLinkReference.browserHyperlink + "String Sent to the BrowserHandler");
			
		}
	}
	
	@Override
	public String getCommandName()
	{
		return "wiki";
	}	

	@Override
	public String getCommandUsage(ICommandSender icommandsender) 
	{
		return "/wiki <wiki> <search term>";
	}
}
