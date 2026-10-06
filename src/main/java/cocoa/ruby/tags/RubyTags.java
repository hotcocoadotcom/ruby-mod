package cocoa.ruby.tags;

import cocoa.ruby.RubyMod;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class RubyTags {
    public static class Blocks {
        public static final TagKey<Block> INCORRECT_FOR_RUBY_TOOL = TagKey.create(Registries.BLOCK, RubyMod.id("incorrect_for_ruby_tool"));

    }

    public static class Items {
        public static final TagKey<Item> REPAIRS_RUBY_TOOLS = TagKey.create(BuiltInRegistries.ITEM.key(), RubyMod.id("repairs_ruby_tools"));
    }
}
