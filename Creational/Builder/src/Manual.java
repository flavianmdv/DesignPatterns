class Manual {
    private String manualText;

    public Manual() {
        manualText = "";
    }

    public String getManualText() {
        return manualText;
    }

    public void setManualText(String text) {
        manualText = text;
    }

    @Override
    public String toString() {
        return "Manual{" +
                "manualText='" + manualText + '\'' +
                '}';
    }
}