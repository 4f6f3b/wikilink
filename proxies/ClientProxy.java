package wikilink.proxies;

import java.io.File;

import net.minecraft.client.Minecraft;

public class ClientProxy extends CommonProxy
{
	public File getModRoot()
	{
	         return Minecraft.getMinecraft().mcDataDir;
	}	
}
