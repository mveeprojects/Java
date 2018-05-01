import com.hazelcast.client.HazelcastClient;
import com.hazelcast.client.config.ClientConfig;
import com.hazelcast.config.GroupConfig;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;

import java.util.Map;

class Client {

    Client() {
        startClient();
    }

    private void startClient() {
        ClientConfig clientConfig = new ClientConfig();
        GroupConfig groupConfig = clientConfig.getGroupConfig();
        groupConfig.setName("someName");
        groupConfig.setPassword("pass");
        HazelcastInstance hazelcastClient = HazelcastClient.newHazelcastClient(clientConfig);
        IMap<Long, String> map = hazelcastClient.getMap("data");
        for (Map.Entry<Long, String> entry : map.entrySet()){
            System.out.println(entry.getValue());
        }
    }
}
