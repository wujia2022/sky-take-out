package com.sky.service;

import com.sky.dto.DishDTO;

/**
 * ClassName: DishService
 * Package: com.sky.service
 * Description:
 *
 * @Author: 吴佳
 * @Create: 2024/4/24 - 22:54
 * @Version: v1.0
 */
public interface DishService {
    /**
     * 新增菜品和对应的口味
     * @param dishDTO
     */
    public void saveWithFlavor(DishDTO dishDTO);
}
