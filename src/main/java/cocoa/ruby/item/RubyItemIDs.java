package cocoa.ruby.item;

import cocoa.ruby.RubyMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;

public class RubyItemIDs {
    public static ResourceKey<Item> create(String name){
        return ResourceKey.create(Registries.ITEM, RubyMod.id(name));
    }

    public static final ResourceKey<Item> RUBY = create("ruby");
    public static final ResourceKey<Item> UNCUT_RUBY = create("uncut_ruby");
    public static final ResourceKey<Item> RUBY_PICKAXE = create("ruby_pickaxe");
    public static final ResourceKey<Item> RUBY_SWORD = create("ruby_sword");
}
