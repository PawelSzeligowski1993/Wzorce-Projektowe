package creativePatterns._01_Builder.hause;

import creativePatterns._01_Builder.hause.hauseBilder.Hause;

public class Main {
    public static void main(String[] args) {
        Hause hause1 = new Hause("walls","floors","windows","rooms","doors", "garage");
        Hause hause2 = new Hause("walls","floors","windows");

        System.out.println(hause1);
        System.out.println(hause2);
    }
}
