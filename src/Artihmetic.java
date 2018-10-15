/**
 * @author cxc
 * @date 2018/10/15 22:02
 * 算法的好处:
 */
public class Artihmetic {
    public static void main(String[] args) {
        System.out.println("-----------------------------------------");

        Long oldTime = System.currentTimeMillis();
        System.out.println("oneByOneLoop开始" + oldTime);
        oneByOneLoop();
        Long oldsTime = System.currentTimeMillis();
        System.out.println("oneByOneLoop结束" + oldsTime);
        Long avgOldTime = oldsTime - oldTime;
        System.out.println("oneByOneLoop运行时长" + avgOldTime + "毫秒");
        System.out.println("-----------------------------------------");
        Long nowTime = System.currentTimeMillis();
        System.out.println("oneTimeLoop开始" + nowTime);
        oneTimeLoop();
        Long nowsTime = System.currentTimeMillis();
        System.out.println("oneTimeLoop结束" + nowsTime);
        Long avgNowTime = nowsTime - nowTime;
        System.out.println("oneByOneLoop运行时长" + avgNowTime + "毫秒");
        System.out.println("-----------------------------------------");


        System.out.println("结论第二种算法比第一种快  也就是说好的算法 可以大大优化你的运算速度");

    }


    /**
     * 基本的for循环
     * 需要执行很多次 计算 1+2+3...+100
     */
    private static int oneByOneLoop() {
        //返回值
        int res = 0;
        //最大值 int 10亿以内  9位
        int n = 999999999;
        //初始值
        int i;
        //循环体
        for (i = 1; i <= n; i++) {
            res += i;
        }
        System.out.println("oneByOneLoop循环的次数:" + i);
        System.out.println("oneByOneLoo返回值:" + res);
        return res;
    }

    /**
     * 学习了算法之后
     */
    private static int oneTimeLoop() {
        //返回值
        int res = 0;
        //最大值
        int n = 999999999;
        //初始值
        int i = 1;

        res = (i + n) * n / 2;
        System.out.println("oneTimeLoop循环的次数:" + 1);
        System.out.println("oneTimeLoop返回值:" + res);
        return res;
    }
}
