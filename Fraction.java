public class Fraction
{
   // Put instance variables here
   private int num;
   private int den;
   // Constructors
   public Fraction(int num, int den){
       this.num = num;
       this.den = den;
   }
   
   public Fraction(int number){ // Creates fraction number/1
       num = number;
       den = 1;
   }
   
   public Fraction(Fraction f){
       f.num = num;
       f.den = den;
   }
   
   public int getNum(){
       return this.num;
   }
   
   public int getDen(){
       return this.den;
   }
   
   public String toString(){
       return "" + num + "/" + den;
   }
   
   public boolean equals(Fraction f){
       Fraction frac = new Fraction(this.num,this.den);
       frac.simplify();
       f.simplify();
       
       return frac.num==f.num&&frac.den==f.den;
   }
   public Fraction add(Fraction f){
       // Add f to your fraction return new 
       this.num = (this.num*f.den)+(this.den*f.num);
       this.den = this.den*f.den;
       return new Fraction(this.num,this.den); // So it compiles
   }
    
   public Fraction subtract(Fraction f){
       this.num = (this.num*f.den)-(this.den*f.num);
       this.den = this.den*f.den;
       return new Fraction(this.num,this.den);
   }
   
   public Fraction multiply(Fraction f){
       this.num = this.num*f.num;
       this.den = this.den*f.den;
       return new Fraction(this.num,this.den);
   }
   
   public Fraction divide(Fraction f){
       this.num = this.num*f.den;
       this.den = this.den*f.num;
       return new Fraction(this.num,this.den);
   }
   
   public void simplify(){
       
       int biggerNum = 0;
       int gcd = 1;
       if(this.num>this.den){biggerNum = this.num;}
       if(this.den>this.num){biggerNum = this.den;}
       for(int i = biggerNum; i >= 2; i--){
          if(this.num%i==0&&this.den%i==0){
            gcd = i;
            break;
        }
       }
       this.num /= gcd;
       this.den /= gcd;
   }
   // Simplifies the fraction, for example 2/4 becomes 1/2    
   public static void main(String[] args){
       System.out.println("\f");
       
       Fraction myFraction = new Fraction(2,6);
       System.out.println("Numerator: " + myFraction.getNum() + "\nDenominator: " + myFraction.getDen());
       System.out.println(myFraction.toString());
       myFraction.simplify();
       System.out.println(myFraction.toString());
       
       Fraction addition = new Fraction (1,2);
       myFraction.add(addition);
       myFraction.simplify();
       System.out.println(myFraction.toString());
       
       Fraction subtraction = new Fraction(1,3);
       myFraction.subtract(subtraction);
       System.out.println(myFraction.toString());
       myFraction.simplify();
       System.out.println(myFraction.toString());
       
       Fraction multiplication = new Fraction(5,10);
       myFraction.multiply(multiplication);
       System.out.println(myFraction.toString());
       myFraction.simplify();
       System.out.println(myFraction.toString());
       
       Fraction division = new Fraction(3,2);
       myFraction.divide(division);
       System.out.println(myFraction.toString());
       myFraction.simplify();
       System.out.println(myFraction.toString());
       
       Fraction equality = new Fraction(3,18);
       Fraction inequality = new Fraction(5,10);
       System.out.println(myFraction.equals(equality));
       System.out.println(myFraction.equals(inequality));
    }
}
