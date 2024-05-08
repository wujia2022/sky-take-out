package com.sky.service;

import com.sky.entity.Setmeal;
import com.sky.vo.DishItemVO;

import java.util.List;

/**
 * ClassName: SetmealService
 * Package: com.sky.service
 * Description:
 *
 * @Author: 吴佳
 * @Create: 2024/4/29 - 9:05
 * @Version: v1.0
 */
public interface SetmealService {
    /**
     * 条件查询
     * @param setmeal
     * @return
     */
    List<Setmeal> list(Setmeal setmeal);
    /**
     * 根据id查询菜品选项
     * @param id
     * @return
     */

    List<DishItemVO> getDishItemById(Long id);
}
