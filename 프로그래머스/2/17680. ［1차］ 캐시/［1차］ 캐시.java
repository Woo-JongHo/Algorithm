import java.util.*;

class LRUCache {
    private int cacheSize;
    private ArrayList<String> cache;

    public LRUCache(int cacheSize) {
        this.cacheSize = cacheSize;
        this.cache = new ArrayList<>();
    }

    public int accessCity(String city) {
        city = city.toUpperCase();

        if (cache.contains(city)) {
            cache.remove(city);
            cache.add(city);
            return 1; // Cache hit
        } else {
            if (cache.size() == cacheSize) {
                cache.remove(0);
            }

            cache.add(city);
            return 5; // Cache miss
        }
    }
}

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        LRUCache lruCache = new LRUCache(cacheSize);

        if (cacheSize == 0) {
            return cities.length * 5;
        }

        for (String city : cities) {
            answer += lruCache.accessCity(city);
        }

        return answer;
    }
}