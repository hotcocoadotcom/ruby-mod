package cocoa.ruby.item;

import cocoa.ruby.RubyMod;
import cocoa.ruby.tags.RubyTags;
import net.minecraft.resources.ResourceKey;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.equipment.ArmorMaterial;
import net.minecraft.world.item.equipment.ArmorType;
import net.minecraft.world.item.equipment.EquipmentAsset;
import net.minecraft.world.item.equipment.EquipmentAssets;

import java.util.Map;


public class RubyArmorMaterial {

    public static final int BASE_DURABILITY = 40;
    public static final ResourceKey<EquipmentAsset> RUBY_ARMOR_MATERIAL_KEY = ResourceKey.create(EquipmentAssets.ROOT_ID, RubyMod.id("ruby"));

    public static final ArmorMaterial RUBY_ARMOR_MATERIAL = new ArmorMaterial(
            BASE_DURABILITY,
            Map.of(
                    ArmorType.HELMET, 3,
                    ArmorType.CHESTPLATE, 8,
                    ArmorType.LEGGINGS, 6,
                    ArmorType.BOOTS, 3
            ),
            20,
            SoundEvents.ARMOR_EQUIP_DIAMOND,
            3.0F,
            0.0F,
            RubyTags.Items.REPAIRS_RUBY_TOOLS,
            RUBY_ARMOR_MATERIAL_KEY

    );
}
