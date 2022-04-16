public class GreatestCommonDivisor {
    public static int CommonDivisor(int num1, int num2) {
        //This is bigger than zero condition
        if(num1>0&&num2>0){
            //this will be our limit for for loop
            int small =0;
            //this is our common divisor
            int common=0;
            //this if statement determines which number is smaller
            if(num1>num2){
                small = num2;
            }
            else{
                small=num1;
            }
            //for loop for common divisor
            for(int i =1;i<small+1;i++){
                //if number one and number two divided by i and result is 0 this is our common divisor
                if(num1%i==0&&num2%i==0){
                    common = i;
                }
                else;}
            return common;
             }
        //if our number or numbers smaller than zero method will return 0
        else {return 0;}
    }

    public static void main (String[] args) {
        System.out.println(CommonDivisor(36,72));
    }

}
