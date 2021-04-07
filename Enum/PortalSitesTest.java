public class PortalSitesTest {
    public static void main(String[] args) {
        System.out.println(PortalSites.NAVER.getHomepageUrl());
        System.out.println(PortalSites.KAKAO.getHomepageUrl());
        System.out.println(PortalSites.GOOGLE.getHomepageUrl());
        System.out.println(PortalSites.ZUM.getHomepageUrl());

        System.out.println(PortalSites.valueOf("NAVER").getKrName());
    }
}
