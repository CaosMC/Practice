package rip.crystal.practice.cosmetics.impl.killeffects;
/* 
   Made by Hysteria Development Team
   Created on 30.11.2021
*/

import jdk.nashorn.internal.objects.annotations.Setter;
import lombok.Getter;
import rip.crystal.practice.cPractice;
import rip.crystal.practice.utilities.effect.ParticleEffect;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;

import java.util.Arrays;

public enum KillEffectType
{
    ANGRY("Angry", "ANGRY", Material.RED_ROSE, 500, location -> {
        ParticleEffect.VILLAGER_ANGRY.display(0.5f, 0.5f, 0.5f, 0.01f, 25, location, 20.0);
    }),
    BLOOD("Blood", "BLOOD", Material.REDSTONE, 500, location -> {
        ParticleEffect.ITEM_CRACK.display(new ParticleEffect.ItemData(Material.REDSTONE, (byte)0), 0.2f, 0.2f, 0.2f, 0.1f, 5, location, 20.0);
        ParticleEffect.BLOCK_DUST.display(new ParticleEffect.BlockData(Material.REDSTONE_BLOCK, (byte)0), 0.2f, 0.2f, 0.2f, 0.1f, 5, location, 20.0);
        ParticleEffect.ITEM_CRACK.display(new ParticleEffect.ItemData(Material.REDSTONE, (byte)0), 0.2f, 0.2f, 0.2f, 0.1f, 5, location, 20.0);
        ParticleEffect.BLOCK_DUST.display(new ParticleEffect.BlockData(Material.REDSTONE_BLOCK, (byte)0), 0.2f, 0.2f, 0.2f, 0.1f, 5, location, 20.0);
        ParticleEffect.ITEM_CRACK.display(new ParticleEffect.ItemData(Material.REDSTONE, (byte)0), 0.2f, 0.2f, 0.2f, 0.1f, 5, location, 20.0);
        ParticleEffect.BLOCK_DUST.display(new ParticleEffect.BlockData(Material.REDSTONE_BLOCK, (byte)0), 0.2f, 0.2f, 0.2f, 0.1f, 5, location, 20.0);
        ParticleEffect.ITEM_CRACK.display(new ParticleEffect.ItemData(Material.REDSTONE, (byte)0), 0.2f, 0.2f, 0.2f, 0.1f, 5, location, 20.0);
        ParticleEffect.BLOCK_DUST.display(new ParticleEffect.BlockData(Material.REDSTONE_BLOCK, (byte)0), 0.2f, 0.2f, 0.2f, 0.1f, 5, location, 20.0);
        ParticleEffect.ITEM_CRACK.display(new ParticleEffect.ItemData(Material.REDSTONE, (byte)0), 0.2f, 0.2f, 0.2f, 0.1f, 5, location, 20.0);
        ParticleEffect.BLOCK_DUST.display(new ParticleEffect.BlockData(Material.REDSTONE_BLOCK, (byte)0), 0.2f, 0.2f, 0.2f, 0.1f, 5, location, 20.0);
        ParticleEffect.ITEM_CRACK.display(new ParticleEffect.ItemData(Material.REDSTONE, (byte)0), 0.2f, 0.2f, 0.2f, 0.1f, 5, location, 20.0);
        ParticleEffect.BLOCK_DUST.display(new ParticleEffect.BlockData(Material.REDSTONE_BLOCK, (byte)0), 0.2f, 0.2f, 0.2f, 0.1f, 5, location, 20.0);
        ParticleEffect.ITEM_CRACK.display(new ParticleEffect.ItemData(Material.REDSTONE, (byte)0), 0.2f, 0.2f, 0.2f, 0.1f, 5, location, 20.0);
        ParticleEffect.BLOCK_DUST.display(new ParticleEffect.BlockData(Material.REDSTONE_BLOCK, (byte)0), 0.2f, 0.2f, 0.2f, 0.1f, 5, location, 20.0);
        return;
    }),
    CHESS("Chess", "CHESS", Material.BEDROCK, 500, location -> {
        ParticleEffect.ITEM_CRACK.display(new ParticleEffect.ItemData(Material.QUARTZ_BLOCK, (byte)0), 0.3f, 0.3f, 0.3f, 0.1f, 5, location, 20.0);
        ParticleEffect.ITEM_CRACK.display(new ParticleEffect.ItemData(Material.COAL_BLOCK, (byte)0), 0.3f, 0.3f, 0.3f, 0.1f, 5, location, 20.0);
        return;
    }),
    CLOUD("Cloud", "CLOUD", Material.WOOL, 500, location -> {
        ParticleEffect.CLOUD.display(0.0f, 0.0f, 0.0f, 0.1f, 100, location, 20.0);
    }),
    COAL("Coal", "COAL", Material.COAL, 500, location -> {
        ParticleEffect.ITEM_CRACK.display(new ParticleEffect.ItemData(Material.COAL, (byte)0), 0.3f, 0.3f, 0.3f, 0.1f, 20, location, 20.0);
        ParticleEffect.SMOKE_LARGE.display(0.3f, 0.3f, 0.3f, 0.1f, 3, location, 20.0);
        return;
    }),
    COOKIE("Cookie", "COOKIE", Material.COOKIE, 500, location -> {
        ParticleEffect.ITEM_CRACK.display(new ParticleEffect.ItemData(Material.COOKIE, (byte)0), 0.7f, 0.7f, 0.7f, 0.1f, 35, location, 20.0);
    }),
    DIAMOND("Diamond", "DIAMOND", Material.DIAMOND, 500, location -> {
        ParticleEffect.ITEM_CRACK.display(new ParticleEffect.ItemData(Material.DIAMOND, (byte)0), 0.3f, 0.3f, 0.3f, 0.1f, 2, location, 20.0);
        ParticleEffect.ITEM_CRACK.display(new ParticleEffect.ItemData(Material.DIAMOND, (byte)0), 0.3f, 0.3f, 0.3f, 0.1f, 2, location, 20.0);
        ParticleEffect.ITEM_CRACK.display(new ParticleEffect.ItemData(Material.DIAMOND, (byte)0), 0.3f, 0.3f, 0.3f, 0.1f, 2, location, 20.0);
        ParticleEffect.ITEM_CRACK.display(new ParticleEffect.ItemData(Material.DIAMOND, (byte)0), 0.3f, 0.3f, 0.3f, 0.1f, 2, location, 20.0);
        ParticleEffect.ITEM_CRACK.display(new ParticleEffect.ItemData(Material.DIAMOND, (byte)0), 0.3f, 0.3f, 0.3f, 0.1f, 2, location, 20.0);
        ParticleEffect.ITEM_CRACK.display(new ParticleEffect.ItemData(Material.DIAMOND, (byte)0), 0.3f, 0.3f, 0.3f, 0.1f, 2, location, 20.0);
        ParticleEffect.ITEM_CRACK.display(new ParticleEffect.ItemData(Material.DIAMOND, (byte)0), 0.3f, 0.3f, 0.3f, 0.1f, 2, location, 20.0);
        ParticleEffect.FIREWORKS_SPARK.display(0.3f, 0.3f, 0.3f, 0.1f, 3, location, 20.0);
        return;
    }),
    EMERALD("Emerald", "EMERALD", Material.EMERALD, 500, location -> {
        ParticleEffect.ITEM_CRACK.display(new ParticleEffect.ItemData(Material.EMERALD, (byte)0), 0.3f, 0.3f, 0.3f, 0.1f, 20, location, 20.0);
        ParticleEffect.FIREWORKS_SPARK.display(0.3f, 0.3f, 0.3f, 0.1f, 3, location, 20.0);
        return;
    }),
    TNT("TNT", "TNT", Material.TNT, 500, location -> {
        ParticleEffect.EXPLOSION_LARGE.display(0.5f, 0.5f, 0.5f, 1.0f, 12, location, 20.0);
    }),
    FIREWORK("Firework", "FIREWORK", Material.FIREWORK, 500, location -> {
        location.getWorld().spawnEntity(location, EntityType.FIREWORK);
        location.getWorld().spawnEntity(location, EntityType.FIREWORK);
        location.getWorld().spawnEntity(location, EntityType.FIREWORK);
        return;
    }),
    FLAME("Flame", "FLAME", Material.FLINT_AND_STEEL, 500, location -> {
        ParticleEffect.FLAME.display(0.2f, 0.2f, 0.2f, 0.1f, 10, location, 20.0);
    }),
    GOLD("Gold", "GOLD", Material.GOLD_INGOT, 500, location -> {
        ParticleEffect.ITEM_CRACK.display(new ParticleEffect.ItemData(Material.GOLD_INGOT, (byte)0), 0.3f, 0.3f, 0.3f, 0.1f, 20, location, 20.0);
        ParticleEffect.FIREWORKS_SPARK.display(0.3f, 0.3f, 0.3f, 0.1f, 3, location, 20.0);
        return;
    }),
    HALLOWEEN("Halloween", "HALLOWEEN", Material.PUMPKIN, 500, location -> {
        ParticleEffect.ITEM_CRACK.display(new ParticleEffect.ItemData(Material.PUMPKIN, (byte)0), 0.3f, 0.3f, 0.3f, 0.1f, 10, location, 20.0);
        ParticleEffect.ITEM_CRACK.display(new ParticleEffect.ItemData(Material.DEAD_BUSH, (byte)0), 0.3f, 0.3f, 0.3f, 0.1f, 10, location, 20.0);
        return;
    }),
    HAPPY("Happy", "HAPPY", Material.EMERALD_ORE, 500, location -> {
        ParticleEffect.VILLAGER_HAPPY.display(0.5f, 0.5f, 0.5f, 0.01f, 100, location, 20.0);
    }),
    HEART("Heart", "HEART", Material.REDSTONE_BLOCK, 500, location -> {
        ParticleEffect.HEART.display(0.4f, 0.4f, 0.4f, 0.1f, 10, location, 20.0);
    }),
    IRON("Iron", "IRON", Material.IRON_INGOT, 500, location -> {
        ParticleEffect.ITEM_CRACK.display(new ParticleEffect.ItemData(Material.IRON_INGOT, (byte)0), 0.3f, 0.3f, 0.3f, 0.1f, 20, location, 20.0);
        ParticleEffect.FIREWORKS_SPARK.display(0.3f, 0.3f, 0.3f, 0.1f, 3, location, 20.0);
        return;
    }),
    LAVA("Lava", "LAVA", Material.LAVA_BUCKET, 500, location -> {
        ParticleEffect.LAVA.display(0.5f, 0.5f, 0.5f, 0.1f, 12, location, 20.0);
    }),
    LIGHTING("Lighting", "LIGHTNING", Material.STICK, 500, location -> {
        location.getWorld().strikeLightningEffect(location);
    }),
    NOTE("Note", "NOTE", Material.NOTE_BLOCK, 500, location -> {
        ParticleEffect.NOTE.display(0.5f, 0.5f, 0.5f, 1.0f, 12, location, 20.0);
    }),
    THUNDER("Thunder", "THUNDER", Material.NETHER_STAR, 500, location -> {
        ParticleEffect.CLOUD.display(0.3f, 0.3f, 0.3f, 0.1f, 20, location, 20.0);
        ParticleEffect.WATER_SPLASH.display(0.3f, 0.4f, 0.3f, 0.1f, 20, location, 20.0);
        return;
    }),
    NUKE("Nuke", "NUKE", Material.TNT, 500, location -> new BukkitRunnable() {
        private double amount;
        private Location location;
        Location val$loc;

        {
            this.amount = 0.7853981633974483;
            this.location = this.val$loc;
        }

        public void run() {
            this.amount += 0.3141592653589793;
            for (double d1 = 0.0; d1 <= 6.283185307179586; d1 += 0.09817477042468103) {
                double d2 = this.amount * Math.cos(d1);
                double d3 = 2.0 * Math.exp(-0.1 * this.amount) * Math.sin(this.amount) + 1.5;
                double d4 = this.amount * Math.sin(d1);
                //this.location.add(d2, d3, d4);
                ParticleEffect.FIREWORKS_SPARK.display(0.0f, 0.0f, 0.0f, 0.0f, 1, this.location, 100.0);
                //this.location.subtract(d2, d3, d4);
                d2 = this.amount * Math.cos(d1 += 0.04908738521234052);
                d3 = 2.0 * Math.exp(-0.1 * this.amount) * Math.sin(this.amount) + 1.5;
                d4 = this.amount * Math.sin(d1);
                //this.location.add(d2, d3, d4);
                ParticleEffect.FLAME.display(0.0f, 0.0f, 0.0f, 0.0f, 1, this.location, 100.0);
                //this.location.subtract(d2, d3, d4);
            }
            if (this.amount > 10.0) {
                this.cancel();
            }
        }
    }.runTaskTimerAsynchronously(cPractice.get(), 0L, 1L));

    private String name;
    private String name2;
    private int price;
    private Material material;
    private EffectCallable callable;

    public static KillEffectType getByName(final String input) {
        return Arrays.stream(values()).filter(type -> type.name().equalsIgnoreCase(input) || type.getName().equalsIgnoreCase(input)).findFirst().orElse(null);
    }

    public boolean hasPermission(final Player player) {
        return player.hasPermission(this.getPermissionForAll()) || player.hasPermission(this.getPermission());
    }

    public String getPermissionForAll() {
        return "cosmetics.killeffect.*";
    }

    public String getPermission() {
        return "cosmetics.killeffect." + this.name().toLowerCase();
    }

    public String getName() {
        return this.name;
    }

    public String getName2(String name) {
        return this.name2;
    }

    public int getPrice() {
        return this.price;
    }

    public Material getMaterial() {
        return material;
    }

    public EffectCallable getCallable() {
        return this.callable;
    }

    private KillEffectType(final String name, final String name2, Material material,  int price, final EffectCallable callable) {
        this.name = name;
        this.name2 = name2;
        this.material = material;
        this.price = price;
        this.callable = callable;
    }
}

