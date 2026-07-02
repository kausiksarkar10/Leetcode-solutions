import java.util.Arrays;
class PlusOne {
    static void main(){
        int[] digits={4,6,4};
        System.out.print(Arrays.toString(plusone(digits)));

    }
    static int[] plusone(int[] digits){
        int n=digits.length-1;
        for(int i=n;i>=0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int[] newNumber = new int[digits.length + 1];
        newNumber[0]=1;
        return newNumber;
    }
}
