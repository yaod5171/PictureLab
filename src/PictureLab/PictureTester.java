package PictureLab;

/**
 * This class contains class (static) methods that will help you test the
 * Picture class methods. Uncomment the methods and the code in the main to
 * test.
 *
 * @author Barbara Ericson
 */
public class PictureTester {
    
    private static final String picture = "redMotorcycle.jpg";
    
    /**
     * Control method; test the original image
     */
    /**
     * Method to test zeroBlue
     */
    public static void testZeroBlue() {
        Picture image = new Picture(picture);
        image.explore();
        image.zeroBlue();
        image.explore();
    }

    /**
     * Method to test keepOnlyBlue
     */
    public static void testKeepOnlyBlue() {
        Picture image = new Picture(picture);
        image.explore();
        image.keepOnlyBlue();
        image.explore();
    }

    /**
     * Method to test negate
     */
    public static void testNegate() {
        Picture image = new Picture(picture);
        image.explore();
        image.negate();
        image.explore();
    }

    /**
     * Method to test negate
     */
    public static void testGrayscale() {
        Picture image = new Picture(picture);
        image.explore();
        image.grayscale();
        image.explore();
    }

    /**
     * Method to test mirrorVertical
     */
    public static void testMirrorVertical() {
        Picture image = new Picture(picture);
        image.explore();
        image.mirrorVertical();
        image.explore();
    }
    
    /**
     * Method to test mirrorVerticalRightToLeft
     */
    public static void testMirrorVerticalRightToLeft() {
        Picture image = new Picture(picture);
        image.explore();
        image.mirrorVerticalRightToLeft();
        image.explore();
    }
    
    /**
     * Method to test mirrorHorizontal
     */
    public static void testMirrorHorizontal() {
        Picture image = new Picture(picture);
        image.explore();
        image.mirrorHorizontal();
        image.explore();
    }
    
    /**
     * Method to test Diagonal
     */
    public static void testMirrorDiagonal() {
        Picture image = new Picture(picture);
        image.explore();
        image.mirrorDiagonal();
        image.explore();
    }


    /**
     * Method to test mirrorTemple
     */
    public static void testMirrorTemple() {
        Picture temple = new Picture("temple.jpg");
        temple.explore();
        temple.mirrorTemple();
        temple.explore();
    }
    
    /**
     * Method to test mirrorArms
     */
    public static void testMirrorArms() {
        Picture snowman = new Picture("snowman.jpg");
        snowman.explore();
        snowman.mirrorArms();
        snowman.explore();
    }
    
    /**
     * Method to test mirrorGull
     */
    public static void testMirrorGull() {
        Picture seagull = new Picture("seagull.jpg");
        seagull.explore();
        seagull.mirrorGull();
        seagull.explore();
    }

    /**
     * Method to test the collage method
     */
    public static void testCollage() {
        Picture canvas = new Picture("640x480.jpg");
        canvas.createCollage();
        canvas.explore();
    }

    /**
     * Method to test edgeDetection
     */
    public static void testEdgeDetection() {
        Picture image = new Picture(picture);
        image.explore();
        image.edgeDetection(20);
        image.explore();
    }

    /**
     * Main method for testing. Every class can have a main method in Java
     */
    public static void main(String[] args) {
        // uncomment a call here to run a test
        // and comment out the ones you don't want
        // to run
        //testZeroBlue();
        //testKeepOnlyBlue();
        //testKeepOnlyRed();
        //testKeepOnlyGreen();
        //testNegate();
        //testGrayscale();
        //testFixUnderwater();
        //testMirrorVertical();
        //testMirrorVerticalRightToLeft();
        //testMirrorHorizontal();
        //testMirrorDiagonal();
        //testMirrorTemple();
        //testMirrorArms();
        testMirrorGull();
        //testMirrorDiagonal();
        //testCollage();
        //testCopy();
        //testEdgeDetection();
        //testEdgeDetection2();
        //testChromakey();
        //testEncodeAndDecode();
        //testGetCountRedOverValue(250);
        //testSetRedToHalfValueInTopHalf();
        //testClearBlueOverValue(200);
        //testGetAverageForColumn(0);
    }
}
