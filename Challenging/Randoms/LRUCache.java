//ONE METHOD :
// Create cache
final int MAX_ENTRIES = 100;
Map cache = new LinkedHashMap(MAX_ENTRIES+1, .75F, true) {
    // This method is called just after a new entry has been added
    public boolean removeEldestEntry(Map.Entry eldest) {
        return size() > MAX_ENTRIES;
    }
};

// Add to cache
Object key = "key";
cache.put(key, object);

// Get object
Object o = cache.get(key);
if (o == null && !cache.containsKey(key)) {
    // Object not in cache. If null is not a possible value in the cache,
    // the call to cache.contains(key) is not needed
}

// If the cache is to be used by multiple threads,
// the cache must be wrapped with code to synchronize the methods
cache = (Map)Collections.synchronizedMap(cache);




//ANOTHER IMPLEMENTATION
public class Cache<K,V> {
final Map<K,V> MRUdata;
final Map<K,V> LRUdata;

public Cache(final int capacity)
{
    LRUdata = new WeakHashMap<K, V>();

    MRUdata = new LinkedHashMap<K, V>(capacity+1, 1.0f, true) {
        protected boolean removeEldestEntry(Map.Entry<K,V> entry)
        {
            if (this.size() > capacity) {
                LRUdata.put(entry.getKey(), entry.getValue());
                return true;
            }
            return false;
        };
    };
}

public synchronized V tryGet(K key)
{
    V value = MRUdata.get(key);
    if (value!=null)
        return value;
    value = LRUdata.get(key);
    if (value!=null) {
        LRUdata.remove(key);
        MRUdata.put(key, value);
    }
    return value;
}

public synchronized void set(K key, V value)
{
    LRUdata.remove(key);
    MRUdata.put(key, value);
}
}





//OR 
class LRUCache<E> {

    @SuppressWarnings("unchecked")
    LRUCache(int size)
    {
        fCacheSize = size;

        // If the cache is to be used by multiple threads,
        // the hashMap must be wrapped with code to synchronize 
        fCacheMap = Collections.synchronizedMap
        (
            //true = use access order instead of insertion order
            new LinkedHashMap<Object,E>(fCacheSize, .75F, true)
            {                                
                @Override
                public boolean removeEldestEntry(Map.Entry eldest)  
                {
                    //when to remove the eldest entry
                    return size() > 99 ;   //size exceeded the max allowed
                }
            }
        );
    }

    public void put(Object key, E elem)
    {
        fCacheMap.put(key, elem);
    }

    public E get(Object key)
    {
        return fCacheMap.get(key);
    }

    private Map<Object,E> fCacheMap;
    private int fCacheSize;
}