package org.sang.controller;

import org.sang.bean.Category;
import org.sang.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/admin/category")
@RestController
public class CategoryController {
    @Autowired
    CategoryService categoryService;
    @RequestMapping(value = "/all",method = RequestMethod.GET)
    public List<Category> getAllCategories(){
        return  categoryService.getAllCategories();
    }


}
