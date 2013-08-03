package wikilink.handlers;

import java.io.File;

import wikilink.WikiLinkReference;
import net.minecraftforge.common.Configuration;

public class ConfigHandler 
{
	public static String defaultWikiUrl;
	
	public static void init(File file)
	{ Configuration config = new Configuration(file);
		

		config.load();
		//
		
		// Personal Reminder 		 Cat: WikiOptions, DefaultWiki=www.minecraftwiki.net
		defaultWikiUrl = config.get("WikiOptions", "DefaultWiki", "www.minecraftwiki.net").getString();
		
		//
		config.save();
		
	}
	
	
}
