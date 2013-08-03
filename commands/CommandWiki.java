package wikilink.commands;

import wikilink.WikiLinkReference;
import wikilink.handlers.BrowserHandler;
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
			
			BrowserHandler.browserInit(WikiLinkReference.browserHyperlink, player);
			
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
