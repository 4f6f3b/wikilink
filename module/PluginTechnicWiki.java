package wikilink.module;

import wikilink.api.Plugin;

public class PluginTechnicWiki implements Plugin
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
		return "tpw";
	}

	@Override
	public String getWikiName() {
		// TODO Auto-generated method stub
		return "Technic Pack Wiki";
	}

	@Override
	public String getWikiDomain() {
		// TODO Auto-generated method stub
		return "wiki.technicpack.net";
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
