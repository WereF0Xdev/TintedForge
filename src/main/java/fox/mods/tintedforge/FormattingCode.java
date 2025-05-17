package fox.mods.tintedforge;

import fox.mods.tintedforge.utils.ColorCodesUtils;

public enum FormattingCode {
    RESET("Reset", ColorCodesUtils.createColorCode("r"), "r"),
    OBFUSCATED("Obfuscated", ColorCodesUtils.createColorCode("k"), "k"),
    BOLD("Bold", ColorCodesUtils.createColorCode("l"), "l"),
    STRIKETHROUGH("Strikethrough", ColorCodesUtils.createColorCode("m"), "m"),
    UNDERLINE("Underline", ColorCodesUtils.createColorCode("n"), "n"),
    ITALIC("Italic", ColorCodesUtils.createColorCode("o"), "o");

    private final String displayName;
    private final String displayCode;
    private final String letter;

    FormattingCode(String displayName, String displayCode, String letter) {
        this.displayName = displayName;
        this.displayCode = displayCode;
        this.letter = letter;
    }

    public String getDisplayName() {
        return displayName;
    }

    public String getDisplayCode() {
        return displayCode;
    }

    public String getLetter() {
        return letter;
    }

    public static FormattingCode fromName(String name) {
        for (FormattingCode formattingCode : values()) {
            if (formattingCode.name().equalsIgnoreCase(name) || formattingCode.displayName.equalsIgnoreCase(name)) {
                return formattingCode;
            }
        }
        return FormattingCode.RESET;
    }

    public static FormattingCode fromDisplayCode(String displayColor) {
        for (FormattingCode formattingCode : values()) {
            if (formattingCode.displayCode.equalsIgnoreCase(displayColor)) {
                return formattingCode;
            }
        }
        return FormattingCode.RESET;
    }
}

