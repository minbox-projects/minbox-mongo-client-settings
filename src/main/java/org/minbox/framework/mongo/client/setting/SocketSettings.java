package org.minbox.framework.mongo.client.setting;

import lombok.Data;

/**
 * The mongo socket settings
 *
 * @see com.mongodb.connection.SocketSettings
 */
@Data
public class SocketSettings {
    /**
     * The socket connect timeout milliseconds
     */
    private long connectTimeoutMilliseconds = 10000;
    /**
     * The socket read timeout milliseconds
     */
    private long readTimeoutMilliseconds;
    /**
     * The receive buffer size
     */
    private int receiveBufferSize;
    /**
     * The send buffer size
     */
    private int sendBufferSize;
}
