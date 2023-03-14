package com.itheima.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.itheima.domain.Book;
import org.apache.ibatis.annotations.Mapper;

/**
 * 作者:qm
 * 时间:2023/2/25
 */
@Mapper
public interface BookDao  extends BaseMapper<Book> {

}
