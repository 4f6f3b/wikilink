package wikilink.api;

public interface Plugin
{
    /**
     * Called during Mod's FMLInitializationEvent
     * 
     * @since 1.0
     * 
     */
    public void doInit();

    /**
     * Determines whether the plugin should be invoked (i.e. Allows the plugin to determine its
     * preconditions for invocation.)<br />
     * A plugin's availability is checked before each call to preInit(), doInit, and postInit()
     * 
     * @return Boolean indicating whether the plugin is currently active.
     * @since 1.0
     * 
     */
    public boolean isAvailable();

    /**
     * Called during Mod's FMLPostInitializationEvent
     * 
     * @since 1.0
     * 
     */
    public void postInit();

    /**
     * Called during Mod's FMLPreInitializationEvent
     * 
     * @param config
     *            ConfigurationHandler providing access to Mod config file
     * @since 1.0
     * 
     */
    public void preInit();
}

