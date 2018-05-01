package redis;

import redis.clients.jedis.Jedis;

import java.util.Set;

class SortedSets {

    private Jedis jedis;
    Set<String> result;

    SortedSets() {
        System.out.println("\n\n************ SORTED SETS ************");
        this.jedis = new Jedis();
        storeSortedSetItems();
        printAllSortedSetItems();
        printAllSortedSetItemsInReverse();
    }

    private void storeSortedSetItems() {
        System.out.println("\nStoring a sorted set of strings in Redis");
        jedis.zadd("mySortedSet", 1, "Bob");
        jedis.zadd("mySortedSet", 4, "Sally");
        jedis.zadd("mySortedSet", 2, "Dave");
    }

    private void printAllSortedSetItems() {
        System.out.println("\nPrinting all values in a sorted set in order according to score");
        result = jedis.zrange("mySortedSet", 0, -1);
        result.forEach(System.out::println);
    }

    private void printAllSortedSetItemsInReverse() {
        System.out.println("\nReversing score order and reprinting");
        result = jedis.zrevrange("mySortedSet", 0, -1);
        result.forEach(System.out::println);
    }
}