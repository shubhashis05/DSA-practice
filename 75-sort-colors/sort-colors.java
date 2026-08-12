class Solution {
    public void sortColors(int[] arr) {
        int[] count = new int[3];

        for (int x : arr) {
            count[x]++;
        }

        int i = 0;

        for (int c = 0; c < 3; c++) {
            for (int j = 0; j < count[c]; j++) {
                arr[i++] = c;
            }
        }
    }
}