package entity;

import java.util.HashSet;
import java.util.Hashtable;

/**
 * @author Xiang Lan
 * Created on 2019-05-11 16:31
 */
public class Hash {

    public static void main(String[] args) {
        Hashtable<Integer,Integer> hashtable = new Hashtable<>();
        HashSet<Integer> hashSet = new HashSet<>();

        hashtable.put(1,2);
        hashtable.put(2,2);
        System.out.println(hashtable.get(1));
        System.out.println(hashtable.get(2));

    }
}
