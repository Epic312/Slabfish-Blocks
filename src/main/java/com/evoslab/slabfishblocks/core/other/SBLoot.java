package com.evoslab.slabfishblocks.core.other;

import com.evoslab.slabfishblocks.core.SlabfishBlocks;

import net.minecraft.loot.LootEntry;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.TableLootEntry;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = SlabfishBlocks.MODID, bus = Mod.EventBusSubscriber.Bus.FORGE)
public class SBLoot {
    @SubscribeEvent
    public static void onLootTableLoad(LootTableLoadEvent event) {
        if (event.getName().equals(new ResourceLocation("minecraft","chests/end_city_treasure"))) {
            event.getTable().addPool(LootPool.builder().addEntry(TableLootEntry.builder(new ResourceLocation(SlabfishBlocks.MODID,"chests/end_city_treasure"))).build());
        }
    }
}
