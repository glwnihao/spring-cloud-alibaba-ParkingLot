package com.mall.parking.resource.mapper;

import com.mall.parking.resource.entity.Brake;
import com.mall.parking.resource.entity.BrakeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BrakeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table brake
     *
     * @mbg.generated Mon Jan 06 15:16:46 CST 2020
     */
    long countByExample(BrakeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table brake
     *
     * @mbg.generated Mon Jan 06 15:16:46 CST 2020
     */
    int deleteByExample(BrakeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table brake
     *
     * @mbg.generated Mon Jan 06 15:16:46 CST 2020
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table brake
     *
     * @mbg.generated Mon Jan 06 15:16:46 CST 2020
     */
    int insert(Brake record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table brake
     *
     * @mbg.generated Mon Jan 06 15:16:46 CST 2020
     */
    int insertSelective(Brake record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table brake
     *
     * @mbg.generated Mon Jan 06 15:16:46 CST 2020
     */
    List<Brake> selectByExample(BrakeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table brake
     *
     * @mbg.generated Mon Jan 06 15:16:46 CST 2020
     */
    Brake selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table brake
     *
     * @mbg.generated Mon Jan 06 15:16:46 CST 2020
     */
    int updateByExampleSelective(@Param("record") Brake record, @Param("example") BrakeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table brake
     *
     * @mbg.generated Mon Jan 06 15:16:46 CST 2020
     */
    int updateByExample(@Param("record") Brake record, @Param("example") BrakeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table brake
     *
     * @mbg.generated Mon Jan 06 15:16:46 CST 2020
     */
    int updateByPrimaryKeySelective(Brake record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table brake
     *
     * @mbg.generated Mon Jan 06 15:16:46 CST 2020
     */
    int updateByPrimaryKey(Brake record);
}