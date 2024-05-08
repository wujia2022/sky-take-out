package com.sky.service.impl;

import com.sky.entity.Setmeal;
import com.sky.mapper.SetmealDishMapper;
import com.sky.mapper.SetmealMapper;
import com.sky.service.SetmealService;
import com.sky.vo.DishItemVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * ClassName: SetmealServiceImpl
 * Package: com.sky.service.impl
 * Description:套餐业务实现
 *
 * @Author: 吴佳
 * @Create: 2024/4/29 - 9:05
 * @Version: v1.0
 */
@Service
public class SetmealServiceImpl implements SetmealService {
    @Autowired
    private SetmealMapper setmealMapper;

    /**
     * 条件查询
     * @param setmeal
     * @return
     */
    @Override
    public List<Setmeal> list(Setmeal setmeal) {
        List<Setmeal> list = setmealMapper.list(setmeal);
        return list;
    }
    /**
     * 根据id查询菜品选项
     * @param id
     * @return
     */

    @Override
    public List<DishItemVO> getDishItemById(Long id) {
        return setmealMapper.getDishItemById(id);
    }

}
