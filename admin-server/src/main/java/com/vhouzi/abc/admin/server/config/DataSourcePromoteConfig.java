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
@MapperScan(basePackages = "com.vhouzi.abc.admin.promote.mapper",
        sqlSessionFactoryRef = "promoteSqlSessionFactory")
public class DataSourcePromoteConfig {

    @Bean(name = "promoteDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.druid.promote")
    public DataSource baseDataSource() {
        return DruidDataSourceBuilder.create().build();
    }

    @Bean(name = "promoteSqlSessionFactory")
    public SqlSessionFactory baseSqlSessionFactory(@Qualifier("promoteDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath*:/mapper/promote/*.xml"));
        bean.setTypeAliasesPackage("com.vhouzi.abc.admin.promote.domain");
        return bean.getObject();
    }

    @Bean(name = "promoteTransactionManager")
    public DataSourceTransactionManager baseTransactionManager(@Qualifier("promoteDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "promoteSqlSessionTemplate")
    public NamedParameterJdbcTemplate testSqlSessionTemplate(@Qualifier("promoteDataSource") DataSource dataSource) throws Exception {
        return new NamedParameterJdbcTemplate(dataSource);
    }


}
