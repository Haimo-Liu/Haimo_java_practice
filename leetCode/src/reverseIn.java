public class reverseIn {


    public long reverse(int x) {
            long rev = 0;

            while (x!=0){

                rev = rev * 10 + x % 10;
                x /= 10;
            }

            long max =  Integer.MAX_VALUE;
            long min =  Integer.MIN_VALUE;

            if(rev < max && rev > min) {
                return rev;
            } else {return 0;}
        }
    }
