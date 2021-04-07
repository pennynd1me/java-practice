public enum PortalSites implements PortalSiteAction {
    NAVER("네이버"),
    KAKAO("카카오"),
    GOOGLE("구글"),
    ZUM("줌인터넷");

    private final String krName;

    PortalSites(String krName) {
        this.krName = krName;
    }

    String getKrName() {
        return krName;
    }

    @Override
    public String getHomepageUrl() {
        switch (this) {
            case NAVER:
                return "https://www.naver.com";
            case KAKAO:
                return "https://www.daum.net";
            case GOOGLE:
                return "https://www.google.com";
            case ZUM:
                return "https://www.zum.com";
        }
        return null; // or throw exception
    }
}
