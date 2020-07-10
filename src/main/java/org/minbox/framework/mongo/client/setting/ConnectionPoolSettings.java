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

import static java.util.concurrent.TimeUnit.MILLISECONDS;
import static java.util.concurrent.TimeUnit.MINUTES;

/**
 * All settings that relate to the pool of connections to a MongoDB server.
 *
 * @author 恒宇少年
 * @see com.mongodb.connection.ConnectionPoolSettings
 * @since 1.0
 */
@Data
public class ConnectionPoolSettings {
    private int maxSize = 100;
    private int minSize;
    private long maxWaitTimeMilliSeconds = 1000 * 60 * 2;
    private long maxConnectionLifeTimeMilliSeconds;
    private long maxConnectionIdleTimeMilliSeconds;
    private long maintenanceInitialDelayMilliSeconds;
    private long maintenanceFrequencyMilliSeconds = MILLISECONDS.convert(1, MINUTES);
    ;
}
