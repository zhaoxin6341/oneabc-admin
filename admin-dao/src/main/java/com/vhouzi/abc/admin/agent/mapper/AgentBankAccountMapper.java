package com.vhouzi.abc.admin.agent.mapper;

import com.vhouzi.abc.admin.agent.domain.AgentBankAccount;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AgentBankAccountMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_tr_bank_account
     *
     * @mbggenerated Tue Dec 31 13:50:38 CST 2019
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_tr_bank_account
     *
     * @mbggenerated Tue Dec 31 13:50:38 CST 2019
     */
    int insert(AgentBankAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_tr_bank_account
     *
     * @mbggenerated Tue Dec 31 13:50:38 CST 2019
     */
    AgentBankAccount selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_tr_bank_account
     *
     * @mbggenerated Tue Dec 31 13:50:38 CST 2019
     */
    List<AgentBankAccount> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member_tr_bank_account
     *
     * @mbggenerated Tue Dec 31 13:50:38 CST 2019
     */
    int updateByPrimaryKey(AgentBankAccount record);
}