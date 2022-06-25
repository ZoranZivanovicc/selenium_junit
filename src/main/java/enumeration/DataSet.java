package enumeration;

public enum DataSet {
    TEXT_FOR_LOGO("PHPTRAVELS TRAVEL TECHNOLOGY PARTNER"),
    TITLE_FOR_PHP_TRAVEL_INDEX_PAGE("PHPTRAVELS booking script and system for hotels airline flights tours cars online application - PHPTRAVELS"),
    ADVERTISING_DESCRIPTION("Start-up your online travel agency today ( OTA ) and sell flights tickets, hotel rooms, tours packages, car transfers, cruises and much more with no hassle and 100% opensource code platform.");

    private final String dataset;

    DataSet(String dataset) {
        this.dataset = dataset;
    }

    public String getDataset(){
        return dataset;
    }


}
