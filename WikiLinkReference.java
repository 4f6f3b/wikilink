package wikilink;

import wikilink.handlers.ConfigHandler;

/** WikiLinkReference is the reference file for all major variables
 * 
 * 
 * @author Tyler
 */

public class WikiLinkReference 
{
	//@Mod
	public static final String MOD_ID = "WikiLink";
	public static final String MOD_NAME = "WikiLink";
	public static final String MOD_VERSION = "Alpha Build 010";
	
	//@NetworkMod
	public static final String MOD_CHANNEL = "wikiLink";
	
	/** These are the main variables that the mod works with.
	 * 
	 */
	
	public static String[] inputArray;
	
	// outputString and browserHyperlink are pretty much equal.
	public static String outputString;
	public static String browserHyperlink;
	
	/** These are the hyperlink strings for the different 
	 *  wiki softwares available to use.
	 *  
	 *  The StringBuilder uses these.
	 * 
	 */
	
	public static String stringDokuWikiQueryAddress = "/wiki.new/doku.php?do=search&id=";
	
	public static String stringMediaWikiQueryAddress = "/index.php?title=Special%3ASearch&search=";
	
	// Wikia is wierd and has three parts to their search queries
	public static String stringWikiaWikiQueryPartOne = "/wiki/Special:Search?ns0=1&ns14=1&search=";
	public static String stringWikiaWikiQueryPartTwo = "&fulltext=";
	public static String stringWikiaWikiQueryPartThree = "&ns0=1&ns14=1&advanced=&ab=37%2C46";
}