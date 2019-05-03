package PictureLab;

/**
 * This class contains class (static) methods that will help you test the
 * Picture class methods. Uncomment the methods and the code in the main to
 * test.
 *
 * @author Barbara Ericson
 */
public class PictureTester {
    
    private static final String picture = "swan.jpg";
    
    /**
     * Control method; test the original image
     */
    public static void testPicture() {
        Picture image = new Picture(picture);
        image.explore();
    }
    
    /**
     * Method to test zeroBlue
     */
    public static void testZeroBlue() {
        Picture image = new Picture(picture);
        image.zeroBlue();
        image.explore();
    }

    /**
     * Method to test keepOnlyBlue
     */
    public static void testKeepOnlyBlue() {
        Picture image = new Picture(picture);
        image.keepOnlyBlue();
        image.explore();
    }

    /**
     * Method to test negate
     */
    public static void testNegate() {
        Picture image = new Picture(picture);
        image.negate();
        image.explore();
    }

    /**
     * Method to test negate
     */
    public static void testGrayscale() {
        Picture image = new Picture(picture);
        image.grayscale();
        image.explore();
    }

    /**
     * Method to test mirrorVertical
     */
    public static void testMirrorVertical() {
        Picture image = new Picture(picture);
        image.mirrorVertical();
        image.explore();
    }
    
    /**
     * Method to test mirrorVerticalRightToLeft
     */
    public static void testMirrorVerticalRightToLeft() {
        Picture image = new Picture(picture);
        image.mirrorVerticalRightToLeft();
        image.explore();
    }
    
    /**
     * Method to test mirrorHorizontal
     */
    public static void testMirrorHorizontal() {
        Picture image = new Picture(picture);
        image.mirrorHorizontal();
        image.explore();
    }
    
    /**
     * Method to test Diagonal
     */
    public static void testMirrorDiagonal() {
        Picture image = new Picture(picture);
        image.mirrorDiagonal();
        image.explore();
    }


    /**
     * Method to test mirrorTemple
     */
    public static void testMirrorTemple() {
        Picture temple = new Picture("temple.jpg");
        temple.mirrorTemple();
        temple.explore();
    }
    
    /**
     * Method to test mirrorArms
     */
    public static void testMirrorArms() {
        Picture snowman = new Picture("snowman.jpg");
        snowman.mirrorArms();
        snowman.explore();
    }
    
    /**
     * Method to test mirrorGull
     */
    public static void testMirrorGull() {
        Picture seagull = new Picture("seagull.jpg");
        seagull.mirrorGull();
        seagull.explore();
    }

    /**
     * Method to test the copy method
     */
    public static void testCopy() {
        Picture canvas = new Picture("640x480.jpg");
        Picture image = new Picture(picture);
        canvas.copy(image, 100, 100, 200, 200, 100, 100);
        canvas.explore();
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
     * Method to test the myCollage method
     */
    public static void testMyCollage() {
        Picture canvas = new Picture("7inX95in.jpg");
        canvas.myCollage();
        canvas.explore();
    }

    /**
     * Method to test edgeDetection
     */
    public static void testEdgeDetection() {
        Picture image = new Picture(picture);
        image.edgeDetection(10);
        image.explore();
    }

    /**
     * Main method for testing. Every class can have a main method in Java
     */
    public static void main(String[] args) {
        // uncomment a call here to run a test
        // and comment out the ones you don't want
        // to run
        
        testPicture();
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
        //testMirrorGull();
        //testCollage();
        //testMyCollage();
        //testCopy();
        testEdgeDetection();
        //testEdgeDetection2();
        //testChromakey();
        //testEncodeAndDecode();
        //testGetCountRedOverValue(250);
        //testSetRedToHalfValueInTopHalf();
        //testClearBlueOverValue(200);
        //testGetAverageForColumn(0);
    }
}
