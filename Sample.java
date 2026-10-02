public class Sample {
    public static void main(String[] args) {

        // 点数を入れる
        int score = 75;

        // 点数を表示
        System.out.println("点数は " + score + " 点です。");

        // 合格・不合格を判定
        if (score >= 60) {
            System.out.println("合格です！");
        } else {
            System.out.println("不合格です。");
        }
    }
}

// Here is an implementation of the selection sort algorithm in Java
public class SelectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // 一番小さな要素を見つける
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // 最小要素を現在の位置に交換
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("ソートする前: " + Arrays.toString(arr));
        selectionSort(arr);
        System.out.println("ソートした後: " + Arrays.toString(arr));
    }
}
