package com.sky.service;

import com.sky.dto.UserLoginDTO;
import com.sky.entity.User;

/**
 * ClassName: UserService
 * Package: com.sky.service
 * Description:
 *
 * @Author: 吴佳
 * @Create: 2024/4/27 - 17:05
 * @Version: v1.0
 */
public interface UserService {
    /**
     * 微信登陆
     * @param userLoginDTO
     * @return
     */
    User wxLogin(UserLoginDTO userLoginDTO);
}
