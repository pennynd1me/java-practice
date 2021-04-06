public class ClothingInfo {
    String code;
    int season;

    static final int SPRING = 1;
    static final int SUMMER = 2;
    static final int FALL = 3;
    static final int WINTER = 4;

    public ClothingInfo(String code, int season) {
        this.code = code;
        this.season = season;
    }
}
