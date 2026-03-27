class Solution {
    public int[] plusOne(int[] digits) {
        int arrLength = digits.length;
        for (int i = arrLength - 1; i >= 0 ;i--){
            if(digits[i] < 9){
                digits[i] = digits[i] + 1;
                return digits;
            }  else if(digits[i] == 9){
                if(i == 0){
                    digits[i] = 0;
                    int[] temp = new int[arrLength + 1];
                    temp[0] = 1;
                    for (int j = 0; j < arrLength; j++) {
                        temp[j + 1] = digits[j];
                    }
                    digits = temp;
                }else{
                    digits[i] = 0;
                }

            }
        }
        return digits;
    }
}