
public class Fraction
{
   // Put instance variables here
   
   // Constructors
   public Fraction(int num, int den){
   }
   
   public Fraction(int number){ // Creates fraction number/1
                                // For example, new Fraction(5) == 5/1
   }
   
   public Fraction(Fraction f){
   }
   
   public int getNum(){
       return 0;
   }
   
   public int getDen(){
       return 0;
   }
   
   public String toString(){
       return "";
   }
   
   public boolean equals(){
       return true;
   }
   public Fraction add(Fraction f){
       // Add f to your fraction return new Fraction
       return new Fraction(1); // So it compiles
   }
    
   public Fraction subtract(Fraction f){
       return new Fraction(1);
   }
   
   public Fraction multiply(Fraction f){
       return new Fraction(1);
   }
   
   public Fraction divide(Fraction f){
       return new Fraction(1);
   }
   
   public void simplify(){
       // Simplifies the fraction, for example 2/4 becomes 1/2    
   }
}