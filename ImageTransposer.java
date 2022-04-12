import java.awt.*;

// Jordan Rabold
// CPW 142 Winter 2022
// Programming Assignment 9
// This program will take a picture and flip is verically in main with flipVertical. FlipVertical will
// then set an array of color[][] pixels to the drawing panel. Then we will create a for loop to build the columns
// and rows of the image, then flip them vertically with pixels[ row ][ col ] = pixels[pixels.length - 1 - row][col], 
// then we set that equal to px. A similar method was used to flip the image horizontally as well. 


/*
Write a method named flipVertical that inverts an image top to bottom 
using the following specific algorithm on a 2D array of pixels:
for each column c:
    for each row r in the top half:
        swap the pixel at (r,c) with the corresponding pixel in the bottom half
*/

public class ImageTransposer {
    public static void main(String[] args) {
        //////////// Choose any picture you like //////////////////////
        //DrawingPanel panel = new DrawingPanel( "textinjpeg.jpg" );
        DrawingPanel panel = new DrawingPanel( "dog_head.jpg" );
        
        // show picture, wait, flip. repeat.
        final int SLEEP_TIME = 250; // 1000 = one second
        final int NUM_FLIPS = 6; // should be even number to get back to original image
        
        for (int i = 0; i < NUM_FLIPS; i++) { 
            panel.sleep(SLEEP_TIME);
            flipVertical(panel );
            System.out.println("flipped vertical " + i);
        }
        
        // show picture, wait, flip. repeat.
        for (int i = 0; i < NUM_FLIPS; i++) { 
            panel.sleep(SLEEP_TIME); 
            flipHorizontal(panel );
            System.out.println("flipped horizontal " + i);
        }
        
        System.out.println("done.");
        
    }
    
    // given a DrawingPanel, get a 2D array of colors
    // flip the array
    // refresh the DrawingPanel with the updated image
    public static void flipVertical(DrawingPanel panel) {
        Color[][] pixels = panel.getPixels();
        for ( int row = 0; row < pixels.length / 2; row++ ) {
            for ( int col = 0; col < pixels[ row ].length; col++ ) {
                Color px = pixels[ row ][ col ];
                pixels[ row ][ col ] = pixels[pixels.length - 1 - row][col];
                pixels[pixels.length - 1 - row][col] = px;
            } 
        }
        panel.setPixels( pixels );
    }
    
    // EXTRA CREDIT
    public static void flipHorizontal(DrawingPanel panel) {
        Color[][] pixels = panel.getPixels();
        for ( int row = 0; row < pixels.length; row++ ) {
            for ( int col = 0; col < pixels[ row ].length / 2; col++ ) {
                int opposite = pixels[ row ].length - 1 - col;
                Color px = pixels[ row ][ col ];
                pixels[ row ][ col ] = pixels[ row ][ opposite ];
                pixels[ row ][ opposite ] = px;
            } 
        }
        panel.setPixels( pixels );
    }
}