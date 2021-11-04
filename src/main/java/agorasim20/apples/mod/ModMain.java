package agorasim20.apples.mod;

import agorasim20.apples.mod.items.ItemsRegistry;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

@Mod("apples")
public class ModMain
{
    public static final CreativeModeTab CREATIVE_TAB = new CreativeModeTab(-1, "general") {
        @OnlyIn(Dist.CLIENT)
        public ItemStack makeIcon() {
          return new ItemStack(Items.CARROT);
        }
    }; 
   
    public ModMain() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        MinecraftForge.EVENT_BUS.register(this);
        ItemsRegistry.ITEMS_R.register(bus);       
    }
}