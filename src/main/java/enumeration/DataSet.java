package enumeration;

public enum DataSet {
    DATA("");

    private final String dataset;

    DataSet(String dataset) {
        this.dataset = dataset;
    }

    public String getDataset(){
        return dataset;
    }


}
