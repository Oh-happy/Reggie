package com.itheima;

import com.itheima.domain.Book;
import com.itheima.dao.BookDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class MybatisPlusSpringBootDemo1ApplicationTests {

    @Autowired
    private BookDao bookDao;

    @Test
    void testGetAll() {
        List<Book> books = bookDao.selectList(null);
        System.out.println(books);
    }

}
