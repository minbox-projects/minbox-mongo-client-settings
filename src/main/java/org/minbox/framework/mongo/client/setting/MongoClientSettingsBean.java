package org.minbox.framework.mongo.client.setting;

import lombok.Data;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

/**
 * The {@link com.mongodb.MongoClientSettings} encapsulated bean
 *
 * @author 恒宇少年
 */
@Data
public class MongoClientSettingsBean {
    /**
     * The socket settings
     */
    @NestedConfigurationProperty
    private SocketSettings socket;
    /**
     * The heartbeat socket settings
     */
    @NestedConfigurationProperty
    private SocketSettings heartbeatSocket;
}
