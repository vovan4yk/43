public enum Language {

    SMALL("frenchTranslationSmall", "italianTranslationSmall", "ukrainianTranslationSmall"),
    BIG("frenchTranslationBig", "italianTranslationBig", "ukrainianTranslationBig"),
    LITTLE("frenchTranslationLittle", "italianTranslationLittle", "ukrainianTranslationLittle");

    private String french;
    private String italian;
    private String ukrainian;

    Language(String french, String italian, String ukrainian) {
        this.french = french;
        this.italian = italian;
        this.ukrainian = ukrainian;
    }

    public String getFrench() {
        return french;
    }

    public String getItalian() {
        return italian;
    }

    public String getUkrainian() {
        return ukrainian;
    }
}
