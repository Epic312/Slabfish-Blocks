package com.evoslab.slabfishblocks.core.other;

import com.evoslab.slabfishblocks.core.SlabfishBlocks;
import com.evoslab.slabfishblocks.core.registry.SBBlocks;
import com.minecraftabnormals.abnormals_core.core.util.TradeUtil;

import net.minecraftforge.event.village.WandererTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = SlabfishBlocks.MODID)
public class SBTrades {

    @SubscribeEvent
    public static void onWandererTradesEvent(WandererTradesEvent event) {
    	TradeUtil.addWandererTrades(event, new TradeUtil.AbnormalsTrade(SBBlocks.SLABFISH_BLOCK.get().asItem(), 8, 1, 12, 1));
    }
}
