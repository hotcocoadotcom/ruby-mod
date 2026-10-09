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
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Function;

import static cocoa.ruby.item.RubyToolMaterial.RUBY_TOOL_MATERIAL;


public class RubyItems {

    public static Item register(ResourceKey<Item> itemKey, Function<Item.Properties, Item> itemFactory, Item.Properties settings){
        Item item = itemFactory.apply(settings.setId(itemKey));

        Registry.register(BuiltInRegistries.ITEM, itemKey, item);

        return item;
    }

    public static final Item RUBY = register(RubyItemIDs.RUBY, Item::new, new Item.Properties());
    public static final Item UNCUT_RUBY = register(RubyItemIDs.UNCUT_RUBY, Item::new, new Item.Properties());

    public static final Item RUBY_PICKAXE = register(RubyItemIDs.RUBY_PICKAXE, Item::new, new Item.Properties().pickaxe(RUBY_TOOL_MATERIAL, 1.5f, -2.8f));
    public static final Item RUBY_SWORD = register(RubyItemIDs.RUBY_SWORD, Item::new, new Item.Properties().sword(RUBY_TOOL_MATERIAL, 3.0f, -2.6f));
    public static final Item RUBY_AXE = register(RubyItemIDs.RUBY_AXE, Item::new, new Item.Properties().axe(RUBY_TOOL_MATERIAL, 3.5f, -3f));
    public static final Item RUBY_SHOVEL = register(RubyItemIDs.RUBY_SHOVEL, Item::new, new Item.Properties().shovel(RUBY_TOOL_MATERIAL, 1.5f, -3f));
    public static final Item RUBY_HOE = register(RubyItemIDs.RUBY_HOE, Item::new, new Item.Properties().hoe(RUBY_TOOL_MATERIAL, 1.5f, -1f));

    public static final Item RUBY_HELMET = register(
            RubyItemIDs.RUBY_HELMET,
            Item::new,
            new Item.Properties().humanoidArmor(RubyArmorMaterial.INSTANCE, ArmorType.HELMET)
                    .durability(ArmorType.HELMET.getDurability(RubyArmorMaterial.BASE_DURABILITY))
    );

    public static final Item RUBY_CHESTPLATE = register(
            RubyItemIDs.RUBY_CHESTPLATE,
            Item::new,
            new Item.Properties().humanoidArmor(RubyArmorMaterial.INSTANCE, ArmorType.CHESTPLATE)
                    .durability(ArmorType.CHESTPLATE.getDurability(RubyArmorMaterial.BASE_DURABILITY))
    );

    public static final Item RUBY_LEGGINGS = register(
            RubyItemIDs.RUBY_LEGGINGS,
            Item::new,
            new Item.Properties().humanoidArmor(RubyArmorMaterial.INSTANCE, ArmorType.LEGGINGS)
                    .durability(ArmorType.LEGGINGS.getDurability(RubyArmorMaterial.BASE_DURABILITY))
    );

    public static final Item RUBY_BOOTS = register(
            RubyItemIDs.RUBY_BOOTS,
            Item::new,
            new Item.Properties().humanoidArmor(RubyArmorMaterial.INSTANCE, ArmorType.BOOTS)
                    .durability(ArmorType.BOOTS.getDurability(RubyArmorMaterial.BASE_DURABILITY))
    );

    public static final ResourceKey<CreativeModeTab> CUSTOM_CREATIVE_TAB_KEY = ResourceKey.create(
            BuiltInRegistries.CREATIVE_MODE_TAB.key(), RubyMod.id("ruby_tab")
    );
    public static final CreativeModeTab CUSTOM_CREATIVE_TAB = FabricCreativeModeTab.builder()
            .icon(() -> new ItemStack(RUBY))
            .title(Component.translatable("rubyTab.ruby-mod"))
            .displayItems((params, output) -> {
                output.accept(RUBY);
                output.accept(UNCUT_RUBY);
                output.accept(RubyBlocks.RUBY_ORE);
                output.accept(RUBY_PICKAXE);
                output.accept(RUBY_SWORD);
                output.accept(RUBY_AXE);
                output.accept(RUBY_SHOVEL);
                output.accept(RUBY_HOE);
                output.accept(RUBY_HELMET);
                output.accept(RUBY_CHESTPLATE);
                output.accept(RUBY_LEGGINGS);
                output.accept(RUBY_BOOTS);
            })
            .build();

    public static void initialize() {
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, CUSTOM_CREATIVE_TAB_KEY, CUSTOM_CREATIVE_TAB);
    }
}
