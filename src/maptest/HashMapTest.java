package maptest;

import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author cxc
 * @date 2018/12/19 09:39
 */
public class HashMapTest {
    public static void main(String[] args) {
        HashMap<String, Object> map = new HashMap<String, Object>(12);
        map.put("1", 1);
        ConcurrentHashMap<String, Object> stringObjectConcurrentHashMap = new ConcurrentHashMap<>(12);
        stringObjectConcurrentHashMap.put("ket",1);

    }
}
