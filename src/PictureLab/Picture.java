package PictureLab;

import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
import java.util.List; // resolves problem with java.awt.List and java.util.List

/**
 * A class that represents a picture. This class inherits from SimplePicture and
 * allows the student to add functionality to the Picture class.
 *
 * @author Barbara Ericson ericson@cc.gatech.edu
 */
public class Picture extends SimplePicture {
  ///////////////////// constructors //////////////////////////////////

    /**
     * Constructor that takes no arguments
     */
    public Picture() {
        /* not needed but use it to show students the implicit call to super()
         * child constructors always call a parent constructor 
         */
        super();
    }

    /**
     * Constructor that takes a file name and creates the picture
     *
     * @param fileName the name of the file to create the picture from
     */
    public Picture(String fileName) {
        // let the parent class handle this fileName
        super(fileName);
    }

    /**
     * Constructor that takes the width and height
     *
     * @param height the height of the desired picture
     * @param width the width of the desired picture
     */
    public Picture(int height, int width) {
        // let the parent class handle this width and height
        super(width, height);
    }

    /**
     * Constructor that takes a picture and creates a copy of that picture
     *
     * @param copyPicture the picture to copy
     */
    public Picture(Picture copyPicture) {
        // let the parent class do the copy
        super(copyPicture);
    }

    /**
     * Constructor that takes a buffered image
     *
     * @param image the buffered image to use
     */
    public Picture(BufferedImage image) {
        super(image);
    }

  ////////////////////// methods ///////////////////////////////////////
    /**
     * Method to return a string with information about this picture.
     *
     * @return a string with information about the picture such as fileName,
     * height and width.
     */
    public String toString() {
        String output = "Picture, filename " + getFileName()
                + " height " + getHeight()
                + " width " + getWidth();
        return output;

    }

    /**
     * Method to set the blue to 0
     */
    public void zeroBlue() {
        Pixel[][] pixels = this.getPixels2D();
        for (Pixel[] rowArray : pixels) {
            for (Pixel pixelObj : rowArray) {
                pixelObj.setBlue(0);
            }
        }
    }

    /**
     * Method to set red and green to 0
     */
    public void keepOnlyBlue() {
        Pixel[][] pixels = this.getPixels2D();
        for (Pixel[] rowArray : pixels) {
            for (Pixel pixelObj : rowArray) {
                pixelObj.setRed(0);
                pixelObj.setGreen(0);
            }
        }
    }
    
    /**
     * Method to set blue and green to 0
     */
    public void keepOnlyRed() {
        Pixel[][] pixels = this.getPixels2D();
        for (Pixel[] rowArray : pixels) {
            for (Pixel pixelObj : rowArray) {
                pixelObj.setBlue(0);
                pixelObj.setGreen(0);
            }
        }
    }
    
    /**
     * Method to set red and blue to 0
     */
    public void keepOnlyGreen() {
        Pixel[][] pixels = this.getPixels2D();
        for (Pixel[] rowArray : pixels) {
            for (Pixel pixelObj : rowArray) {
                pixelObj.setRed(0);
                pixelObj.setBlue(0);
            }
        }
    }
    
    /**
     * Method to invert all colors
     */
    public void negate() {
        Pixel[][] pixels = this.getPixels2D();
        for (Pixel[] rowArray : pixels) {
            for (Pixel pixelObj : rowArray) {
                pixelObj.setRed(255 - pixelObj.getRed());
                pixelObj.setGreen(255 - pixelObj.getGreen());
                pixelObj.setBlue(255 - pixelObj.getBlue());
            }
        }
    }
    
    /**
     * Method to convert to grayscale
     */
    public void grayscale() {
        Pixel[][] pixels = this.getPixels2D();
        for (Pixel[] rowArray : pixels) {
            for (Pixel pixelObj : rowArray) {
                int[] col = {pixelObj.getRed(), pixelObj.getGreen(), pixelObj.getBlue()};
                int avg = (col[0] + col[1] + col[2])/3;
                pixelObj.setRed(avg);
                pixelObj.setGreen(avg);
                pixelObj.setBlue(avg);
                
            }
        }
    }

    /**
     * Method that mirrors the picture around a vertical mirror in the center of
     * the picture from left to right
     */
    public void mirrorVertical() {
        Pixel[][] pixels = this.getPixels2D();
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        int width = pixels[0].length;
        for (int row = 0; row < pixels.length; row++) {
            for (int col = 0; col < width / 2; col++) {
                leftPixel = pixels[row][col];
                rightPixel = pixels[row][width - 1 - col];
                rightPixel.setColor(leftPixel.getColor());
            }
        }
    }
    
