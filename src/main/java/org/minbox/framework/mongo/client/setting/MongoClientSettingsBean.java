/*
 *    Copyright [2019 - 2020] [恒宇少年 - 于起宇]
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.minbox.framework.mongo.client.setting;

import lombok.Data;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

/**
 * The {@link com.mongodb.MongoClientSettings} encapsulated bean
 *
 * @author 恒宇少年
 * @since 1.0
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

    /**
     * The cluster settings
     */
    @NestedConfigurationProperty
    private ClusterSettings cluster;

    /**
     * Settings relating to monitoring of each server.
     */
    @NestedConfigurationProperty
    private ServerSettings server;

    /**
     * All settings that relate to the pool of connections to a MongoDB server.
     */
    @NestedConfigurationProperty
    private ConnectionPoolSettings connectionPool;

    /**
     * Settings for connecting to MongoDB via SSL.
     */
    @NestedConfigurationProperty
    private SslSettings ssl;
}
