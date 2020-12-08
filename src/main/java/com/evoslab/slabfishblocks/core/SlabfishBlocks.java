package com.evoslab.slabfishblocks.core;

import com.minecraftabnormals.abnormals_core.core.util.registry.RegistryHelper;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// The value here should match an entry in the META-INF/mods.toml file
@Mod("slabfish_block")
@Mod.EventBusSubscriber(modid = SlabfishBlocks.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class SlabfishBlocks
{
    public static final String MODID = "slabfish_block";
    public static final RegistryHelper REGISTRY_HELPER = new RegistryHelper(MODID);

    public SlabfishBlocks() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        REGISTRY_HELPER.register(eventBus);

        MinecraftForge.EVENT_BUS.register(this);
    }
}
