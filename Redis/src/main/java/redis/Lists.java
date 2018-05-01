package redis;

import redis.clients.jedis.Jedis;

import java.util.List;

class Lists {

    private Jedis jedis;

    Lists() {
        System.out.println("\n\n************ LISTS ************");
        this.jedis = new Jedis();
        storeListItems();
        retrieveFirstListItem();
        retrieveLastListItem();
        retrieveWholeList();
        popFirstListItem();
        popLastListItem();
        trimList();
    }

    private void storeListItems() {
        System.out.println("\nStoring list of strings in Redis");
        jedis.lpush("queue#tasks", "firstItem");
        jedis.lpush("queue#tasks", "secondItem");
    }

    private void retrieveFirstListItem() {
        System.out.println("\nRetieving first item in list without popping it");
        System.out.println(jedis.lrange("queue#tasks", 0, 0));
    }

    private void retrieveLastListItem() {
        System.out.println("\nRetieving last item in list without popping it");
        System.out.println(jedis.lrange("queue#tasks", -1, -1));
    }

    private void retrieveWholeList() {
        System.out.println("\nRetieving all list items");
        List<String> list = jedis.lrange("queue#tasks", 0, -1);
        list.forEach(System.out::println);
    }

    private void popFirstListItem() {
        System.out.println("\nRemoving (popping) first item in list");
        jedis.rpop("queue#tasks");
    }

    private void popLastListItem() {
        System.out.println("\nRemoving (popping) last item in list");
        jedis.lpop("queue#tasks");
    }

    private void trimList() {
        System.out.println("\nRemoving 2 list items of a certain value and printing resulting list");
        jedis.lrem("queue#tasks", 2, "secondItem");
        jedis.lrem("queue#tasks", 4, "firstItem");
        retrieveWholeList();
    }
}