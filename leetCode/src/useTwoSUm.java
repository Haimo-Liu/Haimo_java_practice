public class useTwoSUm {
    public static void main(String args[]){
        twoSum test = new twoSum();
        int[] int_input = {2,7,11,15,13,21};

        int[] result = test.findTwoSum(int_input, 13);

        System.out.print("the two indices are " + result[0] + " and " + result[1]);


    }
}
