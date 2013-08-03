package wikilink.handlers;

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
	/** defaultHyperlinkBuilder is for the defaultWiki
	 *  This builds the hyperlink for any wiki that is not default.
	 *  
	 *  The method before this(not created) reads inputArray[0]
	 *  and makes sure there isn't a key such as "ftb" or "ic2"
	 *  
	 *  If there is a key in the array, the string builder will
	 *  build the String out of the array but skips arrayInput[0]
	 */
	public static void hyperlinkBuilder(String[] inputArray)
	{
		StringBuilder hyperlinkBuilder = new StringBuilder();
		for(int i = 1; i < inputArray.length; i++)
		{
			hyperlinkBuilder.append(inputArray[i] + " ");	
		}
		
		WikiLinkReference.browserHyperlink = WikiLinkReference.defaultWikiUrl + WikiLinkReference.stringMediaWikiSearch + hyperlinkBuilder.toString();
	}

	/** defaultHyperlinkBuilder is for the defaultWiki
	 *  This only builds the hyperlink for the default option
	 *  
	 *  The StringBuilder does not skip inputArray[0] like the others
	 */
	public static void defaulHyperlinkBuilder(String[] inputArray)
	{
		StringBuilder hyperlinkBuilder = new StringBuilder();
		for(int i = 0; i < inputArray.length; i++)
		{
			hyperlinkBuilder.append(inputArray[i] + " ");	
		}
		
		WikiLinkReference.browserHyperlink = WikiLinkReference.defaultWikiUrl + WikiLinkReference.stringMediaWikiSearch + hyperlinkBuilder.toString();
	}
	
	
}
