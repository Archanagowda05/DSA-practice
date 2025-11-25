public class LinearSearch {
    public static void main(String[] args) {
        int arr[] = { 10, 42, 23, 14, 51, 64, 79 };
        int key = 5;
        int flag = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                flag = i;
                break;
            }

        }
        if (flag != -1)
            System.out.println("The " + key + " is present in " + flag + "th index");
        else
            System.out.println("key " + key + " not found");
    }

}
