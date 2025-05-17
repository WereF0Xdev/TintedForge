package fox.mods.tintedforge;

import fox.mods.tintedforge.utils.ColorCodesUtils;

public enum ColorCode {
    BLACK("Black", ColorCodesUtils.createColorCode("0"), "0", "black"),
    DARK_BLUE("Dark Blue", ColorCodesUtils.createColorCode("1"), "1", "dark_blue"),
    DARK_GREEN("Dark Green", ColorCodesUtils.createColorCode("2"), "2", "dark_green"),
    DARK_AQUA("Dark Acqua", ColorCodesUtils.createColorCode("3"), "3", "dark_aqua"),
    DARK_RED("Dark Red", ColorCodesUtils.createColorCode("4"), "4", "dark_red"),
    DARK_PURPLE("Dark Purple", ColorCodesUtils.createColorCode("5"), "5", "dark_purple"),
    GOLD("Gold", ColorCodesUtils.createColorCode("6"), "6", "gold"),
    GRAY("Gray", ColorCodesUtils.createColorCode("7"), "7", "gray"),
    DARK_GRAY("Dark Gray", ColorCodesUtils.createColorCode("8"), "8", "dark_gray"),
    BLUE("Blue", ColorCodesUtils.createColorCode("9"), "9", "blue"),
    GREEN("Green", ColorCodesUtils.createColorCode("a"), "a", "green"),
    AQUA("Aqua", ColorCodesUtils.createColorCode("b"), "b", "aqua"),
    RED("Red", ColorCodesUtils.createColorCode("c"), "c", "red"),
    LIGHT_PURPLE("Light Purple", ColorCodesUtils.createColorCode("d"), "d", "light_purple"),
    YELLOW("Yellow", ColorCodesUtils.createColorCode("e"), "e", "yellow"),
    WHITE("White", ColorCodesUtils.createColorCode("f"), "f", "white");

    private final String displayName;
    private final String displayColor;
    private final String letter;
    private final String colorId;

    ColorCode(String displayName, String displayColor, String letter, String colorId) {
        this.displayName = displayName;
        this.displayColor = displayColor;
        this.letter = letter;
        this.colorId = colorId;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getDisplayColor() {
        return displayColor;
    }

    public String getLetter() {
        return letter;
    }

    public String getColorId() {
        return colorId;
    }

    public static ColorCode fromName(String name) {
        for (ColorCode colorCode : values()) {
            if (colorCode.name().equalsIgnoreCase(name) || colorCode.displayName.equalsIgnoreCase(name)) {
                return colorCode;
            }
        }
        return ColorCode.GRAY;
    }

    public static ColorCode fromDisplayColor(String displayColor) {
        for (ColorCode colorCode : values()) {
            if (colorCode.displayColor.equalsIgnoreCase(displayColor)) {
                return colorCode;
            }
        }
        return ColorCode.GRAY;
    }
}


