package redis;

import redis.clients.jedis.Jedis;

import java.util.Set;

class Sets {

    private Jedis jedis;

    Sets() {
        System.out.println("\n\n************ SETS ************");
        this.jedis = new Jedis();
        storeSetItems();
        printAllSetItems();
    }

    private void storeSetItems() {
        System.out.println("\nStoring a set of strings in Redis");
        jedis.sadd("marksSet", "value1");
        jedis.sadd("marksSet", "value2");
        jedis.sadd("marksSet", "value1");
    }

    private void printAllSetItems() {
        System.out.println("\nPrinting all values in a set from Redis");
        Set<String> result = jedis.smembers("marksSet");
        result.forEach(System.out::println);
    }
}