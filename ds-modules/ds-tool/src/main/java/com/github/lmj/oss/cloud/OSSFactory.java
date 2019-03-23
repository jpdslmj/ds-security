package com.github.lmj.oss.cloud;

import com.github.lmj.config.CloudStorageConfig;
import com.github.lmj.oss.constants.OSSConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 文件上传Factory
 */
@Component
public class OSSFactory {
    @Autowired
    private CloudStorageConfig config;

    public CloudStorageService build() {
        if (config.getType().equals(OSSConstant.TYPE_QINIU)) {
            return new QiniuCloudStorageService(config);
        } else if (config.getType().equals(OSSConstant.TYPE_ALIYUN)) {
            return new AliyunCloudStorageService(config);
        } else if (config.getType().equals(OSSConstant.TYPE_QCLOUD)) {
            return new QcloudCloudStorageService(config);
        }
        return null;
    }

}
