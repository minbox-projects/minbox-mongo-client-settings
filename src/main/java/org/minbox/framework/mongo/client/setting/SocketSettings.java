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

/**
 * The mongo socket settings
 *
 * @author 恒宇少年
 * @see com.mongodb.connection.SocketSettings
 * @since 1.0
 */
@Data
public class SocketSettings {
    /**
     * The socket connect timeout MilliSeconds
     */
    private long connectTimeoutMilliSeconds = 10000;
    /**
     * The socket read timeout MilliSeconds
     */
    private long readTimeoutMilliSeconds = 10000;
    /**
     * The receive buffer size
     */
    private int receiveBufferSize;
    /**
     * The send buffer size
     */
    private int sendBufferSize;
}
