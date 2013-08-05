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
	
	public static void init(File file)
	{ Configuration config = new Configuration(file);
		

		config.load();
		//
		
		defaultWikiKey = config.get("WikiOptions", "DefaultWikiKey", "mcw").getString();
		defaultWikiName = config.get("WikiOptions", "DefaultWikiName", "Minecraft Wiki").getString();
		defaultWikiDomain = config.get("WikiOptions", "DefaultWikiDomain", "www.minecraftwiki.net").getString();
		defaultWikiSoftware = config.get("WikiOptions", "DefaultWikiSoftware", "MEDIAWIKI").getString();

		//
		config.save();
		
	}
	
	
}
