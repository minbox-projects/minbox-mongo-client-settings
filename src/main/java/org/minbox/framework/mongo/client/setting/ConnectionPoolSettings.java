package org.minbox.framework.mongo.client.setting;

import lombok.Data;

/**
 * All settings that relate to the pool of connections to a MongoDB server.
 *
 * @author 恒宇少年
 * @see com.mongodb.connection.ConnectionPoolSettings
 * @since 1.0
 */
@Data
public class ConnectionPoolSettings {
    private int maxSize;
    private int minSize;
    private long maxWaitTimeMilliSeconds;
    private long maxConnectionLifeTimeMilliSeconds;
    private long maxConnectionIdleTimeMilliSeconds;
    private long maintenanceInitialDelayMilliSeconds;
    private long maintenanceFrequencyMilliSeconds;
}
