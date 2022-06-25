package enumeration;

public enum Urls {
    PHP_TRAVELS_INDEX("");
    private final String urls;

    Urls(String urls) {
        this.urls = urls;
    }

    public String getUrls(){
        return urls;
    }


}
