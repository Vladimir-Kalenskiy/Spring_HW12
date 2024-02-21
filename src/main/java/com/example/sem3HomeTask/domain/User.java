package com.example.sem3HomeTask.domain;


import lombok.Data;

/**
 * Обьект пользователь.
 */
@Data
public class User {

    /**
     * Имя пользователя
     */
    private String name;

    /**
     * Возраст пользователя
     */
    private int age;
    /**
     * Почтовый адрес пользователя
     */
    private String email;

}
