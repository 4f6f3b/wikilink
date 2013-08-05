package wikilink.api;

public class PluginFeedTheBeastWiki implements Plugin
{

	@Override
	public boolean isAvailable() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String getModID() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getWikiKey() {
		// TODO Auto-generated method stub
		return "ftb";
	}

	@Override
	public String getWikiName() {
		// TODO Auto-generated method stub
		return "Feed the Beast Wiki";
	}

	@Override
	public String getWikiDomain() {
		// TODO Auto-generated method stub
		return "wiki.feed-the-beast.com";
	}

	@Override
	public String getWikiSoftware() {
		// TODO Auto-generated method stub
		return "MEDIAWIKI";
	}

	@Override
	public String getCustomWikiSearchFormat() {
		// TODO Auto-generated method stub
		return null;
	}

}
