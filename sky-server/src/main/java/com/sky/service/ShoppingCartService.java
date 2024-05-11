package com.sky.service;

import com.sky.dto.ShoppingCartDTO;

/**
 * ClassName: ShoppingCartService
 * Package: com.sky.service
 * Description:
 *
 * @Author: 吴佳
 * @Create: 2024/5/11 - 9:56
 * @Version: v1.0
 */
public interface ShoppingCartService {
    /**
     * 添加购物车
     * @param shoppingCartDTO
     */
    public void addShoppingCart(ShoppingCartDTO shoppingCartDTO);
}
