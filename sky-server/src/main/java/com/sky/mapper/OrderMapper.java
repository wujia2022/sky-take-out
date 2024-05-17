package com.sky.mapper;

import com.sky.dto.GoodsSalesDTO;
import com.sky.entity.Orders;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

/**
 * ClassName: OrderMapper
 * Package: com.sky.mapper
 * Description:
 *
 * @Author: 吴佳
 * @Create: 2024/5/12 - 22:29
 * @Version: v1.0
 */
@Mapper
public interface OrderMapper {
    /**
     * 插入订单数据
     * @param orders
     */
    void insert(Orders orders);

    /**
     * 根据订单状态和下单时间查询订单
     * @param status
     * @param orderTime
     * @return
     */
    @Select("select * from orders where status = #{status} and order_time < #{orderTime}")
    List<Orders> getByStatusAndOrderTimeLT(Integer status, LocalDateTime orderTime);

    /**
     * 修改订单信息
     * @param orders
     */
    void update(Orders orders);

    /**
     * 根据动态条件统计营业额数据
     * @param map
     * @return
     */
    Double sumByMap(Map map);
    /**
     * 根据动态条件统计订单数据
     * @param map
     * @return
     */
    Integer countByMap(Map map);

    /**
     * 统计指定时间内的销量排名Top10
     * @param begin
     * @param end
     * @return
     */
    List<GoodsSalesDTO> getSalesTop10(LocalDateTime begin, LocalDateTime end);
}
