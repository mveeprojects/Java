import com.hazelcast.core.Hazelcast;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IdGenerator;

import java.util.Map;

class Server {

    Server() {
        startServer();
    }

    private void startServer() {
        HazelcastInstance hzInstance = Hazelcast.newHazelcastInstance();
        Map<Long, String> map = hzInstance.getMap("data");
        IdGenerator idGenerator = hzInstance.getIdGenerator("newId");
        for(int i = 0; i < 10; i++){
            map.put(idGenerator.newId(), "message " + i);
        }
    }
}
