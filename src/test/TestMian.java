package test;

import com.sun.org.apache.bcel.internal.generic.NEW;
import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;
import threadtest.volatiletest.VolatileDemo;

import javax.xml.validation.Validator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author cxc
 * @date 2018/12/29 09:43
 */
public class TestMian {
     static volatile  int i=20000;
    public static void main(String[] args){


        ExecutorService executorService = Executors.newFixedThreadPool(100);
        //Order order= new Order(); //只有一个
        while(i!=0){
           i-=1;
            Order order= new Order();  //每次new一个
            order.setId(i);

            executorService.submit( new Runnable(){
                @Override
                public void run(){
                    try {
                        Thread.sleep(1000);
                        System.out.println(order.toString());
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            });
            System.out.println("i的结果:"+i);
        }
    }
}
