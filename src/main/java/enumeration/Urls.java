package enumeration;

public enum Urls {
    PHP_TRAVELS_INDEX("https://phptravels.com/");
    private final String urls;

    Urls(String urls) {
        this.urls = urls;
    }

    public String getUrls(){
        return urls;
    }


}
