package net.minestom.server.particle;

import net.minestom.server.registry.Registries;
import net.minestom.server.utils.NamespaceID;

/**
 * //==============================
 * //  AUTOGENERATED BY EnumGenerator
 * //==============================
 */
@SuppressWarnings({"deprecation"})
public enum Particle {
    AMBIENT_ENTITY_EFFECT("minecraft:ambient_entity_effect"),

    ANGRY_VILLAGER("minecraft:angry_villager"),

    BARRIER("minecraft:barrier"),

    BLOCK("minecraft:block"),

    BUBBLE("minecraft:bubble"),

    CLOUD("minecraft:cloud"),

    CRIT("minecraft:crit"),

    DAMAGE_INDICATOR("minecraft:damage_indicator"),

    DRAGON_BREATH("minecraft:dragon_breath"),

    DRIPPING_LAVA("minecraft:dripping_lava"),

    FALLING_LAVA("minecraft:falling_lava"),

    LANDING_LAVA("minecraft:landing_lava"),

    DRIPPING_WATER("minecraft:dripping_water"),

    FALLING_WATER("minecraft:falling_water"),

    DUST("minecraft:dust"),

    EFFECT("minecraft:effect"),

    ELDER_GUARDIAN("minecraft:elder_guardian"),

    ENCHANTED_HIT("minecraft:enchanted_hit"),

    ENCHANT("minecraft:enchant"),

    END_ROD("minecraft:end_rod"),

    ENTITY_EFFECT("minecraft:entity_effect"),

    EXPLOSION_EMITTER("minecraft:explosion_emitter"),

    EXPLOSION("minecraft:explosion"),

    FALLING_DUST("minecraft:falling_dust"),

    FIREWORK("minecraft:firework"),

    FISHING("minecraft:fishing"),

    FLAME("minecraft:flame"),

    SOUL_FIRE_FLAME("minecraft:soul_fire_flame"),

    SOUL("minecraft:soul"),

    FLASH("minecraft:flash"),

    HAPPY_VILLAGER("minecraft:happy_villager"),

    COMPOSTER("minecraft:composter"),

    HEART("minecraft:heart"),

    INSTANT_EFFECT("minecraft:instant_effect"),

    ITEM("minecraft:item"),

    ITEM_SLIME("minecraft:item_slime"),

    ITEM_SNOWBALL("minecraft:item_snowball"),

    LARGE_SMOKE("minecraft:large_smoke"),

    LAVA("minecraft:lava"),

    MYCELIUM("minecraft:mycelium"),

    NOTE("minecraft:note"),

    POOF("minecraft:poof"),

    PORTAL("minecraft:portal"),

    RAIN("minecraft:rain"),

    SMOKE("minecraft:smoke"),

    SNEEZE("minecraft:sneeze"),

    SPIT("minecraft:spit"),

    SQUID_INK("minecraft:squid_ink"),

    SWEEP_ATTACK("minecraft:sweep_attack"),

    TOTEM_OF_UNDYING("minecraft:totem_of_undying"),

    UNDERWATER("minecraft:underwater"),

    SPLASH("minecraft:splash"),

    WITCH("minecraft:witch"),

    BUBBLE_POP("minecraft:bubble_pop"),

    CURRENT_DOWN("minecraft:current_down"),

    BUBBLE_COLUMN_UP("minecraft:bubble_column_up"),

    NAUTILUS("minecraft:nautilus"),

    DOLPHIN("minecraft:dolphin"),

    CAMPFIRE_COSY_SMOKE("minecraft:campfire_cosy_smoke"),

    CAMPFIRE_SIGNAL_SMOKE("minecraft:campfire_signal_smoke"),

    DRIPPING_HONEY("minecraft:dripping_honey"),

    FALLING_HONEY("minecraft:falling_honey"),

    LANDING_HONEY("minecraft:landing_honey"),

    FALLING_NECTAR("minecraft:falling_nectar"),

    ASH("minecraft:ash"),

    CRIMSON_SPORE("minecraft:crimson_spore"),

    WARPED_SPORE("minecraft:warped_spore"),

    DRIPPING_OBSIDIAN_TEAR("minecraft:dripping_obsidian_tear"),

    FALLING_OBSIDIAN_TEAR("minecraft:falling_obsidian_tear"),

    LANDING_OBSIDIAN_TEAR("minecraft:landing_obsidian_tear"),

    REVERSE_PORTAL("minecraft:reverse_portal"),

    WHITE_ASH("minecraft:white_ash");

    private String namespaceID;

    Particle(String namespaceID) {
        this.namespaceID = namespaceID;
        Registries.particles.put(NamespaceID.from(namespaceID), this);
    }

    public int getId() {
        return ordinal();
    }

    public String getNamespaceID() {
        return namespaceID;
    }

    public static Particle fromId(int id) {
        if (id >= 0 && id < values().length) {
            return values()[id];
        }
        return null;
    }
}