    /**
     * Method that mirrors the picture around a vertical mirror in the center of
     * the picture from right to left
     */
    public void mirrorVerticalRightToLeft() {
        Pixel[][] pixels = this.getPixels2D();
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        int width = pixels[0].length;
        for (int row = 0; row < pixels.length; row++) {
            for (int col = 0; col < width / 2; col++) {
                leftPixel = pixels[row][col];
                rightPixel = pixels[row][width - 1 - col];
                leftPixel.setColor(rightPixel.getColor());
            }
        }
    }

    /**
     * Method that mirrors the picture around a horizontal mirror in the center 
     * of the picture from top to bottom
     */
    public void mirrorHorizontal() {
        Pixel[][] pixels = this.getPixels2D();
        Pixel topPixel = null;
        Pixel botPixel = null;
        int height = pixels.length;
        for (int row = 0; row < height / 2; row++) {
            for (int col = 0; col < pixels[0].length; col++) {
                topPixel = pixels[row][col];
                botPixel = pixels[height - 1 - row][col];
                botPixel.setColor(topPixel.getColor());
            }
        }
    }
    
    /**
     * Method that mirrors the picture around a diagonal mirror in the center of
     * the picture from bottom left to top right
     */
    public void mirrorDiagonal() {
        Pixel[][] pixels = this.getPixels2D();
        Pixel topPixel = null;
        Pixel botPixel = null;
        int minDim = Math.min(pixels.length, pixels[0].length);
        for (int row = 0; row < minDim; row++) {
            for (int col = 0; col < row; col++) {
                topPixel = pixels[row][col];
                botPixel = pixels[col][row];
                botPixel.setColor(topPixel.getColor());
            }
        }
    }
    
    /**
     * Mirror just part of a picture of a temple
     */
    public void mirrorTemple() {
        int mirrorPoint = 276;
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        int count = 0;
        Pixel[][] pixels = this.getPixels2D();

        // loop through the rows
        for (int row = 27; row < 97; row++) {
            // loop from 13 to just before the mirror point
            for (int col = 13; col < mirrorPoint; col++) {

                leftPixel = pixels[row][col];
                rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
                rightPixel.setColor(leftPixel.getColor());
                count++;
            }
        }
        System.out.println(count);
    }
    
    /**
     * Mirror a snowman's arms
     */
    public void mirrorArms() {
        int mirrorPoint = 195;
        Pixel topPixel = null;
        Pixel botPixel = null;
        Pixel[][] pixels = this.getPixels2D();

        // loop through the rows
        for (int row = 159; row < mirrorPoint; row++) {
            // loop from 13 to just before the mirror point
            for (int col = 239; col < 293; col++) {

                topPixel = pixels[row][col];
                botPixel = pixels[mirrorPoint - row + mirrorPoint][col];
                botPixel.setColor(topPixel.getColor());
            }
        }
        
        // loop through the rows
        for (int row = 159; row < mirrorPoint; row++) {
            // loop from 13 to just before the mirror point
            for (int col = 105; col < 170; col++) {

                topPixel = pixels[row][col];
                botPixel = pixels[mirrorPoint - row + mirrorPoint][col];
                botPixel.setColor(topPixel.getColor());
            }
        }
    }
    
    /**
     * Mirror a gull
     */
    public void mirrorGull() {
        int mirrorPoint = 350;
        Pixel leftPixel = null;
        Pixel rightPixel = null;
        int count = 0;
        Pixel[][] pixels = this.getPixels2D();

        // loop through the rows
        for (int row = 235; row < 328; row++) {
            // loop from 13 to just before the mirror point
            for (int col = 238; col < mirrorPoint; col++) {

                leftPixel = pixels[row][col];
                rightPixel = pixels[row][mirrorPoint - col + mirrorPoint];
                rightPixel.setColor(leftPixel.getColor());
                count++;
            }
        }
        System.out.println(count);
    }
    
