package com.springbootlearning.chapter04springboot3.bean;

/**
 * ClassName: User
 * Package: com.springbootlearning.chapter04springboot3.bean
 * Description:
 *
 * @Author: Steven_LIU
 * @Create: 2024/9/30
 */
public class User {
    private String name;
    private Long id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
