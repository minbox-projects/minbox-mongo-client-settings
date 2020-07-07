package org.minbox.framework.mongo.client.setting;

import lombok.Data;

/**
 * Settings for connecting to MongoDB via SSL.
 *
 * @author 恒宇少年
 * @see com.mongodb.connection.SslSettings
 * @since 1.0
 */
@Data
public class SslSettings {
    private boolean enabled;
    private boolean invalidHostNameAllowed;
}
