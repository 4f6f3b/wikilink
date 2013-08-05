package wikilink.commands;

import wikilink.WikiLinkReference;
import wikilink.handlers.BrowserHandler;
import wikilink.handlers.ConfigHandler;
import wikilink.handlers.StringHandler;
import wikilink.plugin.PluginManager;
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
			
			
			StringHandler.wikiInit(StringHandler.keyList, StringHandler.nameList, StringHandler.domainList, StringHandler.softwareList, inputArray, player);
			
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
