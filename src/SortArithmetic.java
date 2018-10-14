import java.util.Arrays;

/**
 * @author cxc
 * @date 2018/10/14 16:11
 * <p>
 * 排序算法
 */
public class SortArithmetic {
    public static void main(String[] args) {
        //插入排序
        insertSort();

        //冒泡排序
        bubblingSort();
    }


    /**
     * 插入排序
     */
    private static void insertSort() {
        //首先创建一个数组
        int[] arr = {2, 4, 0, 5, 1};
        int n = arr.length;
        int k;//放于for循环外面是为了防止重复创建变量

        for (int i = 1; i < n; i++) {
            //取出待插入的值
            k = arr[i];
            int j; //插入位置
            //这里可能出现多次for
            for (j = i - 1; j >= 0 && arr[j] > k; j--) {
                arr[j + 1] = arr[j];
            }
            //最后给k的值赋予位置
            arr[j + 1] = k;
        }
        System.out.println("插入排序:"+Arrays.toString(arr));
    }


    /**
     * 冒泡排序
     * 循环次数:arr.length()-1
     */
    public static void bubblingSort() {
        //首先创建一个数组
        int[] arr = {6,2, 4, 0, 5, 1};
        //循环数组
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = arr.length - 1; j > i; j--) {
                if (arr[j] < arr[j - 1]) {
                    int k = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = k;
                }
            }
        }
        System.out.println("冒泡排序:"+Arrays.toString(arr));
    }


}
