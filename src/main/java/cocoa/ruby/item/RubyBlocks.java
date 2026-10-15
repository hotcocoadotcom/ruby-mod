package cocoa.ruby.item;

import cocoa.ruby.RubyMod;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.references.BlockItemId;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Function;

public class RubyBlocks {
        private static Block register(String name, Function <BlockBehaviour.Properties, Block> function) {
            Block toRegister = function.apply(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, Identifier.fromNamespaceAndPath(RubyMod.MOD_ID, name))));
            registerBlockItem(name, toRegister);
            return Registry.register(BuiltInRegistries.BLOCK, Identifier.fromNamespaceAndPath(RubyMod.MOD_ID, name), toRegister);
        }

        private static void registerBlockItem(String name, Block block) {
            Registry.register(BuiltInRegistries.ITEM, Identifier.fromNamespaceAndPath(RubyMod.MOD_ID, name),
                    new BlockItem(block, new Item.Properties().useBlockDescriptionPrefix().setId(ResourceKey.create(Registries.ITEM, Identifier.fromNamespaceAndPath(RubyMod.MOD_ID, name)))));
        }

        public static final Block RUBY_ORE = register(
            "ruby_ore",
                properties -> new Block(properties.strength(2f).requiresCorrectToolForDrops().sound(SoundType.STONE))
        );

        public static final Block DEEPSLATE_RUBY_ORE = register(
                "deepslate_ruby_ore",
                properties -> new Block(properties.strength(3f).requiresCorrectToolForDrops().sound(SoundType.DEEPSLATE))
        );

        public static void initialize() {}
}
