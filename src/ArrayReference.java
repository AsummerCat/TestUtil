import java.util.Arrays;

/**
 * @author cxc
 * @date 2018/10/14 15:09
 * 数组引用
 * 创建两个数组 第一个初始化 第二个引用第一个数组
 * int数组中创建的变量 会被复制 还是引用同一个?
 * 要 完全复制一份的话 可以 使用
 * 1. System.arraycopy(原数组,起始位置,新数组,新数组起始位置,复制的长度)
 * 2. int[] arrNow2 = Arrays.copyOf(arr, arr.length)
 */
public class ArrayReference {
    public static void main(String[] args){
        test();
    }


    /**
     * 创建两个数组 第一个初始化 第二个引用第一个数组
     * int数组中创建的变量 会被复制 还是引用同一个?
     */
    private static void  test(){
        //原数组
        int[] arr={1,2,3,4};
        //新数组   指向原数组
        int[] arrNow=arr;
        //全新的数组
        int[] arrNow1=new int[4];

        //首先遍历一下原来的数组
        System.out.println("原来的数组arr:");
        for (int i : arr) {
            System.out.print(i+",");
        }
        System.out.println();


        System.out.println("遍历数组arrNow:");
        for (int i : arrNow) {
            System.out.print(i+",");
        }
        System.out.println();


        System.arraycopy(arr,0,arrNow1,0,arr.length);
        System.out.println("遍历数组arrNow1:");
        for (int i : arrNow1) {
            System.out.print(i+",");
        }
        System.out.println();

        System.out.println("遍历数组arrNow2:");
        int[] arrNow2 = Arrays.copyOf(arr, arr.length);
        for (int i : arrNow2) {
            System.out.print(i+",");
        }
        System.out.println();


        //修改原来的数组中的值
        System.out.println("修改原数组中的第二个值改为 0");
        arr[1]=0;
        System.out.println();


        //遍历一下新的数组
        System.out.println("重新遍历数组arrNow:");
        for (int i : arrNow) {
            System.out.print(i+",");
        }
        System.out.println();

        System.out.println("重新遍历数组arrNow1:");
        for (int i : arrNow1) {
            System.out.print(i+",");
        }
        System.out.println();

        System.out.println("重新遍历数组arrNow2:");
        for (int i : arrNow2) {
            System.out.print(i+",");
        }
        System.out.println("");

        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("结论可知, 如果仅仅只是指向原数组的话 那么原数组被改变 指向的那个也对应被改变 ");
        System.out.println("          如果要重新弄出一个数组 不指向的话 可以使用以下两个方法 ");
        System.out.println("1.         System.arraycopy(原数组,起始位置,新数组,新数组起始位置,复制的长度)");
        System.out.println("2.         int[] arrNow2 = Arrays.copyOf(arr, arr.length)");
        System.out.println("---------------------------------------------------------------------------------");


    }


}

