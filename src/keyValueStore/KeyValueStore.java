
/*
    Problem: Implement a key value store, where keys and values are integers, with the following methods:

    update(key, vl): updates the value at key to val, or sets it if doesn't exist
    
    get(key): returns the value with key, or None if no such value exists
    
    max_key(val): returns the largest key with value val, or None if no key with that value exists
    
    For example, if we ran the following calls:

    kv.update(1, 1)
    kv.update(2, 1)
    And then called kv.max_key(1), it should return 2, since it's the largest key with value 1.
    
    This problem was asked in here: https://www.dailycodingproblem.com/ by Google
 */

package keyValueStore;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class KeyValueStore
{
    private Map<Integer, Integer> keyValueStorage = null;
    
    public KeyValueStore()
    {
        keyValueStorage = new LinkedHashMap <>();
    }
    
    public void update(int key, int value)
    {
        if(keyValueStorage.containsKey(key))
        {
            keyValueStorage.replace(key, value);
        }
        else
        {
            keyValueStorage.put(key, value);
        }
    }
    
    public Integer get(int key)
    {
        return keyValueStorage.getOrDefault(key, null);
    }
    
    public Integer max_key(int value)
    {
        
        if(keyValueStorage.containsValue(value))
        {
            Set<Integer> keySet = new LinkedHashSet <>();
            
            keyValueStorage.entrySet().forEach(e ->
            {
                if(e.getValue().equals(value))
                {
                    keySet.add(e.getKey());
                }
            });
            
            List<Integer> keys = keySet.stream().sorted().collect(Collectors.toList());
            return keys.get(keys.size()-1);
        }
        return null;
    }
    
    public static void main(String[] args)
    {
        KeyValueStore keyValueStore = new KeyValueStore();
        keyValueStore.update(1, 1);
        keyValueStore.update(2, 1);
        System.out.println(keyValueStore.max_key(1));
    }
}
