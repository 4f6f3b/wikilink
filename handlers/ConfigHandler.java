package wikilink.handlers;

import java.io.File;

import wikilink.WikiLinkReference;
import net.minecraftforge.common.Configuration;

public class ConfigHandler 
{
	public static String defaultWikiUrl;
	public static int defaultWikiArray;
	
	public static void init(File file)
	{ Configuration config = new Configuration(file);
		

		config.load();
		//
		
		// Personal Reminder 		 Cat: WikiOptions, DefaultWiki=www.minecraftwiki.net		
		// This is the new array to get the default wiki option. 
		// 0 = minecraftwiki.net, 1 = wiki.feed-the-beast.com, 2 = wiki.technicpack.net
		defaultWikiUrl = config.get("WikiOptions", "DefaultWiki", "www.minecraftwiki.net").getString();
		
		//
		config.save();
		
	}
	
	// This is a temp place for this checker
/*	public static void defaultWikiChecker()
	{
		if("0".equals(defaultWikiArray))
		{
			defaultWikiUrl = "minecraftwiki.net";
		}
		else if (1 == (defaultWikiArray))
		{
			defaultWikiUrl = "wiki.feed-the-beast.com";
		}
		else if (2 == (defaultWikiArray))
		{
			defaultWikiUrl = "wiki.technicpack.net";
		}
	}*/
	
	
}
