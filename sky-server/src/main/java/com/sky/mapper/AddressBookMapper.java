package com.sky.mapper;

import com.sky.entity.AddressBook;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * ClassName: AddressBookMapper
 * Package: com.sky.mapper
 * Description:
 *
 * @Author: 吴佳
 * @Create: 2024/5/12 - 22:31
 * @Version: v1.0
 */
@Mapper
public interface AddressBookMapper {
    @Select("select * from address_book where id = #{id}")
    AddressBook getById(Long id);
}
