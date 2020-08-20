package com.epic312.slabfish_block;

import com.teamabnormals.abnormals_core.core.utils.TradeUtils;
import net.minecraftforge.event.village.WandererTradesEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = SlabfishBlock.MODID)
public class SlabfishBlockTrades {

    @SubscribeEvent
    public static void onWandererTradesEvent(WandererTradesEvent event) {
        event.getRareTrades().add(new TradeUtils.ItemsForEmeraldsTrade(SlabfishBlockBlocks.SLABFISH_BLOCK.get(), 8, 1, 12, 1));
    }
}
