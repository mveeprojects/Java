package redis;

import redis.clients.jedis.Jedis;

class Basics {

    private Jedis jedis;

    Basics() {
        System.out.println("\n\n************ BASIC OPERATIONS ************");
        this.jedis = new Jedis();
        storeString();
        retrieveString();
    }

    private void storeString() {
        System.out.println("\nStoring String in Redis");
        jedis.set("someKey", "hi there");
    }

    private void retrieveString() {
        System.out.println("\nRetrieving String from Redis");
        System.out.println(jedis.get("someKey"));
    }
}