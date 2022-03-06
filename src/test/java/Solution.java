public class Solution {


    public static void main(String args[]){


        String st=        "   -42";

      int i=  myAtoi(st);
      System.out.println(i);
    }

    public static int myAtoi(String s) {

        s= s.trim();
        double ans=0;
        boolean isNeg=false;
        int startIdx=0;
        if(s.charAt(startIdx)=='+')
            startIdx++;
    else if( s.charAt(startIdx)=='-'){
            startIdx++;
            isNeg=true;
        }

        for(int m=startIdx;m<s.length();m++){

            int i=s.charAt(m)-'0';
            if(i>9 || i<0){
                break;
            }
            else if(i<=9 && i>=0)
            {
                ans= ans*10 + i;
            }
            else if (s.charAt(m)=='-')
                isNeg=true;

        }
        if(ans>Integer.MAX_VALUE )return Integer.MAX_VALUE;
        else if (ans<Integer.MIN_VALUE) return  Integer.MIN_VALUE;

        return isNeg? (int)(0-ans): (int)(ans);

    }
}
