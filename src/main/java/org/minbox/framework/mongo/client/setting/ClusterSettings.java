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

import com.mongodb.connection.ClusterConnectionMode;
import com.mongodb.connection.ClusterType;
import lombok.Data;

/**
 * Settings for the cluster.
 *
 * @author 恒宇少年
 * @see com.mongodb.connection.ClusterSettings
 * @since 1.0
 */
@Data
public class ClusterSettings {
    private ClusterConnectionMode mode;
    private ClusterType requiredClusterType = ClusterType.UNKNOWN;
    private String requiredReplicaSetName;
    private long localThresholdMilliSeconds = 15;
    private long serverSelectionTimeoutMilliSeconds = 30000;
}
