package enumeration;

public enum DataSet {
    TEXT_FROM_LOGO("PHPTRAVELS TRAVEL TECHNOLOGY PARTNER");

    private final String dataset;

    DataSet(String dataset) {
        this.dataset = dataset;
    }

    public String getDataset(){
        return dataset;
    }


}
