package com.example.disconf.service;

import com.baidu.disconf.client.common.annotations.DisconfFile;
import com.baidu.disconf.client.common.annotations.DisconfFileItem;
import com.baidu.disconf.client.common.annotations.DisconfUpdateService;
import com.baidu.disconf.client.common.update.IDisconfUpdate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author xin.huang
 * @version v1.0
 * @date 2018/6/8 10:29
 */
@Service
@DisconfFile(filename = "demo_para.properties")
@DisconfUpdateService(classes = { DemoParam.class })
public class DemoParam implements IDisconfUpdate {
    private Logger logger= LoggerFactory.getLogger(getClass());

    private String flag;

    private String url;

    @DisconfFileItem(name = "demo.flag",associateField="flag")
    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    @DisconfFileItem(name = "demo.url",associateField="url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "DemoPara{" +
                "flag='" + flag + '\'' +
                ", url='" + url + '\'' +
                '}';
    }

    @Override
    public void reload() throws Exception {
        logger.info("配置文件更新了！更新为：[{}]",this.toString());
    }
}
