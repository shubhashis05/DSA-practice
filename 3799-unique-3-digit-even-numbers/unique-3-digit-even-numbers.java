class Solution {
    public int totalNumbers(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr.length; j++) {

                if (j == i) continue;

                for (int k = 0; k < arr.length; k++) {

                    if (k == i || k == j) continue;

                    int num = arr[i] * 100 + arr[j] * 10 + arr[k];
                    if(num%2 == 0 && num>99) set.add(num);
                }
            }
        }
        return set.size();
    }
}