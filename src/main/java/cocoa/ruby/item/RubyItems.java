package cocoa.ruby.item;

import cocoa.ruby.RubyMod;
import net.fabricmc.fabric.api.creativetab.v1.FabricCreativeModeTab;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import cocoa.ruby.item.RubyToolMaterial;

import java.util.function.Function;

public class RubyItems {

    public static Item register(ResourceKey<Item> itemKey, Function<Item.Properties, Item> itemFactory, Item.Properties settings){
        Item item = itemFactory.apply(settings.setId(itemKey));

        Registry.register(BuiltInRegistries.ITEM, itemKey, item);

        return item;
    }

    public static final Item RUBY = register(RubyItemIDs.RUBY, Item::new, new Item.Properties());
    public static final Item RUBY_PICKAXE = register(RubyItemIDs.RUBY_PICKAXE, Item::new, new Item.Properties().pickaxe(RubyToolMaterial.RUBY_TOOL_MATERIAL, 1.5f, -3f));
    public static final Item RUBY_SWORD = register(RubyItemIDs.RUBY_SWORD, Item::new, new Item.Properties().sword(RubyToolMaterial.RUBY_TOOL_MATERIAL, 3.0f, -2.6f));

    public static final ResourceKey<CreativeModeTab> CUSTOM_CREATIVE_TAB_KEY = ResourceKey.create(
            BuiltInRegistries.CREATIVE_MODE_TAB.key(), RubyMod.id("ruby_tab")
    );
    public static final CreativeModeTab CUSTOM_CREATIVE_TAB = FabricCreativeModeTab.builder()
            .icon(() -> new ItemStack(RUBY))
            .title(Component.translatable("rubyTab.ruby-mod"))
            .displayItems((params, output) -> {
                output.accept(RUBY);
                output.accept(RUBY_PICKAXE);
                output.accept(RUBY_SWORD);
            })
            .build();

    public static void initialize() {
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, CUSTOM_CREATIVE_TAB_KEY, CUSTOM_CREATIVE_TAB);
    }
}