    /**
     * Copy a part of another picture
     * @param image the picture to copy from
     * @param x1 x-coordinate of the top left corner of the copied area
     * @param y1 y-coordinate of the top left corner of the copied area
     * @param x2 x-coordinate of the bottom right corner of the copied area
     * @param y2 y-coordinate of the bottom right corner of the copied area
     * @param dx x-coordinate of the top left corner of the area to copy to
     * @param dy y-coordinate of the top left corner of the area to copy to
     */
    public void copy(Picture image, int x1, int y1, int x2, int y2, int dx, int dy) {
        Pixel fromPixel = null;
        Pixel toPixel = null;
        Pixel[][] pixels = this.getPixels2D();
        Pixel[][] copyFrom = image.getPixels2D();

        // loop through the rows
        for (int row = y1; row < y2; row++) {
            // loop from 13 to just before the mirror point
            for (int col = x1; col < x2; col++) {
                fromPixel = copyFrom[row][col];
                toPixel = pixels[dy + row - y1][dx + col - x1];
                toPixel.setColor(fromPixel.getColor());
            }
        }
    }
    
    
    /**
     * copy from the passed fromPic to the specified startRow and startCol in
     * the current picture
     *
     * @param fromPic the picture to copy from
     * @param startRow the start row to copy to
     * @param startCol the start col to copy to
     */
    public void copy(Picture fromPic,
            int startRow, int startCol) {
        Pixel fromPixel = null;
        Pixel toPixel = null;
        Pixel[][] toPixels = this.getPixels2D();
        Pixel[][] fromPixels = fromPic.getPixels2D();
        for (int fromRow = 0, toRow = startRow;
                fromRow < fromPixels.length
                && toRow < toPixels.length;
                fromRow++, toRow++) {
            for (int fromCol = 0, toCol = startCol;
                    fromCol < fromPixels[0].length
                    && toCol < toPixels[0].length;
                    fromCol++, toCol++) {
                fromPixel = fromPixels[fromRow][fromCol];
                toPixel = toPixels[toRow][toCol];
                toPixel.setColor(fromPixel.getColor());
            }
        }
    }

    /**
     * Method to create a collage of several pictures
     */
    public void createCollage() {
        Picture flower1 = new Picture("flower1.jpg");
        Picture flower2 = new Picture("flower2.jpg");
        this.copy(flower1, 0, 0);
        this.copy(flower2, 100, 0);
        this.copy(flower1, 200, 0);
        Picture flowerNoBlue = new Picture(flower2);
        flowerNoBlue.zeroBlue();
        this.copy(flowerNoBlue, 300, 0);
        this.copy(flower1, 400, 0);
        this.copy(flower2, 500, 0);
        this.mirrorVertical();
        this.write("collage.jpg");
    }
    
    /**
     * Method to create another collage of several pictures
     */
    public void myCollage() {
        Picture door = new Picture("thruDoor.jpg");
        Picture island = new Picture("cumberlandIsland.jpg");
        door.keepOnlyRed();
        this.copy(door, 0, 0);
        island.zeroBlue();
        this.copy(island, 144, 192, 326, 523, 144, 192);
        Picture robot = new Picture("robot.jpg");
        robot.mirrorVertical();
        this.copy(robot, 450, 210);
        Picture kitten = new Picture("kitten2.jpg");
    }

    /**
     * Method to show large changes in color
     *
     * @param edgeDist the distance for finding edges
     */
    public void edgeDetection(int edgeDist) {
        Pixel thisPixel = null;
        Pixel rightPixel = null;
        Pixel botPixel = null;
        Pixel[][] pixels = this.getPixels2D();
        Color rightColor = null;
        Color botColor = null;
        for (int row = 0; row < pixels.length - 1; row++) {
            for (int col = 0;
                    col < pixels[0].length - 1; col++) {
                thisPixel = pixels[row][col];
                rightPixel = pixels[row][col + 1];
                botPixel = pixels[row + 1][col];
                rightColor = rightPixel.getColor();
                botColor = botPixel.getColor();
                if (thisPixel.colorDistance(rightColor) > edgeDist ||
                        thisPixel.colorDistance(botColor) > edgeDist) {
                    thisPixel.setColor(Color.BLACK);
                } else {
                    thisPixel.setColor(Color.WHITE);
                }
            }
        }
        
    }

    /* Main method for testing - each class in Java can have a main 
     * method 
     */
    public static void main(String[] args) {
        Picture beach = new Picture("beach.jpg");
        beach.explore();
        beach.zeroBlue();
        beach.explore();
    }

} // this } is the end of class Picture, put all new methods before this
