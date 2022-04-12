import java.util.*; // Scanner
import java.io.*; // File
/**
 * File: JavaJustifier
 *
 * Author: main method and verifyFile: Ken Meerdink
           justifyJava method: Jordan Rabold
 * 
 * Version: Winter 2022 CPW 142
 *
 * This program reads a file and formats it
 * according to Java standards for indenting.
 *
 */
public class JavaJustifier {
    public static void main( String[] args ) 
               throws FileNotFoundException {
    
        final int TAB_SIZE = 4; // sets the level of indent
        
        for( int i = 1; i < 6; i++ ) {
            String inputFileName = "Test" + i + ".java";
            String outputFileName = "Justified" + i + ".txt";
            String referenceFileName = "JustifiedReference" + i + ".txt";
            justifyJava( inputFileName, 
                         outputFileName, 
                         TAB_SIZE );
            
            // after you get justifyJava running,
            // uncomment the code below to verify your work
            boolean success = verifyFile(outputFileName, referenceFileName);

            if ( success ) {
                System.out.println( "Success for file " + i );
            }
            else {
                System.out.println( "Failure for file " + i );
            }
        }              
    }
    
    /**
     * This method takes a java file with a balanced set of open and 
     * close curly braces, { and }, and formats the file to have a proper
     * indentation of code.
     *
     * @param inputFileName the name of the file to be processed
     * @param outputFileName the name of the file that results
     * @param tabSize the number of spaces for a level of indent
     *
     */
    public static void justifyJava( String inputFileName, String outputFileName, 
                                    int tabSize ) throws FileNotFoundException {
               
        // set the tab value
        String oneTab = ""; // one tab consists of tabSize spaces
        for( int i = 0; i < tabSize; i++ ) { 
            oneTab += " ";
        }
        
        // YOUR CODE GOES HERE
        Scanner input = new Scanner(new File(inputFileName));
        PrintStream output = new PrintStream(new File(outputFileName));
        int tabCount = 0;
        while(input.hasNextLine()){
           String line = input.nextLine().trim();
         
           if(line.contains("}")){
               tabCount--;
           }
           
           for( int i = 0; i < tabCount; i++ ) {
               output.print(oneTab);
           }
           output.println(line);
              
           if(line.contains("{")){
               tabCount++;
           }       
        }
    }
                
    public static boolean verifyFile(String a, String b) 
               throws FileNotFoundException {
        String reference = new Scanner(new File(a))
                              .useDelimiter("\\Z").next();
        String justified = new Scanner(new File(b))
                              .useDelimiter("\\Z").next();
        return reference.equals( justified );
    }
}