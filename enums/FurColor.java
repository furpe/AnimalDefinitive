package enums;

public enum FurColor {
    // Definição das constantes com seus respectivos códigos e nomes de exibição
    BLACK(1, "Black"),
    WHITE(2, "White"),
    ORANGE_TABBY(3, "Orange Tabby"),
    GRAY(4, "Gray"),
    BROWN(5, "Brown"),
    CALICO(6, "Calico"),
    SPOTTED(7, "Spotted");

    private final int code;
    private final String displayName;

    // Construtor do enum (implicitamente privado)
    private FurColor(int code, String displayName) {
        this.code = code;
        this.displayName = displayName;
    }

    // Métodos Getters
    public int getCode() {
        return code;
    }

    public String getDisplayName() {
        return displayName;
    }

    /**
     * Retorna a constante FurColor correspondente ao código informado.
     * @param code Código numérico da cor da pelagem
     * @return FurColor correspondente
     * @throws IllegalArgumentException se o código não for encontrado
     */
    public static FurColor fromCode(int code) {
        for (FurColor color : FurColor.values()) {
            if (color.getCode() == code) {
                return color;
            }
        }
        throw new IllegalArgumentException("Invalid FurColor code: " + code);
    }
}