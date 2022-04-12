// Jordan Rabold
// 1/18/22
// CPW 142
// Assignment #2

//This program is designed to use nested for loops to print a rocket.
//I first split up each section of the rocket.
//Then made nested for loops for each of the sections.
//then I called those nested for loops at the top to print them wihtout redundancy. 

public class RocketShip {
    public static final int ROCKET_SIZE = 3;
    
    public static void main( String[] args ) {
        printNoseCone();
        printBody();
        printNozzle();
    }

    public static void printNozzle() {
        printNoseCone();
    }
    
    //Printing the nose cone of the rocket and reusing 
    //this code for the bottom nozzle of the rocket. 
    public static void printNoseCone() {
        for (int row = 1; row <= ROCKET_SIZE + 2; row++){
            
            //Printing spaces
            for (int spaces = 1; spaces <= (-1 * row +(2*ROCKET_SIZE)); spaces++){
                System.out.print(" ");
            }
            
            //Printing forward slashes
            for (int fSlashes = 1; fSlashes <= row; fSlashes++){
                System.out.print("/");
            }
            
            //Printing **
            System.out.print("**");
            
            //Printing backslashes
            for(int bSlashes = 1; bSlashes <= row; bSlashes++){
                System.out.print("\\");
            }
            
            System.out.println();
         }
     }
    
    //Printing the body of the rocket by calling 
    //Edge, Diamond Top, and Diamond Bottom. 
    public static void printBody() {
        printEdge();
        printDiamondTop();
        printDiamondBottom();        
        printEdge();
        printDiamondBottom();        
        printDiamondTop();
        printEdge();        
    }
    
    //Printing the top diamond for the top half of the body.
    public static void printDiamondTop() {
        for (int row = 1; row <= 3; row++){
            
            //Printing lines
            for (int line = 1; line <= 1; line++){
                System.out.print("|");
            }
            
            //Printing dots
            for (int dot = 1; dot <= (-1 * row + ROCKET_SIZE); dot++){
                System.out.print(".");
            }
            
            //Printing triangles
            for (int triangle = 1; triangle <= row; triangle++){
                System.out.print("/\\");
            }
            
            //Printing dots
            for (int dot = 1; dot <= (-1 * row + ROCKET_SIZE); dot++){
                System.out.print(".");
            }
            
            //Printing dots
            for (int dot = 1; dot <= (-1 * row + ROCKET_SIZE); dot++){
                System.out.print(".");
            }
            
            //Printing triangles
            for (int triangle = 1; triangle <= row; triangle++){
                System.out.print("/\\");
            }
            
            //Printing dots
            for (int dot = 1; dot <= (-1 * row + ROCKET_SIZE); dot++){
                System.out.print(".");
            }
            
            //Printing lines
            for (int line = 1; line <= 1; line++){
                System.out.print("|");
            }

            System.out.println();
        }
    }
    
    //Printing the bottom diamond for the bottom half of the body.
    public static void printDiamondBottom() {
        for (int row = 1; row <= 3; row++){
            
            //Printing lines
            for (int line = 1; line <= 1; line++){
                System.out.print("|");
            }
            
            //Printing dots
            for (int dots = 1; dots <= (1 * row - (ROCKET_SIZE - 2)); dots++){
                System.out.print(".");
            }
            
            //Printing triangles
            for (int triangle = 1; triangle <= (-1 * row + (ROCKET_SIZE + 1)); triangle++){
                System.out.print("\\/");
            }
            
            //Printing dots
            for (int dots = 1; dots <= (1 * row - (ROCKET_SIZE - 2)); dots++){
                System.out.print(".");
            }
            
            //Printing dots
            for (int dots = 1; dots <= (1 * row - (ROCKET_SIZE - 2)); dots++){
                System.out.print(".");
            }
            
            //Printing triangles
            for (int triangle = 1; triangle <= (-1 * row + (ROCKET_SIZE + 1)); triangle++){
                System.out.print("\\/");
            }
            
            //Printing dots
            for (int dots = 1; dots <= (1 * row - (ROCKET_SIZE - 2)); dots++){
                System.out.print(".");
            }
            
            //Printing lines
            for (int line = 1; line <= 1; line++){
                System.out.print("|");
            }
            
            System.out.println();
        }
    }
    
    //Printing the edge of the rocket using System out
    public static void printEdge() {
        for (int edge = 1; edge <= 1; edge++){
            System.out.println("+=*=*=*=*=*=*+");
        }
        
    }
}