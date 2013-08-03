package wikilink;

import net.minecraft.command.ICommandManager;
import net.minecraft.command.ServerCommandManager;
import net.minecraft.server.MinecraftServer;
import wikilink.commands.CommandWiki;
import wikilink.handlers.ConfigHandler;
import wikilink.handlers.PacketHandler;
import wikilink.proxies.CommonProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkMod;

/**
 * WikiLink Main Class
 * 
 * @author Slimedog007
 */

	@Mod(modid = WikiLinkReference.MOD_ID, name = WikiLinkReference.MOD_NAME, version = WikiLinkReference.MOD_VERSION)
	@NetworkMod(channels = {WikiLinkReference.MOD_CHANNEL}, clientSideRequired = true, serverSideRequired = false, packetHandler = PacketHandler.class)


public class WikiLink 
{

	@Instance(WikiLinkReference.MOD_ID)
	public static WikiLink instance;
	
	@SidedProxy(clientSide = "wikilink.proxies.ClientProxy", serverSide = "wikilink.proxies.CommonProxy")
	public static CommonProxy proxy;
			
	@EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{
		System.out.println("This is " + WikiLinkReference.MOD_NAME + " " + WikiLinkReference.MOD_VERSION);
		
			ConfigHandler.init(event.getSuggestedConfigurationFile());
	}
	
	@EventHandler
	public void mainInit(FMLInitializationEvent event)
	{
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event)
	{
		
	}
	
	@EventHandler
	public void serverStart(FMLServerStartingEvent event)
	{
		
		MinecraftServer server = MinecraftServer.getServer(); 	 
		ICommandManager command = server.getCommandManager();
		ServerCommandManager serverCommand = ((ServerCommandManager) command); 
		
		// Register Commands
		serverCommand.registerCommand(new CommandWiki());
		System.out.println(WikiLinkReference.MOD_NAME + " " + WikiLinkReference.MOD_VERSION + " has registered the /wiki command.");

	} 
}
