package net.runelite.client.plugins.skillcalculator.skills;

import lombok.AllArgsConstructor;
import lombok.Getter;
import net.runelite.api.gameval.ItemID;
import net.runelite.client.game.ItemManager;

@AllArgsConstructor
@Getter
public enum SailingAction implements NamedSkillAction
{
    SMALL_SHIPWRECK_SORTING("Small Shipwreck Salvage (Sorting)", 15, 5, ItemID.SAILING_SMALL_SHIPWRECK_SALVAGE),
    SMALL_SHIPWRECK_SALVAGE("Small Shipwreck Salvage (Salvaging)", 15, 10, ItemID.SAILING_SMALL_SHIPWRECK_SALVAGE),
    FISHY_SHIPWRECK_SORTING("Fishy Shipwreck Salvage (Sorting)", 26, 9, ItemID.SAILING_FISHERMAN_SHIPWRECK_SALVAGE),
    FISHY_SHIPWRECK_SALVAGE("Fishy Shipwreck Salvage (Salvaging)", 26, 17, ItemID.SAILING_FISHERMAN_SHIPWRECK_SALVAGE),
    TEMPEST_TRIAL_UNRANKED("Unranked Tempor Trial", 30, 300, ItemID.RALPHS_FABRIC_ROLL),
    TEMPEST_TRIAL_SWORDFISH("Swordfish Tempor Trial", 30, 595, ItemID.RALPHS_FABRIC_ROLL),
    TEMPEST_TRIAL_SHARK("Shark Tempor Trial", 30, 1025, ItemID.RALPHS_FABRIC_ROLL),
    TEMPEST_TRIAL_MARLIN("Marlin Tempor Trial", 30, 1790, ItemID.RALPHS_FABRIC_ROLL),
    TEST_BOUNTY_30("Level 30 Bounty", 30, 1790, ItemID.SAILING_BULL_SHARK_JAW),
    BARRACUDA_SHIPWRECK_SORTING("Barracuda Shipwreck Salvage (Sorting)", 35, 15.5f, ItemID.SAILING_BARRACUDA_SHIPWRECK_SALVAGE),
    BARRACUDA_SHIPWRECK_SALVAGE("Barracuda Shipwreck Salvage (Salvaging)", 35, 31, ItemID.SAILING_BARRACUDA_SHIPWRECK_SALVAGE),
    BOUNTY_38("Level 38 Bounty", 38, 2020, ItemID.SAILING_BULL_SHARK_JAW),
    BOUNTY_40("Level 40 Bounty", 40, 3400, ItemID.SAILING_BULL_SHARK_JAW),
    BOUNTY_45_48("Level 45-48 Bounty", 45, 3650, ItemID.SAILING_BULL_SHARK_JAW),
    BOUNTY_50("Level 50 Bounty", 50, 4390, ItemID.SAILING_BULL_SHARK_JAW),
    LARGE_SHIPWRECK_SORTING("Large Shipwreck Salvage (Sorting)", 53, 24, ItemID.SAILING_LARGE_SHIPWRECK_SALVAGE),
    LARGE_SHIPWRECK_SALVAGE("Large Shipwreck Salvage (Salvaging)", 53, 48, ItemID.SAILING_LARGE_SHIPWRECK_SALVAGE),
    JIVE_TRIAL_UNRANKED("Unranked Jubbly Jive Trial", 55, 1400, ItemID.GURTOBS_FABRIC_ROLL),
    JIVE_TRIAL_SWORDFISH("Swordfish Jubbly Jive Trial", 55, 2200, ItemID.GURTOBS_FABRIC_ROLL),
    JIVE_TRIAL_SHARK("Shark Jubbly Jive Trial", 55, 3950, ItemID.GURTOBS_FABRIC_ROLL),
    JEST_BOUNTY_55("Level 50 Bounty", 55, 6360, ItemID.SAILING_BULL_SHARK_JAW),
    JIVE_TRIAL_MARLIN("Marlin Jubbly Jive Trial", 55, 7500, ItemID.GURTOBS_FABRIC_ROLL),
    BOUNTY_60_62("Level 60-62 Bounty", 60, 6760, ItemID.SAILING_BULL_SHARK_JAW),
    PLUNDERED_SHIPWRECK_SORTING("Plundered Shipwreck Salvage (Sorting)", 64, 31.5f, ItemID.SAILING_PIRATE_SHIPWRECK_SALVAGE),
    PLUNDERED_SHIPWRECK_SALVAGE("Plundered Shipwreck Salvage (Salvaging)", 64, 63, ItemID.SAILING_PIRATE_SHIPWRECK_SALVAGE),
    BOUNTY_65_67("Level 65-67 Bounty", 65, 7500, ItemID.SAILING_BULL_SHARK_JAW),
    BOUNTY_70("Level 70 Bounty", 70, 7730, ItemID.SAILING_BULL_SHARK_JAW),
    GLIDE_TRIAL_UNRANKED("Unranked Gwenith Glide Trial", 72,3100, ItemID.GWYNAS_FABRIC_ROLL),
    GLIDE_TRIAL_SWORDFISH("Swordfish Gwenith Glide Trial", 72,4100, ItemID.GWYNAS_FABRIC_ROLL),
    GLIDE_TRIAL_SHARK("Shark Gwenith Glide Trial", 72, 9315, ItemID.GWYNAS_FABRIC_ROLL),
    GLIDE_TRIAL_MARLIN("Marlin Gwenith Glide Trial", 72, 18160, ItemID.GWYNAS_FABRIC_ROLL),
    MARTIAL_SHIPWRECK_SORTING("Martial Shipwreck Salvage (Sorting)", 73, 63.5f, ItemID.SAILING_MERCENARY_SHIPWRECK_SALVAGE),
    MARTIAL_SHIPWRECK_SALVAGE("Martial Shipwreck Salvage (Salvaging)", 73, 127, ItemID.SAILING_MERCENARY_SHIPWRECK_SALVAGE),
    BOUNTY_75_76("Level 75-76 Bounty", 75, 8540, ItemID.SAILING_BULL_SHARK_JAW),
    FREMENNIK_SHIPWRECK_SORTING("Fremennik Shipwreck Salvage (Sorting)", 80, 75, ItemID.SAILING_FREMENNIK_SHIPWRECK_SALVAGE),
    FREMENNIK_SHIPWRECK_SALVAGE("Fremennik Shipwreck Salvage (Salvaging)", 80, 150, ItemID.SAILING_FREMENNIK_SHIPWRECK_SALVAGE),
    ARMOURED_KRAKEN_BOUNTY("Level 80 Bounty", 80, 9540, ItemID.SAILING_BULL_SHARK_JAW),
    OPULENT_SHIPWRECK_SORTING("Opulent Shipwreck Salvage (Sorting)", 87, 95, ItemID.SAILING_MERCHANT_SHIPWRECK_SALVAGE),
    OPULENT_SHIPWRECK_SALVAGE("Opulent Shipwreck Salvage (Salvaging)", 87, 190, ItemID.SAILING_MERCHANT_SHIPWRECK_SALVAGE),

    ;

    private final String name;
    private final int level;
    private final float xp;
    private final int icon;

    @Override
    public boolean isMembers(final ItemManager itemManager)
    {
        return true;
    }
}