package cocoa.ruby.item;

import cocoa.ruby.RubyMod;
import cocoa.ruby.tags.RubyTags;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ToolMaterial;
import net.minecraft.world.level.block.Block;

public class RubyToolMaterial { ;

    public static final ToolMaterial RUBY_TOOL_MATERIAL = new ToolMaterial(
            RubyTags.Blocks.INCORRECT_FOR_RUBY_TOOL, // incorrect blocks for drops
            2531, // durability
            8.0F, // speed
            3.5F, // attack damage bonus
            22, // enchantment value
            RubyTags.Items.REPAIRS_RUBY_TOOLS // repair items

    );
}
