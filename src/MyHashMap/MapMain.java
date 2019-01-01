package MyHashMap;

/**
 * 测试hashmap
 *
 * @author cxc
 * @date 2018/12/31 14:29
 */
public class MapMain {
    public static void main(String[] args) {
        MyHashMap<String, Object> stringObjectMyHashMap = new MyHashMap<>(6);
        stringObjectMyHashMap.put("1", 1);
        stringObjectMyHashMap.put("2", 2);
        stringObjectMyHashMap.put("3", 3);
        stringObjectMyHashMap.put("4", 4);
        stringObjectMyHashMap.put("5", 5);
        stringObjectMyHashMap.put("6", 6);
        stringObjectMyHashMap.put("16", 16);
        stringObjectMyHashMap.put("16", 17);
        System.out.println(stringObjectMyHashMap.get("16"));
        System.out.println("容器内容" + stringObjectMyHashMap.toString());
        System.out.println("现在容器大小:" + stringObjectMyHashMap.table.length);
    }
}
