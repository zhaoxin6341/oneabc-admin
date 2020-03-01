package com.vhouzi.abc.admin.server.config;

import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * @author xuzj157
 * @date 2020/1/15 11:52
 */
@Configuration
@MapperScan(basePackages = "com.vhouzi.abc.admin.stu.mapper",
        sqlSessionFactoryRef = "stuSqlSessionFactory")
public class DataSourceStuConfig {

    @Bean(name = "stuDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.druid.stu")
    public DataSource baseDataSource() {
        return DruidDataSourceBuilder.create().build();
    }

    @Bean(name = "stuSqlSessionFactory")
    public SqlSessionFactory baseSqlSessionFactory(@Qualifier("stuDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath*:/mapper/stu/*.xml"));
        bean.setTypeAliasesPackage("com.vhouzi.abc.admin.stu.domain");
        return bean.getObject();
    }

    @Bean(name = "stuTransactionManager")
    public DataSourceTransactionManager baseTransactionManager(@Qualifier("stuDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "stuSqlSessionTemplate")
    public NamedParameterJdbcTemplate testSqlSessionTemplate(@Qualifier("stuDataSource") DataSource dataSource) throws Exception {
        return new NamedParameterJdbcTemplate(dataSource);
    }


}
