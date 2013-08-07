package wikilink.handlers;

import java.io.File;

import wikilink.WikiLinkReference;
import net.minecraftforge.common.Configuration;

public class ConfigHandler 
{
	public static String defaultWikiKey;
	public static String defaultWikiName;
	public static String defaultWikiDomain;
	public static String defaultWikiSoftware;
	
	public static boolean warnBeforeWikiInit;
	
	public static void init(File file)
	{ Configuration config = new Configuration(file);
		

		config.load();
		//
		config.addCustomCategoryComment("Wiki Options", " == These are the settings for the default wiki that Minecraft opens if no key is found.");	
		defaultWikiKey = config.get("Wiki Options", "DefaultWikiKey", "mcw").getString();
		defaultWikiName = config.get("Wiki Options", "DefaultWikiName", "Minecraft Wiki").getString();
		defaultWikiDomain = config.get("Wiki Options", "DefaultWikiDomain", "www.minecraftwiki.net").getString();
		defaultWikiSoftware = config.get("Wiki Options", "DefaultWikiSoftware", "MEDIAWIKI").getString();
		
		//
		config.save();
		
	}
	
	
}
