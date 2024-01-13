package Polynomial;

public class Polynomial {
   private int degCoeff[];
    Polynomial(){
        degCoeff=new int[10];
    }
    public void setDegreeCoefficients(int degree,int coeff){
        if(degree>degCoeff.length-1){
            int temp[]=degCoeff;
            degCoeff=new int[degree+1];
            for(int i=0;i<temp.length;i++){
                degCoeff[i]=temp[i];
            }
        }
        degCoeff[degree]=coeff;
    }

    public Polynomial add(Polynomial p){
        Polynomial ans=new Polynomial();
        int len1=this.degCoeff.length;
        int len2=p.degCoeff.length;
        int min=Math.min(len1,len2);
        int i=0;
        for(;i<min;i++){
            ans.setDegreeCoefficients(i,this.degCoeff[i]+p.degCoeff[i]);
        }
        while(i<len1){
            ans.setDegreeCoefficients(i,this.degCoeff[i]);
            i++;
        }

        while(i<len2){
            ans.setDegreeCoefficients(i,p.degCoeff[i]);
            i++;
        }

        return ans;
    }
    public Polynomial sub(Polynomial p){
        Polynomial ans=new Polynomial();
        int len1=this.degCoeff.length;
        int len2=p.degCoeff.length;
        int min=Math.min(len1,len2);
        int i=0;
        for(;i<min;i++){
            ans.setDegreeCoefficients(i,this.degCoeff[i]-p.degCoeff[i]);
        }
        while(i<len1){
            ans.setDegreeCoefficients(i,this.degCoeff[i]);
            i++;
        }

        while(i<len2){
            ans.setDegreeCoefficients(i,-p.degCoeff[i]);
            i++;
        }

        return ans;
    }

    public int getCoeff(int degree){
        if(degree>=this.degCoeff.length)
            return 0;

        return degCoeff[degree];
    }
    public Polynomial multiply(Polynomial p){
        System.out.println("It is executing");
        Polynomial ans=new Polynomial();
        for(int i=0;i<this.degCoeff.length;i++){
            for(int j=0;j< p.degCoeff.length;j++) {
                if (this.degCoeff[i] != 0 && p.degCoeff[j] != 0) {
                    int degree = i + j;
                    if (degree >= ans.degCoeff.length) {
                        int temp[] = new int[ans.degCoeff.length*2];
                        for(int z=0;z< ans.degCoeff.length;z++){
                            temp[z]= ans.degCoeff[z];
                        }
                        ans.degCoeff = temp;
                    }
                    int value = this.degCoeff[i] * p.degCoeff[j];
                    int first = ans.getCoeff(degree);
                    ans.setDegreeCoefficients(degree, first + value);
                }
            }
        }

        return ans;
    }
    public void print(){
        for(int i=this.degCoeff.length-1;i>=0;i--){
            if(degCoeff[i]!=0){
                if (i == 0) {
                    System.out.print(degCoeff[i]);
                } else {
                    System.out.print(  degCoeff[i] + "x^" + i +" + ");
                }
            }

        }
        System.out.println();
    }

}
