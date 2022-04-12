import java.util.*;

// Jordan Rabold
// CPW 142 
// Programming Assignment 3
// 1/25/22
// This program will estimate the cost of painting a certain amount of square feet given by the user. 

public class PaintJobEstimator {
    // square feet per one gallon of paint.
    public static final double AREA_PER_GALLON = 112.0;
     
    // hours of labor needed to paint AREA_PER_GALLON square feet.
    public static final double HOURS_PER_UNIT_AREA = 8.0;
    
    // charge to customer for one hour of labor.
    public static final double LABOR_COST_PER_HOUR = 35.0;
    
    public static void main( String[] args ) {
    
        Scanner console = new Scanner( System.in );
    
        double sqft = getSqFt(console);
        
        double gallonCost = getGallonCost(console);
         
        // First, how many gallons of paint do we need?
        int numGallons = calculateGallons(sqft);
        
        // How much will the paint cost?
        double paintCost = calculatePaintCost(numGallons, 
                                            gallonCost);
        
        // How long will the job take?
        double numberOfHours = calculateHours(sqft);
        
        // How much will the labor cost?
        double laborCost = calculateLaborCost(numberOfHours);
        
        // What's the total bill?
        double totalCost = calculateTotalCost(paintCost, 
                                            laborCost);
        
        // Print the results.
        generateReport(sqft, gallonCost, numGallons, numberOfHours, 
                        paintCost, laborCost, totalCost);
    }
    
    Scanner console = new Scanner( System.in );
        
    // How many square feet do we need to paint?
    public static double getSqFt( Scanner console ){
        System.out.print("Enter number of square feet: ");
        double sqft = console.nextDouble();
        return sqft;
    }
        
    // How much does a gallon of paint cost?
    public static double getGallonCost( Scanner console ){ 
        System.out.print("Enter price of a gallon of paint: ");
        double gallonCost = console.nextDouble();
        return gallonCost;
    }
    
    // calculateGallons
    public static int calculateGallons(double sqft) {
        int numGallons = (int) Math.ceil( sqft / AREA_PER_GALLON );
        return numGallons;
    }
        
    // calculatePaintCost
    public static double calculatePaintCost(int numGallons, double gallonCost) {
        double paintCost = (numGallons * gallonCost);
        return paintCost;
    }
    
    // calculateHours
    public static double calculateHours(double sqft) {
        double numberOfHours = (int) Math.ceil( sqft / AREA_PER_GALLON) * HOURS_PER_UNIT_AREA;
        return numberOfHours;
    }
    
    // calculateLaborCost
    public static double calculateLaborCost(double numberOfHours){
        double laborCost = (numberOfHours * LABOR_COST_PER_HOUR);
        return laborCost;
    }
    
    // calculateTotalCost
    public static double calculateTotalCost(double laborCost, double paintCost){
        double totalCost = (laborCost + paintCost);
        return totalCost;
    }
    
    // generateReport 
    public static void generateReport(double sqft,
                                      double gallonCost,
                                      int numGallons,
                                      double numberOfHours,
                                      double paintCost,
                                      double laborCost,
                                      double totalCost
                                      ){
        System.out.println("To paint " + sqft + " square feet, with");
        System.out.println("paint that costs " + gallonCost + " per gallon,");
        System.out.println("you will need " + numGallons + " gallons of paint");
        System.out.println("and " + numberOfHours + " hours of labor");
        System.out.println("The cost of the paint is: " + paintCost);
        System.out.println("The cost of labor is: " + laborCost);
        System.out.println("The total cost of the job is: " + totalCost);
    }
    
}
