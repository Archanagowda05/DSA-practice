public class findUnique {
    public int findUnique(int[] arr) {
        int xor=0;
        for (int i=0;i<arr.length;i++){
            xor^=arr[i];
        }
        return xor;
    }
}
