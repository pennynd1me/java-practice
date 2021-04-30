package shadowing;

public class ShadowTest {

    public int x = 0;

    class FirstLevel {

        public int x = 1;

        void methodInFirstLevel(int x) {
            // 메소드 파라미터의 x
            System.out.println("x = " + x);
            // inner class FirstLevel의 멤버 변수 x
            System.out.println("this.x = " + this.x);
            // outer class ShadowTest의 멤버 변수 x
            System.out.println("ShadowTest.this.x = " + ShadowTest.this.x);
        }
    }

    public static void main(String[] args) {
        ShadowTest st = new ShadowTest();
        ShadowTest.FirstLevel fl = st.new FirstLevel();
        fl.methodInFirstLevel(23);
    }

}
