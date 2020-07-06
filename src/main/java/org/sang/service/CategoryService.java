package org.sang.service;

import org.sang.bean.Category;
import org.sang.mapper.CategoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;

@Service
@Transactional
public class CategoryService {
    @Autowired
    CategoryMapper categoryMapper;

    public boolean deleteCategoryByIds(String ids){
        String[] split = ids.split(",");
        int result = categoryMapper.deleteCategoryByIds(split);
        return result == split.length;
    }
    public  int updateCategoryById(Category category){
        return  categoryMapper.updateCategoryById(category);
    }

    public  int addCategory(Category category){
        category.setDate(new Timestamp(System.currentTimeMillis()));
        return categoryMapper.addCategory(category);
    }

    public
}