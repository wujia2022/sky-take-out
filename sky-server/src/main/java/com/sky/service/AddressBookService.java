package com.sky.service;

import com.sky.entity.AddressBook;

import java.util.List;

/**
 * ClassName: AddressBookService
 * Package: com.sky.service
 * Description:
 *
 * @Author: 吴佳
 * @Create: 2024/5/15 - 11:04
 * @Version: v1.0
 */
public interface AddressBookService {
    /**
     * 新增地址
     * @param addressBook
     */
    void save(AddressBook addressBook);

    /**
     * 条件查询
     * @param addressBook
     * @return
     */
    List<AddressBook> list(AddressBook addressBook);

    /**
     * 根据id修改地址
     * @param addressBook
     */
    void update(AddressBook addressBook);

    /**
     * 根据id删除地址
     * @param id
     */
    void deleteById(Long id);

    /**
     * 根据id查询地址
     * @param id
     * @return
     */
    AddressBook getById(Long id);

    /**
     * 设置默认地址
     * @param addressBook
     */
    void setDefault(AddressBook addressBook);
}
