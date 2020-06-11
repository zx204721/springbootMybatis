package top.zz6628.mybatis;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.core.exceptions.MybatisPlusException;
import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author zhenz
 * @description
 * @date 2020/6/11 2:15
 */
public class MybatisPlusGenerate {

    /**
     * <p>
     * 读取控制台内容
     * </p>
     */
    public static String scanner(String tip) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder help = new StringBuilder();
        help.append("请输入" + tip + "：");
        System.out.println(help.toString());
        if (scanner.hasNext()) {
            String ipt = scanner.next();
            if (StringUtils.isNotEmpty(ipt)) {
                return ipt;
            }
        }
        throw new MybatisPlusException("请输入正确的" + tip + "！");
    }

    public static void main(String[] args) {
        AutoGenerator mpg = new AutoGenerator();
        // =============================全局配置===============================
        mpg.setGlobalConfig(new GlobalConfig()
                // 覆盖输出到xxx目录
                .setFileOverride(true).setOutputDir("D:\\coding\\github\\springbootMybatis\\src\\main\\java")
//                .setFileOverride(true).setOutputDir("D://wly")
                // 主键生成策略 生成BaseResultMap
                .setIdType(IdType.AUTO).setBaseResultMap(true)
                // 指定作者
                .setAuthor("zz")
                // 设置Controller、Service、ServiceImpl、Dao、Mapper文件名称，%s是依据表名转换来的
                .setControllerName("%sController").setServiceName("MP%sService").setServiceImplName("%sServiceImpl").setMapperName("%sDao").setXmlName("%sMapper"));
        // ================================数据源配置============================
        mpg.setDataSource(new DataSourceConfig()
                // 用户名、密码、驱动、url
                .setUsername("admin").setPassword("123456")
                .setDbType(DbType.MYSQL).setDriverName("com.mysql.cj.jdbc.Driver")
                .setUrl("jdbc:mysql://192.168.131.130:3306/sms?useUnicode=true&characterEncoding=utf-8")
        );
        // ===============================包名配置：父包.模块.controller===============================
        mpg.setPackageInfo(new PackageConfig().setModuleName("test")
                // 父包名 模块名
                .setParent("top.zz6628.mybatis")
                // 分层包名
                .setController("controller").setService("service").setServiceImpl("service.impl").setMapper("mapper"));
        // =====================================策略配置==================================
        mpg.setStrategy(new StrategyConfig()
                // 命名策略：实体的类名和属性名按下划线转驼峰 user_info -> userInfo
                .setNaming(NamingStrategy.underline_to_camel)
                // controller生成@RestCcontroller
                .setRestControllerStyle(true));
        // 执行生成
        mpg.execute();
    }

}
