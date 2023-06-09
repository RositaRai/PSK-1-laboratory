package it.vu.mybatis.dao;

import java.util.List;
import it.vu.mybatis.model.Activities;
import org.mybatis.cdi.Mapper;

@Mapper
public interface ActivitiesMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.ACTIVITIES
     *
     * @mbg.generated Thu May 04 19:32:59 EEST 2023
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.ACTIVITIES
     *
     * @mbg.generated Thu May 04 19:32:59 EEST 2023
     */
    int insert(Activities record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.ACTIVITIES
     *
     * @mbg.generated Thu May 04 19:32:59 EEST 2023
     */
    Activities selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.ACTIVITIES
     *
     * @mbg.generated Thu May 04 19:32:59 EEST 2023
     */
    List<Activities> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.ACTIVITIES
     *
     * @mbg.generated Thu May 04 19:32:59 EEST 2023
     */
    int updateByPrimaryKey(Activities record);
}