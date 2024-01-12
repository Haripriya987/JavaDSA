package Fraction;

 class Fraction {
     private int numerator;
     private int denominator;
     public Fraction(int numerator,int denominator){
       setNumerator(numerator);
       setDenominator(denominator);
        simplify();
     }
     public int getNumerator() {
         return numerator;
     }

     public void setNumerator(int numerator) {

         this.numerator = numerator;
     }

     public int getDenominator() {
         return denominator;
     }

     public void setDenominator(int denominator) {
         if(numerator==0)
             return;
         if(denominator!=0) {
             this.denominator = denominator;
             simplify();
         }

     }

     public void print(){
         if(denominator!=0)
            System.out.println(numerator+" / "+denominator);
         else
         System.out.println("Check the denominator or else change the value");

     }

     private void simplify(){
         if(denominator==0)
             return;

         int gcd=getGcd(numerator,denominator);
         this.numerator=numerator/gcd;
         this.denominator=denominator/gcd;

     }
     private int getGcd(int a,int b){
         if (a == 0)
             return b;
         if (b == 0)
             return a;

         if(a==b)
             return a;

         if(a>b)
             return getGcd(a-b,b);
         return getGcd(a,b-a);
     }
     public void increment(){
        numerator=numerator+denominator;
        simplify();
        print();
     }
     public void increment(int val){
         numerator=numerator+(val*denominator);
         simplify();
         print();
     }
     public void add(int num,int dem){
//         if(dem==0)
//             return;
//         else if (this.denominator==0) {
//            this.numerator=num;
//            this.denominator=dem;
//            return;
//         }

         this.numerator=(this.numerator*dem)+(this.denominator*num);
         this.denominator=this.denominator*dem;
         simplify();
         //print();
     }
     public void add(Fraction f2){
         this.numerator=(this.numerator* f2.denominator)+(this.denominator* f2.numerator);
         this.denominator=this.denominator* f2.denominator;
         simplify();
        // print();
     }
     public static Fraction add(Fraction f1,Fraction f2){

         int a=(f1.numerator* f2.denominator)+(f1.denominator* f2.numerator);
         int b=f1.denominator* f2.denominator;
         Fraction f3=new Fraction(a,b);

         return f3;
     }
}
