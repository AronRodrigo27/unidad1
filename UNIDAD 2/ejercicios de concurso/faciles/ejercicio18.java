public class ejercicio18 {
    public static int numberOfBoomerangs(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] == arr[i + 2] && arr[i] != arr[i + 1]) {
                System.out.println("[" + arr[i] + ", " + arr[i + 1] + ", " + arr[i + 2] + "]");
                count++;
            }
        }
        return count;
    }
}
