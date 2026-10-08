package cocoa.ruby.item;

import cocoa.ruby.RubyMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.references.BlockItemId;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class RubyBlockItemIDs {
    private static BlockItemId create(String name) {
        Identifier id = RubyMod.id(name);
        return BlockItemId.create(id, id);
    }

    public static final ResourceKey<Block> RUBY_ORE = create("ruby_ore");
}
