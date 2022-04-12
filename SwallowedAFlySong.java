// Jordan Rabold 
// 1/11/22 
// CPW 142 
// Assignment #1 
// 
// This program will break down each verse into seperate methods
// to eliminate redundancy. 


//First I lay out each verse in main 
public class SwallowedAFlySong {
    public static void main( String[] args ) {
     
        firstVerse();
        System.out.println();
        
        secondVerse();
        System.out.println();
        
        thirdVerse();
        System.out.println();
        
        fourthVerse();
        System.out.println();
        
        fifthVerse();
        System.out.println();
        
        sixthVerse();
        System.out.println();
        
        seventhVerse();
        System.out.println();
        
        eigthVerse();
        System.out.println();
        
    }
    
// Next I created the lyrics for each verse 
   
    public static void firstVerse(){
        System.out.println("There was an old lady who swallowed a fly.");
        perhapsDie();
    }
    
    public static void secondVerse(){
        System.out.println("There was an old lady who swallowed a spider,");
        swallowedSpider();
    }
 
    public static void thirdVerse(){ 
        System.out.println("There was an old lady who swallowed a bird;"); 
        System.out.println("How absurd, to swallow a bird!"); 
        swallowedBird();
        swallowedSpider();
    }
        
    public static void fourthVerse(){
        System.out.println("There was an old lady who swallowed a cat."); 
        System.out.println("Imagine that, she swallowed a cat."); 
        swallowedCat(); 
        swallowedSpider();
    }
        
    public static void fifthVerse(){
        System.out.println("There was an old lady who swallowed a dog."); 
        System.out.println("What a hog! To swallow a dog!"); 
        swallowedDog(); 
        swallowedSpider();
    }
        
    public static void sixthVerse(){
        System.out.println("There was an old lady who swallowed a goat."); 
        System.out.println("Just opened her throat and swallowed a goat!"); 
        swallowedGoat(); 
        swallowedSpider();
    }
        
    public static void seventhVerse(){
        System.out.println("There was an old lady who swallowed a cow."); 
        System.out.println("I don't know how she swallowed a cow!"); 
        swallowedCow(); 
        swallowedSpider();
    }
        
    public static void eigthVerse(){
        System.out.println("There was an old lady who swallowed a horse -");
        System.out.println("She's dead, of course."); 
    }

//Lastly, I broke down each verse into a seperate method and called them into eachother to eliminate redundancy in the lyrics.
 
    public static void swallowedSpider(){
        System.out.println("That wiggled and wiggled and tickled inside her.");
        System.out.println("She swallowed the spider to catch the fly.");
        perhapsDie();
    }
    
    public static void perhapsDie(){
        System.out.println("I dunno why she swallowed that fly");
        System.out.println("Perhaps she'll die.");
    }
    
    public static void swallowedBird(){
        System.out.println("She swallowed the bird to catch the spider");
    }
    
    public static void swallowedCat(){
        System.out.println("She swallowed the cat to catch the bird");
        swallowedBird();
    }
    
    public static void swallowedDog(){
        System.out.println("She swallowed the dog to catch the cat");
        swallowedCat();
    }
    
    public static void swallowedGoat(){
        System.out.println("She swallowed the goat to catch the dog");
        swallowedDog();
    }
    
    public static void swallowedCow(){
        System.out.println("She swallowed the cow to catch the goat");
        swallowedGoat();
    }
}