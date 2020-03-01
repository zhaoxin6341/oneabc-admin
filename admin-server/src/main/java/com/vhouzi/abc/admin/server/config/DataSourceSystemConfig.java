package com.vhouzi.abc.admin.server.config;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * @author xuzj157
 * @date 2020/1/15 11:52
 */
@Configuration
@MapperScan(basePackages = "com.vhouzi.abc.admin.system.mapper",
        sqlSessionFactoryRef = "systemSqlSessionFactory")
public class DataSourceSystemConfig {

    @Primary
    @Bean(name = "systemDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.druid.system")
    public DataSource baseDataSource() {
        return DruidDataSourceBuilder.create().build();
    }

    @Primary
    @Bean(name = "systemSqlSessionFactory")
    public SqlSessionFactory baseSqlSessionFactory(@Qualifier("systemDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        Resource[] systemResources = new PathMatchingResourcePatternResolver().getResources("classpath*:mapper/system/*Mapper*.xml");
        Resource[] quartzResources = new PathMatchingResourcePatternResolver().getResources("classpath*:mapper/quartz/*Mapper*.xml");
        Resource[] resources = new Resource[systemResources.length+quartzResources.length];
        int i = 0;
        for(; i <systemResources.length; i ++){
            resources[i] = systemResources[i];
        }
        for(int j = 0; j < quartzResources.length; j ++, i++){
            resources[i] = quartzResources[j];
        }
        bean.setMapperLocations(resources);
        bean.setTypeAliasesPackage("com.vhouzi.abc.quartz.domain,com.vhouzi.abc.admin.system.domain");
        return bean.getObject();
    }

    @Primary
    @Bean(name = "systemTransactionManager")
    public DataSourceTransactionManager baseTransactionManager(@Qualifier("systemDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Primary
    @Bean(name = "systemSqlSessionTemplate")
    public NamedParameterJdbcTemplate testSqlSessionTemplate(@Qualifier("systemDataSource") DataSource dataSource) throws Exception {
        return new NamedParameterJdbcTemplate(dataSource);
    }


}
