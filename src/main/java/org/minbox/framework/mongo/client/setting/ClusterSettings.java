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
    private ClusterType requiredClusterType;
    private String requiredReplicaSetName;
    private long localThresholdMilliSeconds;
    private long serverSelectionTimeoutMilliSeconds;
}
