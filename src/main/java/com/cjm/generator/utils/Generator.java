package com.cjm.generator.utils;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author CJM
 * @Date 2020/10/26  12:14
 */
public class Generator {
    public static void main(String[] args) throws Exception {
        List<String> warnings=new ArrayList<String>();
        boolean overwrite=true;
        File configFile=new File("D:/Maven/mybatis-generator1/src/main/resources/mybatis-generator.xml");
        ConfigurationParser cp=new ConfigurationParser(warnings);
        Configuration config=cp.parseConfiguration(configFile);                 //IOException, XMLParserException
        DefaultShellCallback callback=new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator=new MyBatisGenerator(config,callback,warnings);//InvalidConfigurationException
        myBatisGenerator.generate(null);                    // SQLException, InterruptedException
    }
}
