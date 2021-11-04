package agorasim20.apples.mod.items;

import javax.annotation.Nullable;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;

public class NuggetsItem extends Item {
    public NuggetsItem(Properties props) {
        super(props);
    }   
    
    @Override
    public int getBurnTime(ItemStack stack, @Nullable RecipeType<?> recipeType){
        return 70;
    }
}
