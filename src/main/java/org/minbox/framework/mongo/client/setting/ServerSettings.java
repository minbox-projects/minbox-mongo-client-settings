package org.minbox.framework.mongo.client.setting;

import lombok.Data;

/**
 * Settings relating to monitoring of each server.
 *
 * @author 恒宇少年
 * @see com.mongodb.connection.ServerSettings
 * @since 1.0
 */
@Data
public class ServerSettings {
    private long heartbeatFrequencyMilliSeconds = 10000;
    private long minHeartbeatFrequencyMilliSeconds = 500;
}
