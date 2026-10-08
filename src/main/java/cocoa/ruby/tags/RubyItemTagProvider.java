package cocoa.ruby.tags;

import cocoa.ruby.item.RubyItemIDs;
import net.fabricmc.fabric.api.datagen.v1.FabricPackOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagsProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.references.ItemIds;
import net.minecraft.tags.ItemTags;

import java.util.concurrent.CompletableFuture;

public class RubyItemTagProvider extends FabricTagsProvider.ItemTagsProvider {
    public RubyItemTagProvider(FabricPackOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture){
        super(output, registriesFuture);
    }

    @Override
    protected void addTags(HolderLookup.Provider wrapperLookup) {
        builder(ItemTags.HEAD_ARMOR)
                .add(RubyItemIDs.RUBY_HELMET);
        builder(ItemTags.CHEST_ARMOR)
                .add(RubyItemIDs.RUBY_CHESTPLATE);
        builder(ItemTags.LEG_ARMOR)
                .add(RubyItemIDs.RUBY_LEGGINGS);
        builder(ItemTags.FOOT_ARMOR)
                .add(RubyItemIDs.RUBY_BOOTS);
    }
}
