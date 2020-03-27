package com.tianfeng.demo.springannotion.config;

import com.tianfeng.demo.springannotion.bean.Color;
import com.tianfeng.demo.springannotion.condition.MyImportSelector;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Import 往容器中导入组件  @Import({"","",""})
 *     1.默认是全类名
 * @ImportSelector  返回需要导入组件的全类名数组
 */
@Import({Color.class, MyImportSelector.class})
@Configuration
public class MainConfig01 {
}
