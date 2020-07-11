package com.mewzok.safeplacegold;

import org.slf4j.Logger;
import org.spongepowered.api.event.Listener;
import org.spongepowered.api.event.game.state.GamePreInitializationEvent;
import org.spongepowered.api.plugin.Plugin;

import com.pixelmonmod.pixelmon.api.events.battles.BattleEndEvent;

@Plugin(id = "SafePlaceGold", name = "SafePlace Gold", version = "1.0")
public class SafePlaceGold
{
    private static Logger logger;

    @Listener
    public void preInit(GamePreInitializationEvent e)
    {
        logger.info("SafePlace Gold successfully started.");
    }

    @Listener
    public void onBattleEndEvent(BattleEndEvent e)
    {
        
    }
}
