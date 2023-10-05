package com.hidehotairballoons;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class HideHotAirBalloonsPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(HideHotAirBalloonsPlugin.class);
		RuneLite.main(args);
	}
}